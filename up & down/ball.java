import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Benda
{
    private int kecepatan = 7;
    private int vKecepatan = 0;
    private int akselerasi = 2;
    private int lompatan = 12;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tombol();
        cekJatuh();
    }
    
    private void tombol()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("ball-left.png");
            gerakKiri();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("ball-right.png");
            gerakKanan();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            loncat();  
        }
    }

    public Void loncat()
    {
        vKecepatan = -lompatan;
        jatuh();
    }

    public void cekJatuh()
    {
        if(dipapan())
        {
            vKecepatan = 0;
        }
        else
        {
            jatuh();
        }
    }
    
    public boolean dipapan()
    {
        Actor bawah = getOneObjectAtOffset(0, getHeight() / 2, Papan.class);
        return bawah !=null;
    }

    public void jatuh()
    {
        setLocation(getX(), getY() + vSpeed);
        vKecepatan = vKecepatan + akselerasi;
    }

    public void gerakKanan()
    {
        setLocation (getX() + speed, getY());
    }

    public void gerakKiri()
    {
        setLocation (getX() - speed, getY());
    }
}