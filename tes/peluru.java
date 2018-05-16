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
    public void act() 
    { if (foundPesawat()) {
            kill();
        }
      
      if(removed){
           return;
        }
      
      move();
    }  
    public boolean foundPesawat()
    {
        Actor pesawat = getOneObjectAtOffset(0, 0, pesawat.class);
        return pesawat != null;
    }
  
    public void kill()
    {
        Actor pesawat = getOneObjectAtOffset(0, 0, pesawat.class);
        if (pesawat != null) {
            getWorld().removeObject(pesawat);
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

