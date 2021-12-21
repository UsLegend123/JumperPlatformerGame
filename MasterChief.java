import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MasterChief here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MasterChief extends Actor
{
    private int gunReloadTime = 7;
    private int reloadDelayCount = 0;
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 13;
    private int stability = 500;
     //MasterChief = new ("MasterChief2.png");
    
    public void act() 
    {
        checkKeys();
        onGround();
        checkFall();
        checkForVoid();
        reloadDelayCount++;
        getTeleportation();
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
        setImage(MasterChief2.getCurrentImage());
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
        if (getY() >= 599 || getY() >= getWorld().getHeight()-1)
        {
            setLocation(75,560);
        }
    }
    
    public void getHit(int damage)
    {
        stability = stability - damage;
        if (stability <=0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void getTeleportation()
    {
       Portal p = (Portal)getOneIntersectingObject(Portal.class); 
       if(p != null)
       {
          Greenfoot.setWorld(new MountainBackground2());
       }
    }
    
    public void getWin()
    {
       Cortana c = (Cortana)getOneIntersectingObject(Cortana.class); 
       if(c != null)
       {
          Greenfoot.setWorld(new MountainBackground2());
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
            getWorld().addObject(new Mbullet(), getX(), getY());
            reloadDelayCount = 0;
            Greenfoot.playSound("MGunFire.mp3");
        }
    }
}
