import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Benda
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpStrength = 12;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
    }    
    private void checkKeys()
    {
    if(Greenfoot.isKeyDown("left"))
    {
        setImage("ball-left.png");
        moveLeft();
    }
    if(Greenfoot.isKeyDown("right"))
    {
        setImage("ball-right.png");
        moveRight();
    }
    if (Greenfoot.isKeyDown("space"))
    {
      jump();  
    }
}

public Void jump()
{
    vSpeed =-jumpStrength;
    fall();
}

public void checkFall()
{
    if(onpapan())
    {
        vSpeed = 0;
    }
    else{
        fall();
    }
}

public boolean onpapan()
{
    Actor under = grtOneObjectAtOffset(0,getHeight()/2,Papan.class);
    return under !=null;
}

public void fall()
{
    setLocation ( getX(), getY() + vSpeed);
    vSpeed = vSpeed + acceleration;
}

public void moveRight()
{
    setLocation ( getX() + speed, getY( ));
}

public void moveLeft()
{
    setLocation ( getX() - speed, getY());
}
}