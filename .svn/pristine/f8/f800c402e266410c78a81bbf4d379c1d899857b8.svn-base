/*
 * TCSS 305: Assignment 5 - PowerPaint
 * Ellipse Tool Class
 */

package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Tool class to draw an ellipse on the drawing panel. 
 * @author Austin Ingraham
 * @version 20 November 2015
 */
public final class Ellipse extends AbstractTool implements ToolInterface {

    /** String constant representing the name of this tool. */
    private static final String MY_NAME = "Ellipse";
    
    /** String constant representing the short description of this tool. */
    private static final String MY_DESCRIPTION = "Draws an ellipse on the drawing panel.";
    
    /** The ellipse being drawn. */
    private Ellipse2D myEllipse;
    
    /** The point where the shape is started. */
    private Point myStartPoint;
    
    /** Constructor for the ellipse tool. */
    public Ellipse() {
        super(MY_NAME, MY_DESCRIPTION);
    }

    /**
     * Method which starts creating an ellipse, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return an ellipse shape at these coordinates.
     */
    @Override
    public Shape start(final int theX, final int theY) {
        myStartPoint = new Point(theX, theY);
        myEllipse = new Ellipse2D.Double();
        myEllipse.setFrameFromDiagonal(myStartPoint, myStartPoint);
        return myEllipse;
    }

    /**
     * Method which continues creating an ellipse, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return an ellipse shape between the starting point and these coordinates.
     */
    @Override
    public Shape shift(final int theX, final int theY) {
        myEllipse.setFrameFromDiagonal(myStartPoint, new Point(theX, theY));
        return myEllipse;
    }

    /**
     * Method which finishes creating an ellipse, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return an ellipse shape between the starting point and these coordinates.
     */
    @Override
    public Shape end(final int theX, final int theY) {
        myEllipse.setFrameFromDiagonal(myStartPoint, new Point(theX, theY));
        return myEllipse;
    }
}
