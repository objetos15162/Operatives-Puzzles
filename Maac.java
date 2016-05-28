import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Maac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maac extends Rompecabezas
{
    private ArrayList<GreenfootImage> imgma;
    private GreenfootImage m1,m2,m3,m4,m5,m6,m7,m8,m9;
    /**
     * Act - do whatever the Maac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Maac(int tam,int ind) 
    {
       imgma = new ArrayList<GreenfootImage>();
       loading();
       if(tam >= 1 & tam <=3 & ind <1 )
       {
            setImage(imgma.get(ind));
       }
       if(tam >=6  & tam <=12 & ind <4 )
       {
            setImage(imgma.get(ind));
       }
       if(tam >= 13 & tam <=18 & ind <7 )
       {
            setImage(imgma.get(ind));
       }
       if(tam >= 19 & tam <=24 & ind <9 )
       {
            setImage(imgma.get(ind));
       }
    }   
    
    public void loading()
    {
        m1=new GreenfootImage("mac1.png");
        m2=new GreenfootImage("mac2.png");
        m3=new GreenfootImage("mac3.png");
        m4=new GreenfootImage("mac4.png");
        m5=new GreenfootImage("mac5.png");
        m6=new GreenfootImage("mac6.png");
        m7=new GreenfootImage("mac7.png");
        m8=new GreenfootImage("mac8.png");
        m9=new GreenfootImage("mac9.png");
        imgma.add(m1);
        imgma.add(m2);
        imgma.add(m3);
        imgma.add(m4);
        imgma.add(m5);
        imgma.add(m6);
        imgma.add(m7);
        imgma.add(m8);
        imgma.add(m9);
    }
}
