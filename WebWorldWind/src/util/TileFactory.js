/*
 * Copyright (C) 2014 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */
/**
 * @version $Id$
 */
define([
        'src/error/ArgumentError',
        'src/util/Level',
        'src/util/Logger',
        'src/geom/Sector',
        'src/error/UnsupportedOperationError'
    ],
    function (Level,
              Logger,
              Sector,
              UnsupportedOperationError) {
        "use strict";

        /**
         * Represents a tile factory.
         * This is an interface class and is not meant to be instantiated directly.
         * @exports TileFactory
         */
        var TileFactory = {
            /**
             * Creates a tile for a specified sector, level and row and column within that level.
             * Implementers of this interface must implement this function.
             * @param {Sector} sector The sector the tile spans.
             * @param {Number} level The level the tile is a member of.
             * @param {Number} row The tile's row within the specified level.
             * @param {Number} column The tile's column within the specified level.
             * @throws {ArgumentError} If the specified sector is null or undefined.
             */
            createTile: function (sector, level, row, column) {
                throw new UnsupportedOperationError(
                    Logger.logMessage(Logger.LEVEL_SEVERE, "TileFactory", "createTile", "abstractInvocation"));
            }
        };

        return TileFactory;
    })
;