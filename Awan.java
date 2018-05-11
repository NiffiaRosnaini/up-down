import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends World
{
    boolean bstarted, started = false;
    boolean once;
    int transparency = 0;
    int scrollSpeed;
    boolean scroll;
    boolean fall;
    boolean ended;
    boolean killed;
    int height = 0;
    int doodleX;
    
    /**
     * Constructor for objects of class Awan.
     * 
     */
    public Awan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new ground(), 56,317);
        addObject(new doodler(false), 56, 200);
        setPaintOrder(skor.class,awanGround.class,ground.class, ammo.class);
        setBackground("title.png");
        getBackground().setTransparency(255);
        one = true;
        started = false;
        height = 0;
        fall = false;
        ended = false;
        killed = false;
    }
    
    public void act()
    {
        
        
{ if (Greenfoot.getRandomNumber(1000) > 998 & started==true)
            {
                int x = Greenfoot.getRandomNumber(300);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new monsterr(), x, y);
            }
        }
{ if (Greenfoot.getRandomNumber(1000) > 998 & started==true)
                {
                    int x = Greenfoot.getRandomNumber(300);
                    int y = Greenfoot.getRandomNumber(150);
                    addObject(new monstrl(), x, y);
                }
        }
        
if(bStarted==false & Greenfoot.mouseMoved(this))
            {
                bStarted = true;
            }   
            
if(started==false & bStarted==true)
{
  MouseInfo mouse = Greenfoot.getMouseinfo();
        
  if(Grenfoot.mouse.Clicked(this))
  {
     if(mouse.getX()>=50 & mouse.getX()<=145
     && mouse.getY()>=150 & mouse.getY()<=230)
    {
        started =true;
    }
   }
}

if(started==true & once ==true)
{
    setBackground("paper.png");
    cleanup();
    once = false;
    setLevel(1);
}
if(fall)
{
    end();
}
if(killed)
{
    end();
}
}

public void cleanup()
{
    removeObjects(getObjects(doodler.class));
    removeObjects(getObjects(ground.class));
}

public void setLevel1(int level)
{
    switch(level)
    {
        case 1: gamePlay(); break;
    }
}

    public void gameplay()
{
    addObject(new doodler(), getWidht()/2, 300);
    addObject(new ground(false),28,391);
    addObject(new ground(false), 83,391);
    addObject(new ground(false), 83+55,391);
    addObject(new ground(false), 83+55+55,391);
    addObject(new ground(false), 83+55+55+55,391);
    addObject(new ground(false), 83+55+55+55+55,391);
        
    addObject(new ground(), Greenfoot.getRandomNumber(300), 250);
    addObject(new ground(), Greenfoot.getRandomNumber(300), 150);
    addObject(new ground(), Greenfoot.getRandomNumber(300), 50);
    addObject(new scoreKeeper(), 253,385);
}

public void end()
{
    cleanup(); 
    started=false;
    bStarted=false;
    addObject(new ground(), 56, 317);
    addObject(new doodler(false), 56,200);
    
    setBackground("title.png");
    getBackground().srtTransparency(255);
    once = true; 
    started = false;
    height = 0;
    fall = false;
    killed = false;
    ended = false;
}
}
    

