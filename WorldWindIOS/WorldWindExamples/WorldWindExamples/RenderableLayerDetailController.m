/*
 Copyright (C) 2013 United States Government as represented by the Administrator of the
 National Aeronautics and Space Administration. All Rights Reserved.
 
 @version $Id$
 */

#import <WorldWind/WWRenderableLayer.h>
#import "RenderableLayerDetailController.h"
#import "WWLog.h"
#import "WorldWindConstants.h"


@implementation RenderableLayerDetailController

- (RenderableLayerDetailController*) initWithLayer:(WWRenderableLayer*)layer
{
    if (layer == nil)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Layer is nil")
    }

    self = [super initWithStyle:UITableViewStyleGrouped];

    _layer = layer;

    return self;
}

- (NSInteger) numberOfSectionsInTableView:(UITableView*)tableView
{
    return 2;
}

- (NSInteger) tableView:(UITableView*)tableView numberOfRowsInSection:(NSInteger)section
{
    switch (section)
    {
        case 0:
            return 1;
        case 1:
            return [[_layer renderables] count];
        default:
            return 0;
    }
}

- (NSString*) tableView:(UITableView*)tableView titleForHeaderInSection:(NSInteger)section
{
    switch (section)
    {
        case 0:
            return @"Layer Controls";
        case 1:
            return @"Layer Contents";
        default:
            return @"Empty";
    }
}

- (UITableViewCell*) tableView:(UITableView*)tableView cellForRowAtIndexPath:(NSIndexPath*)indexPath
{
    UITableViewCell* cell = nil;

    if ([indexPath section] == 0)
    {
        static NSString* layerControlCellIdentifier = @"LayerControlCellIdentifier";
        static NSInteger sliderTag = 1;

        cell = [tableView dequeueReusableCellWithIdentifier:layerControlCellIdentifier];
        if (cell == nil)
        {
            cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:layerControlCellIdentifier];
            [[cell textLabel] setText:@"Opacity"];
            UISlider* slider = [[UISlider alloc] init];
            [slider setTag:sliderTag];
            [slider addTarget:self action:@selector(opacityValueChanged:) forControlEvents:UIControlEventValueChanged];
            [cell setAccessoryView:slider];
        }

        // Initialize slider to the layer's current value.
        UISlider* slider = (UISlider*) [[cell accessoryView] viewWithTag:sliderTag];
        [slider setValue:[_layer opacity]];
    }
    else if ([indexPath section] == 1)
    {
        static NSString* layerContentsCellIdentifier = @"LayerContentsCellIdentifier";

        cell = [tableView dequeueReusableCellWithIdentifier:layerContentsCellIdentifier];
        if (cell == nil)
        {
            cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:layerContentsCellIdentifier];
        }

        id <WWRenderable> r = [[_layer renderables] objectAtIndex:(NSUInteger) [indexPath row]];
        NSString* displayName = [r displayName];
        [[cell textLabel] setText:displayName != nil ? displayName : @"Renderable"];
    }

    return cell;
}

- (void) opacityValueChanged:(UISlider*)opacitySlider
{
    [_layer setOpacity:[opacitySlider value]];

    NSNotification* redrawNotification = [NSNotification notificationWithName:WW_REQUEST_REDRAW object:self];
    [[NSNotificationCenter defaultCenter] postNotification:redrawNotification];
}

@end