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