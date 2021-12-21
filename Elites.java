import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elites here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elites extends Enemies
{
    private int gunReloadTime = 7;
    private int reloadDelayCount = 0;
    
    public void act()
    {
        reloadDelayCount++;
    }
    
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    
    public void getFire()
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            getWorld().addObject(new Ebullet(), getX(), getY());
            reloadDelayCount = 0;
            Greenfoot.playSound("EGunFire.mp3");
        }
    }
}
