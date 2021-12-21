import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueElite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueElite extends Enemies
{
    private int gunReloadTime = 35;
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
            getWorld().addObject(new Ebullet(), getX()+23, getY()-5);
            reloadDelayCount = 0;
            Greenfoot.playSound("EGunFire.mp3");
        }
    }
}
