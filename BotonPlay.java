import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class BotonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonPlay extends BotonesMenu
{
    private GreenfootImage image1; 
    private GreenfootImage image2; 
    private MenuPrincipal m; 
    /**
     * Act - do whatever the BotonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        cambiaimagen();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("efecto1.mp3");
            World in = getWorld();
            in = new Instrucciones();
            Greenfoot.setWorld(in);
        }
    }
    public void cambiaimagen()
    {
        image1 = new GreenfootImage ("BotonPlay2.png");
        image2= new GreenfootImage ("BotonPlay1.png");
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
