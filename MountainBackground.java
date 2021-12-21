import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MountainBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MountainBackground extends World
{
    public MountainBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        Greenfoot.playSound("HaloTheme.mp3");
        
        addObject(new MasterChief(), getWidth()-825, getHeight()-35);
        
        Wide2 wide1 = new Wide2();
        addObject (wide1, getWidth()-790, getHeight()-8);
        
        Wide2 wide2 = new Wide2();
        addObject (wide2, getWidth()-455, getHeight()-70);
        
        Wide2 wide3 = new Wide2();
        addObject (wide3, getWidth()-270, getHeight()-70);
        
        Wide2 wide4 = new Wide2();
        addObject (wide4, getWidth()-60, getHeight()-70);
        
        Wide2 wide5 = new Wide2();
        addObject (wide5, getWidth()-790, getHeight()-250);
        
        Wide2 wide6 = new Wide2();
        addObject (wide6, getWidth()-570, getHeight()-250);
        
        Wide2 wide7 = new Wide2();
        addObject (wide7, getWidth()-240, getHeight()-170);
        
        Wide2 wide8 = new Wide2();
        addObject (wide8, getWidth()-240, getHeight()-325);
        
        Wide2 wide9 = new Wide2();
        addObject (wide9, getWidth()-60, getHeight()-325);
        
        addObject(new Grunt(), getWidth()-350, getHeight()-94);
        
        addObject(new Grunt(), getWidth()-60, getHeight()-94);
        
        addObject(new Grunt(), getWidth()-220, getHeight()-194);
        
        addObject(new RedElite(), getWidth()-790, getHeight()-282);
        
        addObject(new Portal(), getWidth()-50, getHeight()-372);
    }
}
