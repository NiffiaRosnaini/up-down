import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ta extends World
{

    /**
     * Constructor for objects of class ta.
     * 
     */
    private int jeda=0;
    public ta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber (getHeight());
            addObject (new papanj(-(Greenfoot.getRandomNumber (3))), getWidth()+200,py);
        }
    }
}
