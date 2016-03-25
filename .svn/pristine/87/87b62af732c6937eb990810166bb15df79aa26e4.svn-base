/*
 * TCSS 305: Assignment 5 - PowerPaint
 * PowerPaintMain Class
 */

package gui;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Driver class for PowerPaint project. 
 * @author Austin Ingraham
 * @version 9 November 2015
 */
public final class PowerPaintMain {

    /** Private constructor to prevent construction of instances. */
    private PowerPaintMain() {
        //do nothing
    }
    
    /**
     * Constructs the GUI window frame.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String[] theArgs) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (final UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (final InstantiationException ex) {
            ex.printStackTrace();
        } catch (final ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        // Turn off metal's use of bold fonts
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {     
                new PowerPaintGUI().start();
            }
        });
    }

}
