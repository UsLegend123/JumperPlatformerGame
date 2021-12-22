import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gbullet extends Bullets
{
    private int damage = 25; // The amount of damage the grunt bullets can damage MasterChief.
    
    /**
     * The general behavior of the grunt bullet
     */
    public void act()
    {
        movementOfBullet();
        getDamage();
    }
    
    /**
     * The way the bullet will move which is left/<--
     */
    public void movementOfBullet()
    {
        setLocation (getX()-10, getY());
    }
    
    /**
     * The Grunt bullet can damage the MasterChief and every hit that impacts will be removed
     */
    public void getDamage()
    {
        MasterChief hero = (MasterChief)getOneIntersectingObject(MasterChief.class);
        if (hero != null)
        {
            getWorld().removeObject(this);
            hero.getHit(damage);
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
