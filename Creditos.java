import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends World
{
    /**
     * Constructor for objects of class Creditos.
     * 
     */
    public Creditos()
    {    
        super(800, 600, 1); 
        BotonAtras BA = new BotonAtras();
        addObject(BA,150,550);
    }
}
