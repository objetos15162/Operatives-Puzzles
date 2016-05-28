import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonAtras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonAtras extends BotonesMenu
{
    private GreenfootImage image1; 
    private GreenfootImage image2; 
    private MenuPrincipal m; 
    /**
     * Act - do whatever the BotonAtras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        cambiaimagen();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("efecto1.mp3");
            World a = getWorld();
            a = new MenuPrincipal();
            Greenfoot.setWorld(a);
        }
    }    
    public void cambiaimagen()
    {
        image1 = new GreenfootImage ("BotonAtras2.png");
        image2= new GreenfootImage ("BotonAtras1.png");
         if(Greenfoot.mouseMoved(this))
        {
            setImage(image1);
        }
        else if(Greenfoot.mouseMoved(m))
        {
            setImage(image2);
        }
    }
}
