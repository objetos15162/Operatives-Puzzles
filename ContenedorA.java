import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContenedorA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContenedorA extends Jugador
{
    private GreenfootImage imagen1,imagen2;
    private int jug, ptsA=0, ptsA2=0 ;
    /**
     * Act - do whatever the ContenedorA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imagen1 = new GreenfootImage ("AndroidCont.png");
        imagen2 = new GreenfootImage ("AndroidContv.png");
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
        if(canSee(Android.class))
        {
             setImage(imagen2);
             if(jug==1)
                 ptsA++;
             else
                 ptsA2++;
        }
    }
    
    public int puntos()
    {
      return ptsA;
    }
    
    public int puntos2()
    {
      return ptsA2;
    }
    
    public ContenedorA(int opci)
    {
      jug=opci;
    }
}




