/*
 Copyright (C) 2013 United States Government as represented by the Administrator of the
 National Aeronautics and Space Administration. All Rights Reserved.
 
 @version $Id$
 */

#import <UIKit/UIKit.h>
#import "WorldWind/Geometry/WWPlane.h"
#import "WorldWind/Geometry/WWVec4.h"
#import "WorldWind/WWLog.h"
#import "WorldWind/Geometry/WWMatrix.h"


@implementation WWPlane

- (WWPlane*) initWithNormal:(WWVec4* __unsafe_unretained)vector
{
    if (vector == nil)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Vector is nil")
    }

    if ([vector length3] == 0)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Vector has zero length")
    }

    self = [super init];

    _vector = [[WWVec4 alloc] initWithVector:vector];

    return self;
}

- (WWPlane*) initWithCoordinates:(double)x y:(double)y z:(double)z distance:(double)distance
{
    self = [super init];

    _vector = [[WWVec4 alloc] initWithCoordinates:x y:y z:z w:distance];

    if ([_vector length3] == 0)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Vector has zero length")
    }

    return self;
}

- (double) dot:(WWVec4* __unsafe_unretained)vector
{
    if (vector == nil)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Vector is nil")
    }

    return [_vector dot4:vector];
}

- (void) transformByMatrix:(WWMatrix* __unsafe_unretained)matrix
{
    if (matrix == nil)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Matrix is nil")
    }

    [_vector multiplyByMatrix:matrix];
}

- (void) translate:(WWVec4* __unsafe_unretained)translation
{
    if (translation == nil)
    {
        WWLOG_AND_THROW(NSInvalidArgumentException, @"Translation is nil")
    }

    double dot = [_vector dot3:translation];
    [_vector setW:[_vector w] - dot];
}

- (void) normalize
{
    double d = [_vector length3];

    if (d != 0)
    {
        [_vector divideByScalar:d];
    }
}

@end