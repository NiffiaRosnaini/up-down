import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    float ys,xs;
    int x,y;
    boolean canMove;
    GreenfootImage left = new GreenfootImage("ball.png");
    GreenfootImage right = new GreenfootImage("ball.png");
    GreenfootImage shooting = new GreenfootImage("ball 2.png");
    awanGround Ground = new awanGround();
    int srollSpeed;
    int hits = 0;
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Bola() 
    {
        left.mirrorHorizontally();
        shooting.scale(25,40);
        canMove = true;
    }    
    
    protected void addedToWorld(World world)
    {
        x = getX();
        y = getY();
    }
    
    public Bola(boolean moveable)
    {
        canMove = moveable;
    }
    
    public void act()
    {
        x= getX();
        y = getY();
        
        ((Awan) getWorld()).AwanX = getX();
        if(((Awan) getWorld()).fall==false)
        {
            bounce();
        }
        if(canMove)
            keys();
        if(ys>11)
            ys = 10;
            
        setLocation(x+(int)xs,y+(int)ys);
        
        gravity();
        wrapAround();
        
        if(canMove & y < 400)
            scrollUp();
            
        if(y>400)
            fall();
            
        ((Awan) getWorld()).height = hits;
        
        scout();   
    }
    
    public void gravity()
    {
        ys += 0.3f;
    }
    
    public void bounce()
    {
        awanGround Ground = (awanGround) getOneIntersectingObject(awanGround.class);
        if(Ground != null & ys >0)
        {
            ys = -10;
            if(canMove & !Ground.hasBeenBounced)
            {
                Ground.hasBeenBounced=true;
                {
                    getWorld().addObject(new awanGround(), Greenfoot.getRandomNumber(300), 0);
                    getWorld().addObject(new awanGround(), Greenfoot.getRandomNumber(300), 70);
                }
            }
        }
    }
    
    public void keys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            xs += 0.25f;
            setImage(right);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            xs -= 0.25f;
            setImage(left);
        }
        if(!Greenfoot.isKeyDown("left") & !Greenfoot.isKeyDown("right") & xs !=0)
        {
            xs = 0;
        }
        if(Greenfoot.isKeyDown("space") & getWorld().getObjects(peluru.class).isEmpty())
        {
            setImage(shooting);
            getWorld().addObject(new peluru(), x, y);
        }
    }
    
    public void wrapAround()
    {
        if(x>30)
        {
            setLocation(0,getY());
        }
        if(x<0)
        {
            setLocation(300,getY());
        }
    }
    
    public void scrollUp()
    {
        if(y<=200 & y>100)
        {
            ((Awan) getWorld()).scrollSpeed = (int) -ys;
            ((Awan) getWorld()).scroll = true;
            hits++;
        }
        else
        {
            ((Awan) getWorld()).scroll = false;
        }
    }
    
    public void fall()
    {
        ((Awan) getWorld()).fall = true;
        ((Awan) getWorld()).scrollSpeed = (int) -ys;
    }
    
    public void scout()
    {
        if(y<0 & getWorld().getObjects(petunjuk.class).isEmpty())
        {
            getWorld().addObject(new petunjuk(), getX(), 20);
        }
        if(y>0 & !getWorld().getObjects(petunjuk.class).isEmpty())
        {
            getWorld().removeObjects(getWorld().getObjects(petunjuk.class));
        }
    }
}

    