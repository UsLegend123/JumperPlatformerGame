import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mbullet extends Bullets
{
    private int damage = 20;
    
    public void act()
    {
        movementOfBullet();
        getDamage();
        move(10);
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
