import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grunt extends Enemies
{
    private int gunReloadTime = 75; // The amount of time spent on reloading and shooting again.
    private int reloadDelayCount = 0; // The Countdown time before you shoot.
    
    /**
     * General behavior of the Grunt
     */
    public void act()
    {
        reloadDelayCount++;
        getFire();
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
            getWorld().addObject(new Gbullet(), getX()-19, getY()-2);
            reloadDelayCount = 0;
            Greenfoot.playSound("GGunFire.mp3");
        }
    }
}
