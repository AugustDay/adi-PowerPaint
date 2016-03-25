/*
 * TCSS 305: Assignment 5 - PowerPaint
 * DrawingPanel Class
 */

package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.JMenuItem;
import javax.swing.JPanel;

import tools.PaintObject;
import tools.ToolInterface;

/**
 * Class for handling the drawing panel of the GUI upon which the user draws.
 * Based on the DrawingArea demo written by Charles Bryan.
 *  @author Austin Ingraham
 *  @version 20 November 2015 
 */
public class DrawingPanel extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 1144639778936649562L;
    
    /** The default width value. */
    private static final int DEFAULT_WIDTH = 400; 
    
    /** The default height value. */
    private static final int DEFAULT_HEIGHT = 200;
    
    /** The default grid spacing value. */
    private static final int DEFAULT_GRID_SPACING = 10;
    
    /** The minimum size this component should be. */
    private static final Dimension MIN_SIZE = new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    
    /** List containing all finished shapes. */
    private final List<PaintObject> myFinishedShapes;
    
    /** Shape presently being drawn. */
    private Shape myCurrentShape;
    
    /** Current thickness value to draw new shapes. */
    private int myThickness;
    
    /** The active color. */
    private Color myColor;
    
    /** Boolean value to track if this is the first mouse-click or second. */
    private boolean myIsDrawing;
    
    /** Whether the grid will display or not. */
    private boolean myGridActive;
    
    /** The distance between each grid line. */
    private int myGridSpacing;
  
    /** Current selected tool for drawing shapes. */
    private ToolInterface mySelectedTool;
    
    /** A button which can be called to clear the drawing panel's list of shapes. */
    private JMenuItem myClearButton;
    
    /** Constructs a blank, white drawing area. */
    public DrawingPanel() {
        super();
        
        myIsDrawing = false;
        myThickness = 1; //default thickness
        myColor = Color.BLACK; //default color
        myGridActive = false;
        myGridSpacing = DEFAULT_GRID_SPACING;
        myClearButton = new JMenuItem();
        
        myFinishedShapes = new ArrayList<PaintObject>();
        setBackground(Color.white);
        setOpaque(true);
    }
    
    /**
     * Method to paint all of the shapes as well as grid onto the drawingPanel.
     * @param theGraphics object to handle rendering.
     */
    @Override
    protected void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        for (final PaintObject obj : myFinishedShapes) {
            g2d.setStroke(obj.getThickness());
            g2d.setColor(obj.getColor());
            g2d.draw(obj.getShape());
        }
        
        if (myIsDrawing && myThickness > 0) {
            g2d.setStroke(new BasicStroke(myThickness));
            g2d.setColor(myColor);
            g2d.draw(myCurrentShape);
        }
        
        if (myGridActive) {
            drawGrid(g2d);
        }
    };
    
    /**
     * Draws the grid onto the drawing panel.
     * @param theGraphics2D graphics on which to draw.
     */
    private void drawGrid(final Graphics2D theGraphics2D) {
        final Line2D.Double gridLine = new Line2D.Double();
        final int height = this.getHeight();
        final int width = this.getWidth();
        
        theGraphics2D.setColor(Color.BLACK);
        theGraphics2D.setStroke(new BasicStroke(1));
        
        for (int i = 0; i < height; i++) {
            if (i % myGridSpacing == 0) {
                gridLine.setLine(0, i, width, i);
                theGraphics2D.draw(gridLine);
            }
        }
        
        for (int i = 0; i < width; i++) {
            if (i % myGridSpacing == 0) {
                gridLine.setLine(i, 0, i, height);
                theGraphics2D.draw(gridLine);
            }
        }
    }
    
    /** Clears the drawing panel of all shapes when called. */
    public void clearAllChanges() {
        myClearButton.setEnabled(false);
        myFinishedShapes.clear();
        repaint();
    }
    
    /**
     * Adds a newly finished shape to the list of finished shapes.
     * @param theShape a newly finished shape.
     */
    public void addFinishedShape(final Shape theShape) {
        myIsDrawing = false;
        if (myThickness > 0) {
            myClearButton.setEnabled(true);
            myFinishedShapes.add(new PaintObject(theShape, myThickness, myColor));
        }
    }
    
    /**
     * Adds a button to the drawing panel, so that the panel can call setEnabled.
     * @param theUndoAll Button to add.
     */
    public void addClearButton(final JMenuItem theUndoAll) {
        if (Objects.nonNull(theUndoAll)) {
            myClearButton = theUndoAll;
        }
    }
 
    /** The minimum size of this drawingPanel. 
     * @return MIN_SIZE the dimension.
     */
    @Override
    public Dimension getMinimumSize() {
        return MIN_SIZE;
    }
 
    /** The preferred size of this drawingPanel. 
     * @return MIN_SIZE the dimension.
     */
    @Override
    public Dimension getPreferredSize() {
        return MIN_SIZE;
    }
    
    /**
     * Returns the currently selected tool.
     * @return mySelectedTool whatever tool is currently active.
     */
    public ToolInterface getSelectedTool() {
        return mySelectedTool;
    }
    
    /**
     * Gets the current drawing color. 
     * @return myColor the color.
     */
    public Color getColor() {
        return myColor;
    }
    
    /**
     * Sets the current drawing color.
     * @param theColor the new color.
     */
    public void setColor(final Color theColor) {
        if (Objects.nonNull(theColor)) {
            myColor = theColor;
        }
    }
    
    /**
     * Sets the spacing of the grid lines.
     * @param theSpacing distance between each grid line.
     */
    public void setGridSpacing(final int theSpacing) {
        if (theSpacing >= 0) {
            myGridSpacing = theSpacing;
        }
    }
    
    /**
     * Sets the thickness of the current shape being drawn.
     * @param theThickness int value representing thickness.
     */ 
    public void setThickness(final int theThickness) {
        if (theThickness > 0) {
            myThickness = theThickness;
        } else {
            myThickness = 0;
        }
    }
    
    /**
     * Sets what tool is currently active, for the purpose of only using one at a time.
     * @param theTool what tool should be active.
     */
    public void setSelectedTool(final ToolInterface theTool) {
        if (Objects.nonNull(theTool)) {
            mySelectedTool = theTool;
        }
    }
    
    /**
     * Set the shape currently being drawn.
     * @param theShape current shape being drawn.
     */
    public void setCurrentShape(final Shape theShape) {
        myCurrentShape = theShape;
        myIsDrawing = true;
    }
    
    /**
     * Determines if the grid is enabled, based on the boolean passed.
     * @param theBool whether the grid will display or not.
     */
    public void setGridSelected(final boolean theBool) {
        myGridActive = theBool;
    }
}
