import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elemtos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elementos extends Jugador
{
    private int x,y,ax;  
    private int limite1,limite2,band,jug,vel; 
    private String tecla1,tecla2;
    private boolean aux= false;
    /**
     * Act - do whatever the Elemtos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Elementos(int lim1, int lim2, String tec1, String tec2, int juga) 
    {  
        limite1= lim1;
        limite2= lim2;
        tecla1=tec1;
        tecla2=tec2;
        jug=juga;
        movilidad();
    }
    
    /**
     * Metodo con las condiciones de movimiento de una imagen
     */
    public void movilidad( )
    {
       x=getX(); 
       y=getY(); 
       if(y<600)   
       {
           y++; 
           if(jug==1)
               mover(x,y);
           else
               mover2(x,y);
           if(x>limite1 & x<limite2)
           {

               if(Greenfoot.isKeyDown(tecla1))
               {
                   x=x-3;
                 if(jug==1)
                    mover(x,y);
                 else
                    mover2(x,y);
              }
              if(Greenfoot.isKeyDown(tecla2))
              {
                  x=x+3;
                 if(jug==1)
                    mover(x,y);
                 else
                    mover2(x,y);
              }
           }
           //condiciones de los contenedores al momento de tocar alguno
           if(canSee(ContenedorL.class))
               y =570;
           
           if(canSee(ContenedorM.class))
                y =570;
           
           if(canSee(ContenedorA.class))
               y =570;
           
           if(canSee(ContenedorW.class))
               y =570;
           
           /* cuando la imagen llega hasta al final  se elimina y se inserta 
           la siguiente de la lista
           */
           
           if(y==570 )
           {
                Juego mund2 = (Juego) getWorld(); //se obtiene el mundo de juego
                if(jug==1){
                    setLocation(Greenfoot.getRandomNumber(400),100);
                    mund2.eliminaobj(); // accesando al mundo de juego por medio de la variable mund2 para eliminar la iamgen que llego a final del mundo
                    mund2.insertaobj(1); // se inserta imagen siguiente de la lista en la posicion del metodo de setLocation
                }   
                 else{                 
                    setLocation(Greenfoot.getRandomNumber(400)+500,100); // metodo para definir la posicion de la siguiente imagen
                    mund2.eliminaobj2(); // accesando al mundo de juego por medio de la variable mund2 para eliminar la iamgen que llego a final del mundo
                    mund2.insertaobj2(1); // se inserta imagen siguiente de la lista en la posicion del metodo de setLocation 
                }
           }
       }      
    }
    
    /**
     * Determina los limites para cada jugador
     */ 
    public void mover2(int X, int Y) 
    {
        if(x>=873)  
            x=873;            
        if(x<=500)
            x=500;
        setLocation(x,y); 
    }
    
       public void mover(int X, int Y) 
    {
        if(x>=410)  
            x=410;            
        if(x<=30)
            x=30;
        setLocation(x,y); 
    }
    
    /**
     * Se utiliza una bandera booleana para determinar si el objeto que se tiene en el mundo toca con el objeto o clase de algun contenedor
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(1, 1, clss);
        return actor != null;        
    }
}

