import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mbullet extends Actor
{
    private int damage = 20;
    
    public void act()
    {
        getFireMovement();
        getDamage();
    }
    
    public void getFireMovement()
    {
        setLocation (getX()+10, getY());
    }
    
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
