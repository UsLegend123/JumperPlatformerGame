import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Mover
{
    private int life = 85;
    private int damage = 15;
    
    public Bullet()
    {
        
    }
    
    public void act()
    {
        movementOfBullet();
        getLife();
    }
    
    public void movementOfBullet()
    {
        setLocation(getX() + 10, getY());
    }
    
    public void getLife()
    {
        if(life <= 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
            move(0);
            Enemies enemies = (Enemies)getOneIntersectingObject(Enemies.class);
            if (enemies != null)
            {
                getWorld().removeObject(this);
                enemies.getHit(damage);
            }
            else
            {
                life--;
            }
        }
    }
}
