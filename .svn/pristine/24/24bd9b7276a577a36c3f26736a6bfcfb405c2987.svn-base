/*
 * TCSS 305: Assignment 5 - PowerPaint
 * Rectangle Tool Class
 */

package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * Tool class to draw a rectangle on the drawing panel. 
 * @author Austin Ingraham
 * @version 20 November 2015
 */
public final class Rectangle extends AbstractTool implements ToolInterface {
    
    /** String constant representing the name of this tool. */
    private static final String MY_NAME = "Rectangle";
    
    /** String constant representing the short description of this tool. */
    private static final String MY_DESCRIPTION = "Draws a rectangle on the drawing panel.";
    
    /** The rectangle being drawn. */
    private Rectangle2D myRectangle;
    
    /** The point where the shape is started. */
    private Point myStartPoint;
    
    /** Constructor for the rectangle tool. */
    public Rectangle() {
        super(MY_NAME, MY_DESCRIPTION);
    }

    /**
     * Method which starts creating a rectangle, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a rectangle shape at these coordinates.
     */
    @Override
    public Shape start(final int theX, final int theY) {
        myStartPoint = new Point(theX, theY);
        myRectangle = new Rectangle2D.Double();
        myRectangle.setFrameFromDiagonal(myStartPoint, myStartPoint);
        return myRectangle;
    }

    /**
     * Method which continues creating a rectangle, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a rectangle shape between the starting point and these coordinates.
     */
    @Override
    public Shape shift(final int theX, final int theY) {
        myRectangle.setFrameFromDiagonal(myStartPoint, new Point(theX, theY));
        return myRectangle;
    }

    /**
     * Method which finishes creating a rectangle, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a rectangle shape between the starting point and these coordinates.
     */
    @Override
    public Shape end(final int theX, final int theY) {
        myRectangle.setFrameFromDiagonal(myStartPoint, new Point(theX, theY));
        return myRectangle;
    }
}
