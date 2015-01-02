/*
 * Copyright (C) 2014 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */
/**
 * @version $Id$
 */
define([], function () {
    "use strict";
    /**
     * Provides constants and functions for working with angles.
     * @exports Angle
     */

    var Angle = {
        /**
         * Conversion factor for degrees to radians.
         * @constant
         */
        DEGREES_TO_RADIANS: Math.PI / 180.0,
        /**
         * Conversion factor for radians to degrees.
         * @constant
         */
        RADIANS_TO_DEGREES: 180.0 / Math.PI,
        /**
         * 2 pi.
         * @constant
         */
        TWO_PI: 2 * Math.PI,
        /**
         * pi / 2
         * @constant
         */
        HALF_PI: Math.PI / 2,

        /**
         * Normalizes a specified value to be within the range of [-90, 90] degrees.
         * @param {Number} degrees The value to normalize, in degrees.
         * @returns {Number} The specified value normalized to the normal range of latitude.
         */
        normalizedDegreesLatitude: function (degrees) {
            var lat = degrees % 180;

            return lat > 90 ? 180 - lat : lat < -90 ? -180 - lat : lat;
        },

        /**
         * Normalizes a specified value to be within the range of [-180, 180] degrees.
         * @param {Number} degrees The value to normalize, in degrees.
         * @returns {Number} The specified value normalized to the normal range of longitude.
         */
        normalizedDegreesLongitude: function (degrees) {
            var lon = degrees % 360;

            return lon > 180 ? lon - 360 : lon < -180 ? 360 + lon : lon;
        },

        /**
         * Normalizes a specified value to be within the range of [-Pi/2, Pi/2] radians.
         * @param {Number} radians The value to normalize, in radians.
         * @returns {Number} The specified value normalized to the normal range of latitude.
         */
        normalizedRadiansLatitude: function (radians) {
            var lat = radians % Math.PI;

            return lat > this.HALF_PI ? Math.PI - lat : lat < -this.HALF_PI ? -Math.PI - lat : lat;
        },

        /**
         * Normalizes a specified value to be within the range of [-Pi, Pi] radians.
         * @param {Number} radians The value to normalize, in radians.
         * @returns {Number} The specified value normalized to the normal range of longitude.
         */
        normalizedRadiansLongitude: function (radians) {
            var lon = radians % this.TWO_PI;

            return lon > Math.PI ? lon - this.TWO_PI : lon < -Math.PI ? this.TWO_PI + lon : lon;
        },

        /**
         * Indicates whether a specified value is within the normal range of latitude, [-90, 90].
         * @param {Number} degrees The value to test, in degrees.
         * @returns {boolean} <code>true</code> if the value is within the normal range of latitude, otherwise
         * <code>false</code>.
         */
        isValidLatitude: function (degrees) {
            return degrees >= -90 && degrees <= 90;
        },

        /**
         * Indicates whether a specified value is within the normal range of longitude, [-180, 180].
         * @param {Number} degrees The value to test, in degrees.
         * @returns {boolean} <code>true</code> if the value is within the normal range of longitude, otherwise
         * <code>false</code>.
         */
        isValidLongitude: function (degrees) {
            return degrees >= -180 && degrees <= 180;
        },

        /**
         * Returns a string representation of a specified value in degrees.
         * @param {Number} degrees The value for which to compute the string.
         * @returns {string} The computed string, which is a decimal degrees value followed by the degree symbol.
         */
        toString: function (degrees) {
            return degrees.toString() + '\u00B0';
        },

        /**
         * Returns a decimal degrees string representation of a specified value in degrees.
         * @param {Number} degrees The value for which to compute the string.
         * @returns {string} The computed string, which is a decimal degrees value followed by the degree symbol.
         */
        toDecimalDegreesString: function (degrees) {
            return degrees.toString() + '\u00B0';
        },

        /**
         * Returns a degrees-minutes-seconds string representation of a specified value in degrees.
         * @param {Number} degrees The value for which to compute the string.
         * @returns {string} The computed string in degrees, minutes and decimal seconds.
         */
        toDMSString: function (degrees) {
            var sign,
                temp,
                d,
                m,
                s;

            sign = degrees < 0 ? -1 : 1;
            temp = sign * degrees;
            d = Math.floor(temp);
            temp = (temp - d) * 60;
            m = Math.floor(temp);
            temp = (temp - m) * 60;
            s = Math.round(temp);

            if (s == 60) {
                m++;
                s = 0;
            }
            if (m == 60) {
                d++;
                m = 0;
            }

            return (sign == -1 ? "-" : "") + d + "\u00B0" + " " + m + "\u2019" + " " + s + "\u201D";
        },

        /**
         * Returns a degrees-minutes string representation of a specified value in degrees.
         * @param {Number} degrees The value for which to compute the string.
         * @returns {string} The computed string in degrees and decimal minutes.
         */
        toDMString: function (degrees) {
            var sign,
                temp,
                d,
                m,
                s,
                mf;

            sign = degrees < 0 ? -1 : 1;
            temp = sign * degrees;
            d = Math.floor(temp);
            temp = (temp - d) * 60;
            m = Math.floor(temp);
            temp = (temp - m) * 60;
            s = Math.round(temp);

            if (s == 60) {
                m++;
                s = 0;
            }
            if (m == 60) {
                d++;
                m = 0;
            }

            mf = s == 0 ? m : m + s / 60;

            return (sign == -1 ? "-" : "") + d + "\u00B0" + " " + mf + "\u2019";
        }
    };

    return Angle;
});