import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skor extends Actor
{
    GreenfootImage gambar = new GreenfootImage(100,10);
    /**
     * Act - do whatever the Skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Skor()
    {
        setImage(gambar);
    }
    
    public void act() 
    {
        // Add your action code here.
        gambar.clear();
        gambar.drawString(((Awan)getWorld()).height() + "skor  ",10,10);
        setImage(gambar);
    }    
}
