import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ebullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ebullet extends Actor
{
    private int damage = 15;
    
    public void act()
    {
        movementOfBullet();
        getDamage();
    }
    
    public void movementOfBullet()
    {
        setLocation (getX()+10, getY());
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
