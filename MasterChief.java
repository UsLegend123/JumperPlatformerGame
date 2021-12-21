import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MasterChief here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MasterChief extends Actor
{
    private int gunReloadTime = 7; //The amount of time spent on reloading and shooting again.
    private int reloadDelayCount = 0; //The Countdown time before you shoot.
    private int speed = 5; //How fast you can run.
    private int vSpeed = 0; //The starting point of your fall.
    private int acceleration = 1; //The acceleration of your fall.
    private int jumpStrength = 13; //How high you can jump.
    private int stability = 500; //The amount of hitpoints/health you have.
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    /**
     * Creating my images for my MasterChief
     */
    public MasterChief()
    {
        image1 = new GreenfootImage("MasterChief2.png");
        image2 = new GreenfootImage("MasterChief.png");
    }
    
    /**
     * General behavior of MasterChief
     */
    public void act() 
    {
        checkKeys();
        onGround();
        checkFall();
        checkForVoid();
        reloadDelayCount++;
        getTeleportation();
        getWin();
    }
    
    /**
     * MasterChief's Keys system on how to move and use his gun
     */
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
    
    /**
     * How to move right
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
        setImage(image2);
    }
    /**
     * How to move left
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
        setImage(image1);
    }
    
    /**
     * Checking for fall if there is no platform
     */
    public void fall()
    {
        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
    /**
     * How to realisticly jump and fall
     */
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
    /**
     * Part one on checking if it is on a platform so it will not fall
     */
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        return under != null;
    }
    
    /**
     * Part two on checking if it is on a platform and will not phase through
     */
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
    
    /**
     * Starting point of the fall and gravity taking the rest of it
     */
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
    
    /**
     * If MasterChief falls in the void, he respawns back on the platform
     */
    public void checkForVoid()
    {
        if (getY() >= 599 || getY() >= getWorld().getHeight()-1)
        {
            setLocation(75,560);
        }
    }
    
    /**
     * Enemy bullets able to damage, kill MasterChief, and end the game
     */
    public void getHit(int damage)
    {
        stability = stability - damage;
        if (stability <=0)
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    /**
     * MasterChief able to teleport to the other world
     */
    public void getTeleportation()
    {
       Portal p = (Portal)getOneIntersectingObject(Portal.class); 
       if(p != null)
       {
          Greenfoot.setWorld(new MountainBackground2());
       }
    }
    
    /**
     * MasterChief able to win in the game by getting Cortana
     */
    public void getWin()
    {
       Cortana c = (Cortana)getOneIntersectingObject(Cortana.class); 
       if(c != null)
       {
          Greenfoot.setWorld(new WinBackground());
       }
    }
    
    /**
     * The reload physics and how long you can reload for
     */
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    /**
     * When the reload time is done it will spawn in a bullet
     */
    public void getFire()
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            getWorld().addObject(new Mbullet(), getX()+23, getY()-3);
            reloadDelayCount = 0;
            Greenfoot.playSound("MGunFire.mp3");
        }
    }
}
