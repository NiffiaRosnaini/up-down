import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    boolean removed;
    public peluru()
    {
        removed = false;
    }
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (foundPesawat()) {
            kill();
        }
        if (removed) {
            return;
        }
    move();
    }
    public boolean foundPeluru()
    {
        Actor peluru = getOneObjectAtOffset(0, 0, peluru.class);
        return peluru != null;
    }
    public void kill()
    {
        Actor peluru = getOneObjectAtOffset(0, 0, peluru.class);
        if(peluru != null) {
            getWorld().removeObject(peluru);
        }
    }
    public void move()
    {
        if(getY()<=0)
        {
            removed = true;
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX(), getY()-10);
    }
}
