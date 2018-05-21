import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exit extends Actor
{
    /**
     * Act - do whatever the exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public exit()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 130,image.getHeight()-100);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            Greenfoot.stop();
        }
    }    
}
