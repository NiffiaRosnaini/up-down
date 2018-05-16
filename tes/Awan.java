import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends World
{
    boolean bStarted, started = false;
    boolean once;
    int transparency = 0;
    int scrollSpeed;
    boolean scroll;
    boolean fall;
    boolean ended;
    boolean killed;
    int height = 0;
    int AwanX;
    
    /**
     * Constructor for objects of class Awan.
     * 
     */
    public Awan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 400, 1, false); 
        
        addObject(new awanGround(), 56,317);
        addObject(new Bola(false), 56, 200);
        setPaintOrder(Skor.class, Bola.class, awanGround.class, peluru.class);
        setBackground("background.png");
        getBackground().setTransparency(255);
        once = true;
        started = false;
        height = 0;
        fall = false;
        ended = false;
        killed = false;
    }
    
    public void act()
    {
        {if (Greenfoot.getRandomNumber(1000) > 998 & started==true)
            {
                int x = Greenfoot.getRandomNumber(300);
                int y = Greenfoot.getRandomNumber(150);
                addObject(new pesawat(), x, y);
            }
        }
               
        {if(bStarted==false & Greenfoot.mouseMoved(this))
            {
                bStarted = true;
            }
        }
            
        if(started==false & bStarted==true)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
        
            if(Greenfoot.mouseClicked(this))
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
            setBackground("bg.png");
            cleanup();
            once = false;
            setLevel1(1);
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
        removeObjects(getObjects(Bola.class));
        removeObjects(getObjects(awanGround.class));
    }

    public void setLevel1(int level)
    {
        switch(level)
        {
            case 1: gamePlay(); break;
        }
    }
    
    public void play()
    {
        
    }
    
    public void gamePlay()
    {
        addObject(new Bola(true), getWidth()/2, 300);
        addObject(new awanGround(false), 28, 391);
        addObject(new awanGround(false), 83, 391);
        addObject(new awanGround(false), 83+55, 391);
        addObject(new awanGround(false), 83+55+55, 391);
        addObject(new awanGround(false), 83+55+55+55, 391);
        addObject(new awanGround(false), 83+55+55+55+55, 391);
        
        addObject(new awanGround(), Greenfoot.getRandomNumber(300), 250);
        addObject(new awanGround(), Greenfoot.getRandomNumber(300), 150);
        addObject(new awanGround(), Greenfoot.getRandomNumber(300), 50);
        addObject(new Skor(), 253,385);
    }
    
    public void end()
    {
        cleanup();
        started=false;
        bStarted=false;
        addObject(new awanGround(), 56, 317);
        addObject(new Bola(false), 56, 200);
        
        setBackground("bg.png");
        getBackground().setTransparency(255);
        once = true;
        started = false;
        height = 0;
        fall = false;
        killed = false;
        ended = false;
    }
}

