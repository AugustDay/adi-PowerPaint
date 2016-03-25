/*
 * TCSS 305: Assignment 5 - PowerPaint
 * PaintObject Class
 */

package tools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;

/**
 * PaintObject class for PowerPaint project. 
 * @author Austin Ingraham
 * @version 20 November 2015
 */
public final class PaintObject {
    
    /** Thickness of this shape. */
    private final Stroke myThickness;

    /** The shape to be drawn. */
    private final Shape myShape;    
    
    /** The color of this shape. */
    private final Color myColor;

    /**
     * Constructor for a container which stores a shape, its thickness, and its color.
     * @param theShape the shape to be stored.
     * @param theThickness the thickness of this shape.
     * @param theColor the color of this shape.
     */
    public PaintObject(final Shape theShape, final int theThickness, final Color theColor) {
        myThickness = new BasicStroke(theThickness);
        myShape = theShape;
        myColor = theColor;
    }
    
    /**
     * Gets the stored thickness.
     * @return BasicStroke the thickness value.
     */
    public Stroke getThickness() {
        return myThickness;
    }
    
    /**
     * Gets the stored shape.
     * @return Shape the shape.
     */
    public Shape getShape() {
        return myShape;
    }
    
    /**
     * Gets the stored color.
     * @return Color the color.
     */
    public Color getColor() {
        return myColor;
    }
}
