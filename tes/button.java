import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act(String buttonName) 
    {
        if (Greenfoot.mouseClicked(this)) {
            setImage(buttonName + ".png");
            Greenfoot.delay(5);
            if      (buttonName.equalsIgnoreCase("start")) Greenfoot.setWorld(new Awan());
            else if (buttonName.equalsIgnoreCase("exit"))  Greenfoot.stop();
        }
    }
}