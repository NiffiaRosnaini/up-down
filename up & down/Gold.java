import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gold extends Benda
{
    /**
     * Act - do whatever the Gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(),getY()+5);
        GoldFall();
    }    
    
    public void GoldFall()
    {
        if(atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
