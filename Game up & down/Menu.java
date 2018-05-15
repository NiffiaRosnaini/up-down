import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public static GreenfootSound titleSound;
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if (this.getClass().getName().equalsIgnoreCase("Menus"))
        {
                addObject(new start(), 550,350);
                addObject(new exit(), 120,300);
                tittleSound = new GreenfotSound("fix.mp3");
                        titleSound.stop();
          titleSound.setVolume(50);
          titleSound.playLoop();
        }
        else
        {
            addObject(new back(), 100, 500);
        }
    }
}
