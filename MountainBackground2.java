import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MountainBackground2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MountainBackground2 extends World
{
    public MountainBackground2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        addObject(new MasterChief(), getWidth()-825, getHeight()-37);
        
        Wide wide1 = new Wide();
        addObject (wide1, getWidth()-790, getHeight()-8);
        
        Wide wide2 = new Wide();
        addObject (wide2, getWidth()-480, getHeight()-8);
        
        Wide wide3 = new Wide();
        addObject (wide3, getWidth()-180, getHeight()-70);
        
        Wide wide4 = new Wide();
        addObject (wide4, getWidth()-60, getHeight()-70);
        
        Wide wide5 = new Wide();
        addObject (wide5, getWidth()-790, getHeight()-230);
        
        Wide wide6 = new Wide();
        addObject (wide6, getWidth()-720, getHeight()-230);
        
        Wide wide7 = new Wide();
        addObject (wide7, getWidth()-450, getHeight()-150);
        
        Wide wide8 = new Wide();
        addObject (wide8, getWidth()-180, getHeight()-230);
        
        Wide wide9 = new Wide();
        addObject (wide9, getWidth()-95, getHeight()-230);
        
        Wide wide10 = new Wide();
        addObject (wide10, getWidth()-600, getHeight()-325);
        
        Wide wide11 = new Wide();
        addObject (wide11, getWidth()-300, getHeight()-325);
        
        Wide wide13 = new Wide();
        addObject (wide13, getWidth()-110, getHeight()-420);
        
        Wide wide14 = new Wide();
        addObject (wide14, getWidth()-790, getHeight()-420);
        
        Wide wide17 = new Wide();
        addObject (wide17, getWidth()-450, getHeight()-530);
        
        Wide wide18 = new Wide();
        addObject (wide18, getWidth()-750, getHeight()-520);
        
        Wide wide19 = new Wide();
        addObject (wide19, getWidth()-150, getHeight()-520);
        
        addObject(new Grunt(), getWidth()-50, getHeight()-96);
        
        addObject(new Grunt(), getWidth()-100, getHeight()-256);
        
        addObject(new Grunt(), getWidth()-225, getHeight()-446);
        
        addObject(new Grunt(), getWidth()-80, getHeight()-446);
        
        addObject(new BlueElite(), getWidth()-700, getHeight()-454);
        
        addObject(new BlueElite(), getWidth()-840, getHeight()-264);
        
        addObject(new RedElite(), getWidth()-825, getHeight()-454);
        
        addObject(new Cortana(), getWidth()-450, getHeight()-575);
    }
}
