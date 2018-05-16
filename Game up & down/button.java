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
        if (Greenfoot.mouseMoved(this)) {
            setImage(buttonName + "_over.png");
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(buttonName + ".png");
        }
        if (Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
        }
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {
            setImage(buttonName + ".png"); 
        }
        if (Greenfoot.mouseClicked(this)) {
            setImage(buttonName + ".png");
            Greenfoot.delay(5);
            if      (buttonName.equalsIgnoreCase("start")) Greenfoot.setWorld(new Sky());
            else if (buttonName.equalsIgnoreCase("exit"))  Greenfoot.stop();
