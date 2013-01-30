/*
 Copyright (C) 2013 United States Government as represented by the Administrator of the
 National Aeronautics and Space Administration. All Rights Reserved.
 
 @version $Id$
 */

#import "LayerListController.h"
#import "WorldWind/WorldWindView.h"
#import "WorldWind/Render/WWSceneController.h"
#import "WorldWind/Layer/WWLayerList.h"
#import "WorldWind/Layer/WWLayer.h"

@implementation LayerListController

- (LayerListController*) initWithWorldWindView:(WorldWindView*)wwv
{
    self = [super initWithStyle:UITableViewStylePlain];

    _wwv = wwv;

    return self;
}

- (NSInteger) numberOfSectionsInTableView:(UITableView*)tableView
{
    return 1;
}

- (NSInteger) tableView:(UITableView*)tableView numberOfRowsInSection:(NSInteger)section
{
    return [[[_wwv sceneController] layers] count];
}

- (void) tableView:(UITableView*)tableView didSelectRowAtIndexPath:(NSIndexPath*)indexPath
{
    // Set the selected layer's visibility.

    WWLayer* layer = [[[_wwv sceneController] layers] layerAtIndex:(NSUInteger)[indexPath row]];
    [layer setEnabled:[layer enabled] ? NO : YES];
    [[self tableView] reloadData];
    [_wwv drawView];
}

- (UITableViewCell*) tableView:(UITableView*)tableView cellForRowAtIndexPath:(NSIndexPath*)indexPath
{
    static NSString* cellIdentifier = @"cell";

    UITableViewCell* cell = [tableView dequeueReusableCellWithIdentifier:cellIdentifier];
    if (cell == nil)
    {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:cellIdentifier];
    }

    WWLayer* layer = [[[_wwv sceneController] layers] layerAtIndex:(NSUInteger)[indexPath row]];
    [[cell textLabel] setText:[layer displayName]];
    [[cell imageView] setImage:[UIImage imageNamed:[layer imageFile]]];
    [cell setAccessoryType:[layer enabled] ? UITableViewCellAccessoryCheckmark : UITableViewCellAccessoryNone];

    return cell;
}

@end