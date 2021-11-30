import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MasterChief here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MasterChief extends Actor
{
    private int speed = 6;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 15;
    /**
     * Act - do whatever the MasterChief wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        onGround();
        checkFall();
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
}
