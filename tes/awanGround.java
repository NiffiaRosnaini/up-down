import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awanGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awanGround extends Actor
{
    boolean hasBeenBounced;
    int x_pos, y_pos;
    /**
     * Act - do whatever the awanGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public awanGround()
    {
        hasBeenBounced=false;
    }
    
    public awanGround(boolean bouncable)
    {
        hasBeenBounced=true;
    }
    public void act() 
    {
        if(((Awan) getWorld()).scroll==true)
        {
            scroll(((Awan) getWorld()).scrollSpeed);
        }
        
        if(((Awan) getWorld()).fall==true)
        {
            fall(((Awan) getWorld()).scrollSpeed);
        }
        
        if(y_pos < 0)
        {
            getWorld().removeObject(this);
            return;
        }
    }    
    
    protected void addedToWorld (World world)
    {
        x_pos = getX();
        y_pos = getY();
    }
    
    public void scroll(int speed)
    {
        if(speed>0)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos);
        }
    }
    
    public void fall(int speed)
    {
        if(((Awan) getWorld()).ended==false)
        {
            y_pos = y_pos + speed;
            setLocation(x_pos, y_pos);
        }
    }
}
