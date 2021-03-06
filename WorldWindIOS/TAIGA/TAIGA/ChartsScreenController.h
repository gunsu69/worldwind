/*
 Copyright (C) 2013 United States Government as represented by the Administrator of the
 National Aeronautics and Space Administration. All Rights Reserved.
 
 @version $Id$
 */

#import <Foundation/Foundation.h>

@interface ChartsScreenController : UIViewController <UISearchBarDelegate>

- (ChartsScreenController*) initWithFrame:(CGRect)frame;

- (void) loadChart:(NSString*)chartPath chartName:(NSString*)chartName;

@end