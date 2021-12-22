import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ebullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ebullet extends Bullets
{
    private int damage = 15; // The amount of damage the elite bullets can damage MasterChief.
    
    /**
     * The general behavior of the elite bullet
     */
    public void act()
    {
        movementOfBullet();
        getDamage();
    }
    
    /**
     * The way the bullet will move which is right/-->
     */
    public void movementOfBullet()
    {
        setLocation (getX()+10, getY());
    }
    
    /**
     * The Elite bullet can damage the MasterChief and every hit that impacts will be removed
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
