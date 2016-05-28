import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonResultado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonResultado extends BotonesMenu
{
    private GreenfootImage image1; 
    private GreenfootImage image2; 
    private MenuPrincipal m;
    private int PtsA1, PtsA2, PtsW1, PtsW2, PtsM1, PtsM2, PtsL1, PtsL2;
    /**
     * Act - do whatever the BotonResultado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        cambiaimagen();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("efecto1.mp3");
            World a = getWorld();
            a = new Resultado(PtsA1, PtsA2, PtsW1, PtsW2, PtsM1, PtsM2, PtsL1, PtsL2);
            Greenfoot.setWorld(a);
        }
    }  
    
    public void cambiaimagen()
    {
        image1 = new GreenfootImage ("Resultado2.png");
        image2= new GreenfootImage ("Resultado1.png");
         if(Greenfoot.mouseMoved(this))
        {
            setImage(image1);
        }
        else if(Greenfoot.mouseMoved(m))
        {
            setImage(image2);
        }
     } 
     
     public BotonResultado(int PtA1,int PtA2,int PtW1,int PtW2,int PtM1,int PtM2,int PtL1,int PtL2)
     {
       PtsA1 = PtA1;
       PtsA2 = PtA2;
       PtsW1 = PtW1;
       PtsW2 = PtW2;
       PtsM1 = PtM1;
       PtsM2 = PtM2;
       PtsL1 = PtL1;
       PtsL2 = PtL2;
             
     }
}
