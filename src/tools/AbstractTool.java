/*
 * TCSS 305: Assignment 5 - PowerPaint
 * Abstract Tool Class
 */

package tools;

/**
 * Abstract superclass for the PowerPaint tools.
 * @author Austin Ingraham
 * @version 18 November 2015 
 */
public abstract class AbstractTool implements ToolInterface {

    /** Name of this tool. */
    private final String myName;
    
    /** Description of this tool. */
    private final String myDescription;
    
    /** 
     * Abstract constructor to create a generic tool. 
     * @param theName String name of this tool. 
     * @param theDescription String description of this tool.
     */
    public AbstractTool(final String theName, final String theDescription) {
        myName = theName;
        myDescription = theDescription;
    }
    
    /**
     * Getter which returns this tool's name.
     * @return myName String name of this tool.
     */
    public String getToolName() {
        return myName;
    }
    
    /**
     * Getter which returns this tool's description.
     * @return myDescription String description of this tool.
     */
    public String getDescription() {
        return myDescription;
    }
}
