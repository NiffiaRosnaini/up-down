import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ta extends World
{
    public int jeda=50;
    /**
     * Constructor for objects of class ta.
     * 
     */
    public ta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        if(jeda==0){
            addObject(new Papan(),getWidth()-3,getHeight());
            jeda=60;
        }
        else{
            jeda--;
        }
    }
}
