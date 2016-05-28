import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContenedorW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContenedorW extends Jugador
{
    private GreenfootImage imagen1,imagen2;
    private int  jug,ptsW=0,ptsW2=0;
    /**
     * Act - do whatever the ContenedorW wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imagen1 = new GreenfootImage ("WindowsCont.png");
        imagen2 = new GreenfootImage ("WindowsContv.png");
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
        if(canSee(Windows.class))
              {
             setImage(imagen2);
             if(jug==1)
                 ptsW++;
             else
                 ptsW2++;
        }
    }
    
      public ContenedorW(int opci)
    {
      jug=opci;
    }
    
    public int puntos()
    {
      return ptsW;
    }
    
    public int puntos2()
    {
      return ptsW2;
    }
}
