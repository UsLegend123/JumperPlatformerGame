import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grunt extends Enemies
{
    private int gunReloadTime = 75;
    private int reloadDelayCount = 0;
    
    public void act()
    {
        reloadDelayCount++;
        getFire();
    }
    
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    
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
