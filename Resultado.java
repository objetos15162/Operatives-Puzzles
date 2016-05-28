import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Resultado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resultado extends World
{   int ptsL, ptsW ,ptsM, ptsA;
    private Linu rl1,rl2,rl3,rl4,rl5,rl6,rl7,rl8,rl9;
    private Window rw1,rw2,rw3,rw4,rw5,rw6,rw7,rw8,rw9;
    private Maac rm1,rm2,rm3,rm4,rm5,rm6,rm7,rm8,rm9;
    private Andro ra1,ra2,ra3,ra4,ra5,ra6,ra7,ra8,ra9;
    private Jugador jug;
    private int PtsA1,PtsA2,PtsW1,PtsW2,PtsM1,PtsM2,PtsL1,PtsL2,pts;
    private int sj1,sj2;
    private int imaa,imaw,imam,imal;
    private winjug1 wj1;
    private winjug2 wj2;
    /**
     * Constructor for objects of class Resultado.
     * 
     */
    public Resultado(int PtA1,int PtA2,int PtW1,int PtW2,int PtM1,int PtM2,int PtL1,int PtL2)
    {    
        super(900, 600, 1);
        jug = new Jugador();
        PtsA1=PtA1;
        PtsA2=PtA2;
        PtsW1=PtW1;
        PtsW2=PtW2;
        PtsM1=PtM1;
        PtsM2=PtM2;
        PtsL1=PtL1;
        PtsL2=PtL2;
        
        sj1=PtsA1+PtsW1+PtsM1+PtsL1;
        sj2=PtsA2+PtsW2+PtsM2+PtsL2;
        
        wj1 = new winjug1();
        wj2 = new winjug2();
        
        if(sj1>=sj2)
        {
            imaa=PtsA1;
            imaw=PtsW1;
            imam=PtsM1;
            imal=PtsL1;
            addObject(wj1,455,300);
        }
        else
        {
            imaa=PtsA2;
            imaw=PtsW2;
            imam=PtsM2;
            imal=PtsL2;
            addObject(wj2,455,300);
        }
        generarompecab();
        muestrarompecab();
    }
    /**
    *Inicializalos objetos para las imagenes del rompecabezas
    */
   public void generarompecab()
   {
       rl1 = new Linu(imal,0);
       rl2 = new Linu(imal,1);
       rl3 = new Linu(imal,2);
       rl4 = new Linu(imal,3);
       rl5 = new Linu(imal,4);
       rl6 = new Linu(imal,5);
       rl7 = new Linu(imal,6);
       rl8 = new Linu(imal,7);
       rl9 = new Linu(imal,8);
       
       rw1 = new Window(imaw,0);
       rw2 = new Window(imaw,1);
       rw3 = new Window(imaw,2);
       rw4 = new Window(imaw,3);
       rw5 = new Window(imam,4);
       rw6 = new Window(imaw,5);
       rw7 = new Window(imaw,6);
       rw8 = new Window(imaw,7);
       rw9 = new Window(imaw,8);
       
       rm1 = new Maac(imam,0);
       rm2 = new Maac(imam,1);
       rm3 = new Maac(imam,2);
       rm4 = new Maac(imam,3);
       rm5 = new Maac(imam,4);
       rm6 = new Maac(imam,5);
       rm7 = new Maac(imam,6);
       rm8 = new Maac(imam,7);
       rm9 = new Maac(imam,8);
      
       ra1 = new Andro(imaa,0);
       ra2 = new Andro(imaa,1);
       ra3 = new Andro(imaa,2);
       ra4 = new Andro(imaa,3);
       ra5 = new Andro(imaa,4);
       ra6 = new Andro(imaa,5);
       ra7 = new Andro(imaa,6);
       ra8 = new Andro(imaa,7);
       ra9 = new Andro(imaa,8);
   }
   /**
    * Crea los objetos de cada uno de los 4 rompecabezas
    */
   public void muestrarompecab() //añadir posiciones
   {
       //linux
       addObject(rl1,135,80);
       addObject(rl2,235,80);
       addObject(rl3,335,80);
       addObject(rl4,135,170);
       addObject(rl5,235,170);
       addObject(rl6,335,170);
       addObject(rl7,135,260);
       addObject(rl8,235,260);
       addObject(rl9,335,260);
       //windows
       addObject(rw1,580,80);
       addObject(rw2,680,80);
       addObject(rw3,780,80);
       addObject(rw4,580,170);
       addObject(rw5,680,170);
       addObject(rw6,780,170);
       addObject(rw7,580,260);
       addObject(rw8,680,260);
       addObject(rw9,780,260);
       //mac
       addObject(rm1,135,340);
       addObject(rm2,235,340);
       addObject(rm3,335,340);
       addObject(rm4,135,430);
       addObject(rm5,235,430);
       addObject(rm6,335,430);
       addObject(rm7,135,520);
       addObject(rm8,235,520);
       addObject(rm9,335,520);
       //android
       addObject(ra1,580,340);
       addObject(ra2,680,340);
       addObject(ra3,780,340);
       addObject(ra4,580,430);
       addObject(ra5,680,430);
       addObject(ra6,780,430);
       addObject(ra7,580,520);
       addObject(ra8,680,520);
       addObject(ra9,780,520);
        
   }
}




