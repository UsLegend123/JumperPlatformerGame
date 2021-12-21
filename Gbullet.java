import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gbullet extends Actor
{
    private int damage = 25;
    
    public void act()
    {
        movementOfBullet();
        getDamage();
    }
    
    public void movementOfBullet()
    {
        setLocation (getX()-10, getY());
    }
    
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
