import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    private int stability = 150; // The health of the enemies
    
    /**
     * A getter for the health of enemies and giving it to the gitHit method
     */
    public int getStability()
    {
        return stability;
    }
    
    /**
     * When all health is gone the enemy will be removed
     */
    public void getHit(int damage)
    {
        stability = stability - damage;
        if (stability <=0)
        {
            getWorld().removeObject(this);
        }
    }
}
