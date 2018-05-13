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
    { if (foundMonstr()) {
            kill();
        }
      if (foundMonstr1()) {
            kill1();
        }
      if(removed){
           return;
        }
      
      move();
    }  
    public boolean foundMonstr()
    {
        Actor monstr = getOneObjectAtOffset(0, 0, monstr.class);
        return monstr != null;
    }
    public boolean foundMonstr1()
    {
        Actor monstr1 = getOneObjectAtOffset(0, 0, monstr1.class);
        return monstr1 != null;
    }
    public void kill1(){
        Actor monstr1 = getOneObjectAtOffset(0, 0, monstr1.class);
        if (monstr1 != null) {
            getWorld().removeObject(monstr1);
        }
    }
    public void kill()
    {
        Actor monstr = getOneObjectAtOffset(0, 0, monstr.class);
        if (monstr != null) {
            getWorld().removeObject(monstr);
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

