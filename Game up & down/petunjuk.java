import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class petunjuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class petunjuk extends Actor
{
    boolean removed = false;
    public petunjuk()
    {
        removed = false;
    }
    /**
     * Act - do whatever the petunjuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(((Awan) getWorld()).AwanX, 20);
    }    
}
