import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World

{
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        super(800, 600, 1); 
        agregaboto();
    }
    /**
     * Crea y mustra boton de comeenzar y atras
     */
    private void agregaboto()
    {
        BotonComenzar BC = new BotonComenzar();
        addObject(BC,650,550);
        BotonAtras BA = new BotonAtras();
        addObject(BA,150,550);
    }
}
