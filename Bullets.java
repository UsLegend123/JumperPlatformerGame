import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    public void act()
    {
        
    }
    
    public void movementOfBullet()
    {
        setLocation(getX() + 10, getY());
    }
    
    public void turn()
    {
        turn(180);
    }
    
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
}
