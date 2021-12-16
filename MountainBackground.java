import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MountainBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MountainBackground extends World
{
    /**
     * Constructor for objects of class MountainBackground.
     * 
     */
    public MountainBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        
        addObject(new MasterChief(), getWidth()-825, getHeight()-37);
        
        Wide wide1 = new Wide();
        addObject (wide1, getWidth()-790, getHeight()-8);
        
        Wide wide2 = new Wide();
        addObject (wide2, getWidth()-490, getHeight()-70);
        
        Wide wide3 = new Wide();
        addObject (wide3, getWidth()-270, getHeight()-70);
        
        Wide wide4 = new Wide();
        addObject (wide4, getWidth()-60, getHeight()-70);
        
        Wide wide5 = new Wide();
        addObject (wide5, getWidth()-790, getHeight()-220);
        
        Wide wide6 = new Wide();
        addObject (wide6, getWidth()-570, getHeight()-220);
        
        Wide wide7 = new Wide();
        addObject (wide7, getWidth()-290, getHeight()-150);
    }
}
