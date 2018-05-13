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
    { if (foundMonstr()){
            kill();
       }
      if (foundMonstr()){
            killl();
        }
      if (removed) {
            return;
        }
        
        move();
    }
    public boolean foundMonstr()
    {
        Actor monstr = getOneObjectAtOffset(0, 0, monstr.class);
        return monstr != null;
    }
    public boolean foundMonstrl()
    {
        Actor monstrl = getOneObjectAtOffset(0, 0, monstrl.class);
        return monstrl != null;
    }
    public void killl(){
        Actot monstrl = getOneObjectAtOffset(0, 0, monstrl.class);
        if (monstrl != null) {
            getWorld().removeObject(monstrl);
        }
    }
    public void kill()
    {
        Actor monstr = getOneObjectAtOffset(0, 0, monstr.class);
        getWorld().removeObeject(monstr);
    }
    public void move()
    {
        if(getY()<=0)
        {
            removed = true;
            getWorld().removedObject(this);
            return;
        }
        setLocation(getX(), getY()-10);
    }
}
   

   