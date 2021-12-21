import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    private int stability = 150;
    private int X = 1;
    
    public int getStability()
    {
        return stability;
    }
    
    public void getHit(int damage)
    {
        stability = stability - damage;
        if (stability <=0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void getMovement()
    {
        setLocation(getX() + X, getY());
        if ((getX() >  850) || (getX() < 10))
        {
            X = X *-1;
        }
    }
}
