import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Andro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Andro extends Rompecabezas
{
    private ArrayList<GreenfootImage> imgan;
    private GreenfootImage a1,a2,a3,a4,a5,a6,a7,a8,a9;
     private int x=100,y=100;
    int i;

    /**
     * Act - do whatever the Andro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Andro(int tam,int ind) 
    {
       imgan = new ArrayList<GreenfootImage>();
       loading();
       
       if(tam >= 1 & tam <=3 & ind <2 )
       {
            setImage(imgan.get(ind));
       }
       if(tam >=4  & tam <=9 & ind <5 )
       {
            setImage(imgan.get(ind));
       }
       if(tam >= 10 & tam <=15 & ind <7 )
       {
            setImage(imgan.get(ind));
       }
       if(tam >= 16 & tam <=20 & ind <9 )
       {
            setImage(imgan.get(ind));
       }
    }
    public void loading()
    {
        a1=new GreenfootImage("android1.png");
        a2=new GreenfootImage("android2.png");
        a3=new GreenfootImage("android3.png");
        a4=new GreenfootImage("android4.png");
        a5=new GreenfootImage("android5.png");
        a6=new GreenfootImage("android6.png");
        a7=new GreenfootImage("android7.png");
        a8=new GreenfootImage("android8.png");
        a9=new GreenfootImage("android9.png");
        imgan.add(a1);
        imgan.add(a2);
        imgan.add(a3);
        imgan.add(a4);
        imgan.add(a5);
        imgan.add(a6);
        imgan.add(a7);
        imgan.add(a8);
        imgan.add(a9);
    }
}
