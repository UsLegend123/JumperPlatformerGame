import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1); 
        
        addObject(new MasterChief(), getWidth()-740, getHeight()-30);
        
        Wide wide1 = new Wide();
        addObject (wide1, getWidth()-660, getHeight()-5);
        
        Wide wide2 = new Wide();
        addObject (wide2, getWidth()-381, getHeight()-5);
        
        Wide wide3 = new Wide();
        addObject (wide3, getWidth()-102, getHeight()-5);
    }
}
