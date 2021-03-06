/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.collada;

/**
 * Represents either a floating point number, or a <i>param</i> element.
 *
 * @author pabercrombie
 * @version $Id$
 */
public class ColladaFloatOrParam extends ColladaAbstractObject
{
    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public ColladaFloatOrParam(String namespaceURI)
    {
        super(namespaceURI);
    }
}
