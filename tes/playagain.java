import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playagain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playagain extends Actor
{
    /**
     * Act - do whatever the playagain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playagain()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 130,image.getHeight()-100);
        setImage(image);
    }
    public void act() 
    {
       if (Greenfoot.mouseClicked(this) )
       {
           Greenfoot.setWorld(new Awan());
        }
    }    
}
