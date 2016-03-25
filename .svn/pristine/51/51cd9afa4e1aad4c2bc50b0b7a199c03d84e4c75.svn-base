/*
 * TCSS 305: Assignment 5 - PowerPaint
 * ColorIcon Class
 */


package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;  
  
/**
 * ColorIcon class to represent a icon of given color for PowerPaintGUI's menu.
 * Based on the example given by CodeBeach.
 * @author Austin Ingraham
 * @version 21 November 2015
 */
public class ColorIcon implements Icon {  
    
    /** Size constant of this icon. */
    private static final int SIZE = 14; 
  
    /** Color of this icon. */
    private final Color myColor;  
  
    /**
     * Constructor for the ColorIcon class.  
     * @param theColor sets this icon's color to the given color.
     */
    public ColorIcon(final Color theColor) {  
        myColor = theColor;  
    }  
  
    /**
     * Gets the height of this icon. 
     * @return int the height. 
     */
    @Override
    public int getIconHeight() {  
        return SIZE;  
    }  
  
    /**
     * Gets the width of this icon. 
     * @return int the width. 
     */
    @Override
    public int getIconWidth() {  
        return SIZE;  
    }  
  
    /**
     * Paints the icon given these coordinates.
     * @param theC Component to draw on.
     * @param theG Graphics.
     * @param theX int coordinate.
     * @param theY int coordinate.
     */
    @Override
    public void paintIcon(final Component theC, final Graphics theG, 
                          final int theX, final int theY) {  
        theG.setColor(myColor);  
        theG.fillRect(theX, theY, SIZE - 1, SIZE - 1);  
  
        theG.setColor(Color.black);  
        theG.drawRect(theX, theY, SIZE - 1, SIZE - 1);  
    }  
}  