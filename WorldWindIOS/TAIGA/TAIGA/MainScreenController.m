/*
 Copyright (C) 2013 United States Government as represented by the Administrator of the
 National Aeronautics and Space Administration. All Rights Reserved.
 
 @version $Id$
 */

#import "MainScreenController.h"
#import "MovingMapViewController.h"
#import "AppConstants.h"
#import "WeatherScreenController.h"
#import "ChartsScreenController.h"
#import "SettingsScreenController.h"

#define VIEW_TAG (100)

@implementation MainScreenController
{
    UIToolbar* modeBar;
    UIBarButtonItem* movingMapButton;
    UIBarButtonItem* weatherButton;
    UIBarButtonItem* chartsButton;
    UIBarButtonItem* settingsButton;

    MovingMapViewController* movingMapScreenController;
    WeatherScreenController* weatherScreenController;
    ChartsScreenController* chartsScreenController;
    SettingsScreenController* settingsScreenController;

    NSDictionary* normalTextColor;
    NSDictionary* highlightTextColor;
}

- (id) init
{
    self = [super initWithNibName:nil bundle:nil];

    normalTextColor = [[NSDictionary alloc] initWithObjectsAndKeys:
            [UIColor whiteColor], UITextAttributeTextColor, nil];
    highlightTextColor = [[NSDictionary alloc] initWithObjectsAndKeys:
            [UIColor cyanColor], UITextAttributeTextColor, nil];

    return self;
}

- (void) loadView
{
    self.view = [[UIView alloc] initWithFrame:[[UIScreen mainScreen] applicationFrame]];
    self.view.autoresizesSubviews = YES;

    [self createToolbar];

    CGRect frame = [self.view frame];
    frame.origin.x = 0;
    frame.size.height -= TAIGA_TOOLBAR_HEIGHT;

    movingMapScreenController = [[MovingMapViewController alloc] initWithFrame:frame];
    [[movingMapScreenController view] setTag:VIEW_TAG];

    weatherScreenController = [[WeatherScreenController alloc] initWithFrame:frame];
    [[weatherScreenController view] setTag:VIEW_TAG];

    chartsScreenController = [[ChartsScreenController alloc] initWithFrame:frame];
    [[chartsScreenController view] setTag:VIEW_TAG];

    settingsScreenController = [[SettingsScreenController alloc] initWithFrame:frame];
    [[settingsScreenController view] setTag:VIEW_TAG];

    [self.view addSubview:[movingMapScreenController view]];
    [movingMapButton setTitleTextAttributes:highlightTextColor forState:UIControlStateNormal];
}


- (void) viewDidLoad
{
    [super viewDidLoad];
}

- (void) createToolbar
{
    modeBar = [[UIToolbar alloc] init];
    modeBar.frame = CGRectMake(0, self.view.frame.size.height - TAIGA_TOOLBAR_HEIGHT, self.view.frame.size.width, TAIGA_TOOLBAR_HEIGHT);
    [modeBar setAutoresizingMask:UIViewAutoresizingFlexibleWidth];
    [modeBar setBarStyle:UIBarStyleBlack];
    [modeBar setTranslucent:NO];

    NSDictionary* textAttrs = [[NSDictionary alloc] initWithObjectsAndKeys:
            [UIFont boldSystemFontOfSize:18], UITextAttributeFont, nil];

    movingMapButton = [[UIBarButtonItem alloc] initWithTitle:@"Moving Map" style:UIBarButtonItemStylePlain
                                                      target:self
                                                      action:@selector(handleMovingMap)];
    [movingMapButton setTitleTextAttributes:textAttrs forState:UIControlStateNormal];

    weatherButton = [[UIBarButtonItem alloc] initWithTitle:@"Weather" style:UIBarButtonItemStylePlain
                                                    target:self
                                                    action:@selector(handleWeather)];
    [weatherButton setTitleTextAttributes:textAttrs forState:UIControlStateNormal];

    chartsButton = [[UIBarButtonItem alloc] initWithTitle:@"Charts" style:UIBarButtonItemStylePlain
                                                   target:self
                                                   action:@selector(handleCharts)];
    [chartsButton setTitleTextAttributes:textAttrs forState:UIControlStateNormal];

    settingsButton = [[UIBarButtonItem alloc] initWithTitle:@"Settings" style:UIBarButtonItemStylePlain
                                                     target:self
                                                     action:@selector(handleSettings)];
    [settingsButton setTitleTextAttributes:textAttrs forState:UIControlStateNormal];

    UIBarButtonItem* flexibleSpace = [[UIBarButtonItem alloc]
            initWithBarButtonSystemItem:UIBarButtonSystemItemFlexibleSpace target:nil action:nil];

    [modeBar setItems:[NSArray arrayWithObjects:
            flexibleSpace,
            movingMapButton,
            flexibleSpace,
            weatherButton,
            flexibleSpace,
            chartsButton,
            flexibleSpace,
            settingsButton,
            flexibleSpace,
            nil]];

    [modeBar setAutoresizingMask:UIViewAutoresizingFlexibleWidth | UIViewAutoresizingFlexibleTopMargin];
    [self.view addSubview:modeBar];
}

- (void) handleMovingMap
{
    [self swapScreenController:movingMapScreenController button:movingMapButton];
}

- (void) handleWeather
{
    [self swapScreenController:weatherScreenController button:weatherButton];
}

- (void) handleCharts
{
    [self swapScreenController:chartsScreenController button:chartsButton];
}

- (void) handleSettings
{
    [self swapScreenController:settingsScreenController button:settingsButton];
}

- (void) swapScreenController:(UIViewController*)screenController button:(UIBarButtonItem*)button
{
    CGRect frame = [[screenController view] frame];

    for (UIView* subview in self.view.subviews)
    {
        if (subview.tag == VIEW_TAG)
        {
            frame = subview.frame;
            [subview removeFromSuperview];
            break;
        }
    }

    [[screenController view] setFrame:frame];
    [self.view addSubview:[screenController view]];

    [movingMapButton setTitleTextAttributes:normalTextColor forState:UIControlStateNormal];
    [weatherButton setTitleTextAttributes:normalTextColor forState:UIControlStateNormal];
    [chartsButton setTitleTextAttributes:normalTextColor forState:UIControlStateNormal];
    [settingsButton setTitleTextAttributes:normalTextColor forState:UIControlStateNormal];

    [button setTitleTextAttributes:highlightTextColor forState:UIControlStateNormal];
}
@end