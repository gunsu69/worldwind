/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.symbology;

import gov.nasa.worldwind.Movable;
import gov.nasa.worldwind.avlist.AVList;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.render.*;

/**
 * TacticalGraphic provides a common interface for displaying a graphic from a symbology sets. A graphic can be an icon
 * that is drawn a geographic position, a vector graphic that is positioned using one or more control points, or a line
 * or polygon that is styled according to the symbol set's specification.
 * <p/>
 * <h1>Creating and Displaying Tactical Graphics</h1>
 * <p/>
 * TacticalGraphics are typically created by an instance of {@link TacticalGraphicFactory}. Tactical graphics fall into
 * two basic categories: graphics that are positioned with a single point, and graphics that are positioned by multiple
 * points.
 * <p/>
 * Each graphic within a symbol set is identified by a string identifier. The format of this identifier depends on the
 * symbol set. For example, a MIL-STD-2525 Symbol Identification Code (SIDC) is a string of 15 characters.
 * <p/>
 * You will need to instantiate the appropriate factory for the symbol set that you intend to use.  For example, {@link
 * gov.nasa.worldwind.symbology.milstd2525.MilStd2525GraphicFactory} creates graphics for the MIL-STD-2525 symbology
 * set.
 * <p/>
 * The TacticalGraphic interface provides access to settings common to all tactical graphics. TacticalGraphic extends
 * the {@link Renderable} interface, so you can add a TacticalGraphic directly to a {@link
 * gov.nasa.worldwind.layers.RenderableLayer}. Here's an example of creating a graphic from the MIL-STD-2525 symbol
 * set:
 * <p/>
 * <pre>
 * // Create a graphic factory for MIL-STD-2525
 * TacticalGraphicFactory factory = new MilStd2525GraphicFactory();
 * <br/>
 * // Specify the control points for the line
 * List<Position> positions = new ArrayList<Position>();
 * positions.add(Position.fromDegrees(34.7327, -117.8347, 0));
 * positions.add(Position.fromDegrees(34.7328, -117.7305, 0));
 * <br/>
 * // Specify a text modifier
 * AVList params = new AVListImpl();
 * params.put("Text", "Alpha");
 * <br/>
 * // Create a graphic for a MIL-STD-2525 hostile phase line. The first argument is the symbol identification code
 * // (SIDC) that identifies the type of graphic to create.
 * TacticalGraphic graphic = factory.createGraphic("GHGPGLP----AUSX", positions, params);
 * <br/>
 * // Create a renderable layer to display the tactical graphic. This example adds only a single graphic, but many
 * // graphics can be added to a single layer.
 * RenderableLayer graphicLayer = new RenderableLayer();
 * graphicLayer.addRenderable(graphic);
 * <br/>
 * // Add the layer to the world window's model and request that the layer redraw itself. The world window draws the
 * // graphic on the globe at the specified position. Interactions between the graphic and the cursor are returned in
 * // the world window's picked object list, and reported to the world window's select listeners.
 * WorldWind wwd = ... // A reference to your application's WorldWind instance.
 * wwd.getModel().getLayers().add(graphicLayer);
 * wwd.redraw();
 * </pre>
 * <p/>
 * The symbol identifier ({@code GHGPGLP----AUSX}) tells the factory what type of graphic to create,  and how the
 * graphic should be styled. In the example above we added a text modifier of "Alpha" to identify our shape. These
 * parameters can be specified using a parameter list when the TacticalGraphic is created, as shown above. They can also
 * be set after creation using setters in the TacticalGraphic interface.
 * <p/>
 * <h1>Tactical Graphic Modifiers</h1>
 * <p/>
 * Many graphics support text modifiers beyond their symbol identifier. Modifiers add text or graphic elements that to
 * the tactical graphic. The possible modifiers depend on the symbol set. Modifiers can be specified in the parameter
 * list when a graphic is created, or using the setters on an implementation specific graphic class after the graphic
 * has been created.
 * <p/>
 * For example, a MIL-STD-2525 General Area graphic can have a text modifier that identifies the area. Here's an example
 * of how to specify the modifier when the graphic is created:
 * <p/>
 * <pre>
 * AVList params = new AVListImpl();
 * params.setValue("Text", "Boston"); // Text that identifies the area enclosed by the graphic.
 * <br/>
 * List<Position> positions = ...; // List of positions that define the boundary of the area.
 * TacticalGraphic graphic = milstd2525Factory.createGraphic("GHGPGAG----AUSX", positions, params);
 * </pre>
 * <p/>
 * The modifier can also be set (or changed) after the graphic is created:
 * <p/>
 * <pre>
 * // Create the graphic
 * TacticalGraphic graphic = milstd2525Factory.createGraphic("GHGPGAG----AUSX", positions);
 * <br/>
 * // 1) Specify the modifier as a key-value pair on the tactical graphic's AVList
 * graphic.setValue(SymbolCode.TEXT, "Boston");
 * // 2) Specify the modifier using an implementation specific setter method
 * ((MilStd2525Graphic) graphic).setText("Boston");
 * </pre>
 * <p/>
 * <h1>Positioning Tactical Graphics</h1>
 * <p/>
 * Each tactical graphic is positioned by one or more control points. How many points are required depends on the type
 * of graphic.  A point graphic will only require one point. A more complex shape may require three or four, and a line
 * or area may allow any number.
 * <p/>
 * Here is an example of how to create a point graphic in the MIL-STD-2525 symbol set:
 * <p/>
 * <pre>
 * Position position = Position.fromDegrees(34.9362, -118.2559, 0);
 * Tactical Graphic graphic = milstd2525Factory.createGraphic("GFGPAPD----AUSX", position, null);
 * </pre>
 * <p/>
 * More complicated graphics will require more control points. MIL-STD-2525 defines a template for each type of tactical
 * graphic. Each template identifies how many control points are required for the graphic, and how the points are
 * interpreted. The TacticalGraphic requires a list of Position objects, which identify the control points in the same
 * order as in the specification. For example, in order to create a graphic that requires three control points we need
 * to create a list of positions that specifies the three points in order:
 * <p/>
 * <pre>
 * List<Position> positions = new ArrayList<Position>();
 * positions.add(Position.fromDegrees(34.5073, -117.8380, 0)); // PT. 1
 * positions.add(Position.fromDegrees(34.8686, -117.5088, 0)); // PT. 2
 * positions.add(Position.fromDegrees(34.4845, -117.8495, 0)); // PT. 3
 * <br/>
 * TacticalGraphic graphic = milstd2525Factory.createGraphic("GFGPSLA----AUSX", positions, null);
 * </pre>
 *
 * @author pabercrombie
 * @version $Id$
 * @see TacticalGraphicFactory
 */
public interface TacticalGraphic extends Renderable, Movable, AVList
{
    /**
     * Indicates whether this graphic is drawn when in view.
     *
     * @return true if this graphic is drawn when in view, otherwise false.
     */
    boolean isVisible();

    /**
     * Specifies whether this graphic is drawn when in view.
     *
     * @param visible true if this graphic should be drawn when in view, otherwise false.
     */
    void setVisible(boolean visible);

    /**
     * Indicates whether or not a text or graphic modifier is visible.
     *
     * @param modifier The modifier to test.
     *
     * @return {@code true} if the specified modifier is visible. {@code false} if the modifier is not visible, or no
     *         such modifier is found.
     */
    boolean isModifierVisible(String modifier);

    /**
     * Specifies whether or not a text or graphic modifier is visible.
     *
     * @param modifier The modifier to test. Method has no effect if there is no modifier matching this key.
     * @param visible  {@code true} if the modifier should be visible.
     */
    void setModifierVisible(String modifier, boolean visible);

    /**
     * Indicates a string identifier for this graphic. The format of the identifier depends on the symbol set to which
     * the graphic belongs.
     *
     * @return An identifier for this graphic.
     */
    String getIdentifier();

    /**
     * Indicates the positions of the control points that place and orient the graphic.
     *
     * @return positions that orient the graphic. How many positions are returned depends on the type of graphic. Some
     *         graphics require only a single position, others require many.
     */
    Iterable<? extends Position> getPositions();

    /**
     * Specifies the positions of the control points that place and orient the graphic.
     *
     * @param positions Positions that orient the graphic. How many positions are returned depends on the type of
     *                  graphic. Some graphics require only a single position, others require many. The positions must
     *                  be specified in the same order as the control points defined by the symbology set's template for
     *                  this type of graphic.
     */
    void setPositions(Iterable<? extends Position> positions);

    /**
     * Indicates this graphic's attributes.
     *
     * @return this graphic's attributes. May be null.
     */
    TacticalGraphicAttributes getAttributes();

    /**
     * Specifies this graphic's attributes.
     *
     * @param attributes new attributes. May be null, in which case default attributes are used.
     */
    void setAttributes(TacticalGraphicAttributes attributes);
}
