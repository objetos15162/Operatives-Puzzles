import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContenedorM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContenedorM extends Jugador
{
    private GreenfootImage imagen1,imagen2;
    private int jug, ptsM=0, ptsM2=0;
    /**
     * Act - do whatever the ContenedorM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imagen1 = new GreenfootImage ("MacCont.png");
        imagen2 = new GreenfootImage ("MacContv.png");
        setImage(imagen1);
        checa();
    }    
    
       public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(7, 6, clss);
        return actor != null;        
    }
    
    public void checa() 
    {
        if(canSee(Mac.class))
        {
             setImage(imagen2);
             if(jug==1)
                 ptsM++;
             else
                 ptsM2++;
        }
        
    }
    
    public ContenedorM(int opci)
    {
      jug=opci;
    }
    
    public int puntos()
    {
      return ptsM;
    }
    
    public int puntos2()
    {
      return ptsM2;
    }
}
