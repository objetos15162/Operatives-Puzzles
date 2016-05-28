import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private ArrayList<Elementos> Image,Image2;
    private ArrayList<Jugador> conte1,conte2;
    private jugador1 jug1;
    private jugador2 jug2;
    private int band, numimag = 0, numimag2 = 0, vel=1, vel2=0;      
    private int lim1=0, lim2=413, lim3=490, lim4=900;
    private String tec3="left", tec4="right", tec1="a", tec2="s";    
    private int recorrido = 0, recorrido2 ;
    private Jugador jug;
    private int PtsA1,PtsA2,PtsW1,PtsW2,PtsM1,PtsM2,PtsL1,PtsL2;
    private int banderaniv;
    
    ContenedorL  CL2 = new ContenedorL(0);
    ContenedorW  CW2 = new ContenedorW(0);
    ContenedorM  CM2 = new ContenedorM(0);
    ContenedorA  CA2 = new ContenedorA(0);  
    ContenedorL  CL = new ContenedorL(1);
    ContenedorW  CW = new ContenedorW(1);
    ContenedorM  CM = new ContenedorM(1);
    ContenedorA  CA = new ContenedorA(1);
     
    /**
     * Constructor for objects of class Juego.
     * 
     */       
    public Juego()
    {
        super(900,600,1);
        Image = new ArrayList<Elementos>(); 
        Image2 = new ArrayList<Elementos>();
        conte1= new ArrayList<Jugador>();
        conte2= new ArrayList<Jugador>();
        cargaimagenes(lim1,lim2,tec1,tec2); 
        cargaimagenes2(lim3,lim4,tec3,tec4); 
  
        Contenedores();
        jug1 = new jugador1();  
        jug2 = new jugador2(); 
        addObject(jug1,0,0);
        addObject(jug2,900,0);
        jug1.juega();
        jug2.juega();
       }
    

    /**
     * Metodo para insertar las imagenes de la lista en el mundo
     */
    public void insertaobj(int band)
    {
        if(recorrido == 0)
        { 
            if(numimag<22)
            {
                if(band==0) 
                {
                    addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                    numimag++;
                }
                //condicion para determinar el resto de los elementos siempre y cuando sea true
                //donde true es que el objeto aun no llega abajo
                if(band == 1)
                {   
                    addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                    numimag++;
                }
            }
            else
            {  
                numimag=0;
                recorrido =1;
            }
        }
        
       if(recorrido == 1)
        {
            if(numimag<22)
            {
                if(band==0) 
                {
                    addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                    numimag++;
                }   
                //condicion para determinar el resto de los elementos siempre y cuando sea true
                //donde true es que el objeto aun no llega abajo
                if(band == 1)
                {   
                    addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                    numimag++;
                }
            }
            else
            {
                numimag=0;
                recorrido++;
            }
       }
       
       if(recorrido == 2)
        {
        if(numimag<22)
        {
            if(band==0) 
            {
                addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                numimag++;
            }
            if(band == 1)
            {   
                addObject(Image.get(numimag),Greenfoot.getRandomNumber(400),100);
                numimag++;
            }
        }
        else
        {
            numimag=0;
            banderaniv=0;
        }
        }
    }
   
    public void insertaobj2(int band)
    {
      if(recorrido2 == 0)
        if(numimag2<22)
        {
              if(band==0) 
              {
                addObject(Image2.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
              }
              if(band == 1)
              {   
                addObject(Image2.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
              } 
       }
        else
        {
            numimag2=0;
            recorrido2=1;
        }
        
       if(recorrido2 == 1)
        {
        if(numimag2<22)
        {
            if(band==0) 
            {
                addObject(Image2.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
            }
            if(band == 1)
            {   
                addObject(Image2.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
            }
        }
        else
        {
            numimag2=0;
            recorrido2=2;
        }
        }
        
        if(recorrido2 == 2)
        {
        if(numimag2<22)
        {
            if(band==0) 
            {
                addObject(Image.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
            }
            if(band == 1)
            {   
                addObject(Image2.get(numimag2),Greenfoot.getRandomNumber(400)+500,100);
                numimag2++;
            }
        }
        else
        {
            numimag2=0;
            Puntajes();
            BotonResultado BR= new BotonResultado(PtsA1,PtsA2,PtsW1,PtsW2,PtsM1,PtsM2,PtsL1,PtsL2);
            addObject(BR,450,300);
        }
        }
        
    }    

    /**
     * Metodo que elimina el objeto que esta actualmente en el mundo con un
     * contador numimag que recorre la lista
     */
    public void eliminaobj()
    {
        removeObject(Image.get(numimag - 1));
    }
    /**
     * Elimina objeto para jugador 2
     */
    public void eliminaobj2()
    {
        removeObject(Image2.get(numimag2 - 1));
    }
    
    /**
     * Metodo que muestra los contenedores de linux,mac,windows,android
     */
    public void Contenedores()
     {
        addObject(CW,80,560);
        addObject(CM,180,560);
        addObject(CA,280,560);
        addObject(CL,380,560);
        //contenedores para segundo jugador      
        addObject(CW2,530,560);
        addObject(CM2,630,560);
        addObject(CA2,730,560);
        addObject(CL2,830,560);
    }
    /**
     * Regrega el contenedor actual
     */
    public  ContenedorL dimeCont()
    {
      return CL2;
    }
    /**
     * Metodo que carga las imagenes que caeran durante el juego 
     */
    public void cargaimagenes(int lims1, int lims2, String tc1, String tc2)
    {
        // Crea objetos de jugadores
        Tux t = new Tux(lims1,lims2,tc1,tc2,1);
        LogoUbuntu lu = new LogoUbuntu(lims1,lims2,tc1,tc2,1);
        Linus l = new Linus(lims1,lims2,tc1,tc2,1);
        EsLin es= new EsLin(lims1,lims2,tc1,tc2,1);
        Sofubu su= new Sofubu(lims1,lims2,tc1,tc2,1);
        LogoApple la= new LogoApple(lims1,lims2,tc1,tc2,1);
        Steve s= new Steve(lims1,lims2,tc1,tc2,1);
        Macintosh ma= new Macintosh(lims1,lims2,tc1,tc2,1);
        Esmac em= new Esmac(lims1,lims2,tc1,tc2,1);
        Errorm erm= new Errorm(lims1,lims2,tc1,tc2,1);
        Iphone ip= new Iphone(lims1,lims2,tc1,tc2,1);
        LogoWindows lw= new LogoWindows(lims1,lims2,tc1,tc2,1);
        Bill b= new Bill(lims1,lims2,tc1,tc2,1);
        Micro mi = new Micro(lims1,lims2,tc1,tc2,1);
        Eswin ew= new Eswin(lims1,lims2,tc1,tc2,1);
        Office of= new Office(lims1,lims2,tc1,tc2,1);
        Xbox x= new Xbox(lims1,lims2,tc1,tc2,1);
        LogoAndroid lan = new LogoAndroid(lims1,lims2,tc1,tc2,1);
        Rubin r= new Rubin(lims1,lims2,tc1,tc2,1);
        Google go = new Google(lims1,lims2,tc1,tc2,1);
        Esand ea = new Esand(lims1,lims2,tc1,tc2,1);
        Play ps = new Play(lims1,lims2,tc1,tc2,1);
        
        // agregar a lista los objetos
        
        Image.add(ew);
        Image.add(of);
        Image.add(x);
        Image.add(t);
        Image.add(lu);
        Image.add(l);       
        Image.add(la);
        Image.add(s);
        Image.add(ps);
        Image.add(go);
        Image.add(ma);
        Image.add(em);
        Image.add(erm);
        Image.add(ip);
        Image.add(lw);
        Image.add(b);
        Image.add(mi);
        Image.add(es);
        Image.add(su);
        Image.add(lan);
        Image.add(r);
        Image.add(ea);
        
    }
   /**
    * Crea lista de imagenes para jugador 2
    */
      public void cargaimagenes2(int lims1, int lims2, String tc1, String tc2)
    {
        // Crea objetos de jugadores
        Tux t = new Tux(lims1,lims2,tc1,tc2,2);
        LogoUbuntu lu = new LogoUbuntu(lims1,lims2,tc1,tc2,2);
        Linus l = new Linus(lims1,lims2,tc1,tc2,2);
        EsLin es= new EsLin(lims1,lims2,tc1,tc2,2);
        Sofubu su= new Sofubu(lims1,lims2,tc1,tc2,2);
        LogoApple la= new LogoApple(lims1,lims2,tc1,tc2,2);
        Steve s= new Steve(lims1,lims2,tc1,tc2,2);
        Macintosh ma= new Macintosh(lims1,lims2,tc1,tc2,2);
        Esmac em= new Esmac(lims1,lims2,tc1,tc2,2);
        Errorm erm= new Errorm(lims1,lims2,tc1,tc2,2);
        Iphone ip= new Iphone(lims1,lims2,tc1,tc2,2);
        LogoWindows lw= new LogoWindows(lims1,lims2,tc1,tc2,2);
        Bill b= new Bill(lims1,lims2,tc1,tc2,2);
        Micro mi = new Micro(lims1,lims2,tc1,tc2,2);
        Eswin ew= new Eswin(lims1,lims2,tc1,tc2,2);
        Office of= new Office(lims1,lims2,tc1,tc2,2);
        Xbox x= new Xbox(lims1,lims2,tc1,tc2,2);
        LogoAndroid lan = new LogoAndroid(lims1,lims2,tc1,tc2,2);
        Rubin r= new Rubin(lims1,lims2,tc1,tc2,2);
        Google go = new Google(lims1,lims2,tc1,tc2,2);
        Esand ea = new Esand(lims1,lims2,tc1,tc2,2);
        Play ps = new Play(lims1,lims2,tc1,tc2,2);
        
        // agregar a lista los objetos
        Image2.add(t);
        Image2.add(lu);               
        Image2.add(s);
        Image2.add(ma);
        Image2.add(em);
        
        Image2.add(lw);
        Image2.add(b);
        Image2.add(su);
        Image2.add(la);
        Image2.add(mi);
        Image2.add(l);
        Image2.add(es);
        Image2.add(ew);
        Image2.add(of);
        Image2.add(x);
        Image2.add(lan);
        Image2.add(r);
        Image2.add(ea);
        Image2.add(ps);
        Image2.add(go);
        Image2.add(erm);
        Image2.add(ip);
    }
   /**
    * Genera puntajes de cada tipo de sistema para jugador 1 y 2
    */
   public void Puntajes()
   { 
     PtsA1=CA.puntos();
     PtsA2=CA2.puntos2();
     PtsL1=CL.puntos();
     PtsL2=CL2.puntos2();
     PtsW1=CW.puntos();
     PtsW2=CW2.puntos2();
     PtsM1=CM.puntos();
     PtsM2=CM2.puntos2();
   }
}


