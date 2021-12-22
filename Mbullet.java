import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mbullet extends Bullets
{
    private int damage = 20; // The amount of damage the MasterChief bullets can damage the enemies.
    
    /**
     * The general behavior of the MasterChief bullet
     */
    public void act()
    {
        getFireMovement();
        getDamage();
    }
    
    /**
     * The way the bullet will move which is right/-->
     */
    public void getFireMovement()
    {
        setLocation (getX()+10, getY());
    }
    
    /**
     * The MasterChief bullet can damage enemies and every hit that impacts will be removed
     */
    public void getDamage()
    {
        Enemies enemies = (Enemies)getOneIntersectingObject(Enemies.class);
        if (enemies != null)
        {
            getWorld().removeObject(this);
            enemies.getHit(damage);
        }
        else
        {
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
}
