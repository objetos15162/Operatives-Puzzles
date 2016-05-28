import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window extends Rompecabezas
{
    private ArrayList<GreenfootImage> imgwin;
    private GreenfootImage w1,w2,w3,w4,w5,w6,w7,w8,w9;
    private int x=100,y=100;
    int i;

    /**
     * Act - do whatever the Window wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Window(int tam,int ind) 
    {
       imgwin = new ArrayList<GreenfootImage>();
       loading();
       
        if(tam >= 1 & tam <=5 & ind <2 )
       {
            setImage(imgwin.get(ind));
       }
       if(tam >=6  & tam <=12 & ind <4 )
       {
            setImage(imgwin.get(ind));
       }
       if(tam >= 13 & tam <=18 & ind <6 )
       {
            setImage(imgwin.get(ind));
       }
       if(tam >= 19 & tam <=24 & ind <9 )
       {
            setImage(imgwin.get(ind));
       }
    } 
   
    public void loading()
    {
        w1=new GreenfootImage("win1.png");
        w2=new GreenfootImage("win2.png");
        w3=new GreenfootImage("win3.png");
        w4=new GreenfootImage("win4.png");
        w5=new GreenfootImage("win5.png");
        w6=new GreenfootImage("win6.png");
        w7=new GreenfootImage("win7.png");
        w8=new GreenfootImage("win8.png");
        w9=new GreenfootImage("win9.png");
        imgwin.add(w1);
        imgwin.add(w2);
        imgwin.add(w3);
        imgwin.add(w4);
        imgwin.add(w5);
        imgwin.add(w6);
        imgwin.add(w7);
        imgwin.add(w8);
        imgwin.add(w9);
    }
}
 
