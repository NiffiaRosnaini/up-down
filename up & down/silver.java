import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Silver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Silver extends Benda
{
    /**
     * Act - do whatever the Silver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(),getY()+3);
        silverFall();
    }    
    
    public void silverFall()
    {
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
