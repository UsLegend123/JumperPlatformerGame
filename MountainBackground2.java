import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MountainBackground2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MountainBackground2 extends World
{

    /**
     * Constructor for objects of class MountainBackground2.
     * 
     */
    public MountainBackground2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        addObject(new MasterChief(), getWidth()-825, getHeight()-35);
        
        Wide wide1 = new Wide();
        addObject (wide1, getWidth()-790, getHeight()-8);
        
        Wide wide2 = new Wide();
        addObject (wide2, getWidth()-455, getHeight()-70);
        
        Wide wide3 = new Wide();
        addObject (wide3, getWidth()-270, getHeight()-70);
        
        Wide wide4 = new Wide();
        addObject (wide4, getWidth()-60, getHeight()-70);
        
        Wide wide5 = new Wide();
        addObject (wide5, getWidth()-790, getHeight()-250);
        
        Wide wide6 = new Wide();
        addObject (wide6, getWidth()-570, getHeight()-250);
        
        Wide wide7 = new Wide();
        addObject (wide7, getWidth()-240, getHeight()-170);
        
        Wide wide8 = new Wide();
        addObject (wide8, getWidth()-240, getHeight()-325);
        
        Wide wide9 = new Wide();
        addObject (wide9, getWidth()-60, getHeight()-325);
        
        addObject(new Grunt(), getWidth()-400, getHeight()-96);
        
        addObject(new Grunt(), getWidth()-60, getHeight()-96);
        
        addObject(new Grunt(), getWidth()-250, getHeight()-196);
        
        addObject(new Grunt(), getWidth()-740, getHeight()-276);
        
        addObject(new BlueElite(), getWidth()-240, getHeight()-359);
    }
}
