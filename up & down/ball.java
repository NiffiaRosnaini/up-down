import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpStrength = 12;
    
    /**
     * check keyboard inut and act accordingly
     */
    public void act() 
    {
        checkKeys();
        checkFall();
    }    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setImage("ball-left.png");
            moveLeft();
        } 
        if (Greenfoot.isKeyDown("right"))
        {
            setImage("ball-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            jump();
        }
    }
    
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
    public void checkFall()
    {
        if(onpapanj()) {
            vSpeed = 0;
        }
        else {
            fall();
        }
    }
    
    public boolean onpapanj()
    {
        Actor under = getOneObjectAtOffset(0, getHeight()/ 2,papanj.class);
        return under !=null;
    }
    
    public void fall()
    {
         setLocation ( getX(), getY() + vSpeed);
         vSpeed = vSpeed + acceleration;
    }
    
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }
    
    public void moveLeft()
    {
        setLocation ( getX() - speed,getY() );
    }
    
}
