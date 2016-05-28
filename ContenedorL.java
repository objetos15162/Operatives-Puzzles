import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContenedorL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContenedorL extends Jugador
{
    private GreenfootImage imagen1,imagen2;
    private int jug, ptsL=0, ptsL2=0;
    
    /**
     * Act - do whatever the ContenedorL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imagen1 = new GreenfootImage ("LinuxCont.png");
        imagen2 = new GreenfootImage ("LinuxContv.png");
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
          if(canSee(Linux.class))
          {
             setImage(imagen2);
             if(jug==1)
                 ptsL++;
             else
                 ptsL2++;
          }
    }
    
    public ContenedorL(int opci)
    {
      jug=opci;
    }
    
    public int puntos()
    {
      return ptsL;
    }
    
    public int puntos2()
    {
      return ptsL2;
    }
}




