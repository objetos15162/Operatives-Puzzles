import greenfoot.*;  
import greenfoot.GreenfootImage;
/**
 * Write a description of class MenuPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPrincipal extends World
{
    /**
     * Constructor for objects of class MenuPrincipal.
     * 
     */
    public MenuPrincipal()
    {    
        super(800, 600, 1); 
        InsertaMenu(); 
    }
    private void InsertaMenu()
    {
        BotM Log= new BotM();
        addObject(Log,180,150);
        BotonPlay B1 = new BotonPlay();
        addObject(B1,200,350);
        BotonCredit B3 = new BotonCredit();
        addObject(B3,200,410);
        BotonExit B4 = new BotonExit();
        addObject(B4,200,470);
    }
}
