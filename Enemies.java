import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Mover
{
    private int stability = 150;
    
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
}
