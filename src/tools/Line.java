/*
 * TCSS 305: Assignment 5 - PowerPaint
 * Line Tool 
 */

package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 * Tool class which creates a straight line between two points.
 *  @author Austin Ingraham
 *  @version 18 November 2015 
 */
public class Line extends AbstractTool implements ToolInterface {
    
    /** String name of this tool. */
    private static final String MY_NAME = "Line";
    
    /** String constant representing the short description of this tool. */
    private static final String MY_DESCRIPTION = "Draws a line on the drawing panel.";
    
    /** The point where the shape is started. */
    private Point myStartPoint;
    
    /** The line being drawn. */
    private Line2D myLine;
    
    /** Constructor for the line tool. */
    public Line() {
        super(MY_NAME, MY_DESCRIPTION);
        myLine = new Line2D.Double();
    }

    /**
     * Method which starts creating a line, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a line shape at these coordinates.
     */
    @Override
    public Shape start(final int theX, final int theY) {
        myStartPoint = new Point(theX, theY);
        myLine = new Line2D.Double(myStartPoint, myStartPoint);
        return myLine;
    }

    /**
     * Method which continues creating a line, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a line shape between the starting point and these coordinates.
     */
    @Override
    public Shape shift(final int theX, final int theY) {
        myLine.setLine(myStartPoint, new Point(theX, theY));
        return myLine;
    }

    /**
     * Method which finishes creating a line, at the given X and Y values.
     * 
     * @param theX int representing an X value on the Cartesian coordinate plane.
     * @param theY int representing an Y value on the Cartesian coordinate plane.
     * @return a line shape between the starting point and these coordinates.
     */
    @Override
    public Shape end(final int theX, final int theY) {
        myLine.setLine(myStartPoint, new Point(theX, theY));
        return myLine;
    }

}
