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
        super(300, 400, 1,false); 
        addObject(new play(), 265,370);
        addObject(new exit(), 35,370);
        if (this.getClass().getName().equalsIgnoreCase("Menus"))
        {
                    titleSound = new GreenfootSound("open1.mp3");
                     titleSound.stop();
          titleSound.setVolume(50);
          titleSound.playLoop();
         
        }
    }
}
