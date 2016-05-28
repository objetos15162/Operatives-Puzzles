import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Linu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linu extends Rompecabezas
{
    private GreenfootImage im1,im2,im3,im4,im5,im6,im7,im8,im9;
    private ArrayList<GreenfootImage> imagenes;
    int i;

    /**
     * Act - do whatever the Linu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Linu(int tam,int ind)
    {
       imagenes= new ArrayList<GreenfootImage>();
       loading();
       if(tam >= 1 & tam <=5 & ind <1 )
       {
            setImage(imagenes.get(ind));
       }
       if(tam >=6  & tam <=10 & ind < 4 )
       {
            setImage(imagenes.get(ind));
       }
       if(tam >= 11 & tam <=15 & ind <6 )
       {
            setImage(imagenes.get(ind));
       }
       if(tam >= 16 & tam <=20 & ind <9 )
       {
            setImage(imagenes.get(ind));
       }
    }
    
    public void loading()
    {
        im1=new GreenfootImage("linux1.png");
        im2=new GreenfootImage("linux2.png");
        im3=new GreenfootImage("linux3.png");
        im4=new GreenfootImage("linux4.png");
        im5=new GreenfootImage("linux5.png");
        im6=new GreenfootImage("linux6.png");
        im7=new GreenfootImage("linux7.png");
        im8=new GreenfootImage("linux8.png");
        im9=new GreenfootImage("linux9.png");
        imagenes.add(im1);
        imagenes.add(im2);
        imagenes.add(im3);
        imagenes.add(im4);
        imagenes.add(im5);
        imagenes.add(im6);
        imagenes.add(im7);
        imagenes.add(im8);
        imagenes.add(im9);
    }
}
