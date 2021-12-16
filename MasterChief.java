import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MasterChief here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MasterChief extends Mover
{
    private int gunReloadTime = 7;
    private int reloadDelayCount = 0;
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 13;
    
    public void act() 
    {
        checkKeys();
        onGround();
        checkFall();
        checkForVoid();
        reloadDelayCount++;
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        } 
        if (Greenfoot.isKeyDown("up") && onGround())
        {
            jump();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            getFire();
        }
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    public void fall()
    {
        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        return under != null;
    }
    
    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + i, Platforms.class);
            if (under!= null)
            {
                vSpeed = i;
            }
        }
    }
    
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
    public void checkForVoid()
    {
        if (getY() >= 505 || getY() >= getWorld().getHeight()-1)
        {
            setLocation(75,459);
        }
    }
    
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    
    public void getFire()
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            getWorld().addObject(new Bullet(), getX()+30, getY()-2);
            reloadDelayCount = 0;
        }
    }
}
