import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pesawat()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 130,image.getHeight()-100);
        setImage(image);
    }
    public void act() 
    {
        lookBola();
        kill();
    }    
    
    public void lookBola()
    {
        if(isTouching(Bola.class))
        {
            removeTouching(Bola.class);
            killed();
        }
       else{
           move (1);
        }
    }
    
    public void killed()
    {
        ((Awan) getWorld()).killed = true;
    }
    public void kill()
    {
        int x = getX();
        if(x==getWorld().getWidth()-1)
        {
            Actor pesawat = getOneObjectAtOffset(0, 0,pesawat.class);
        }
    }
}
