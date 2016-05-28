import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    public int PtsA1=0, PtsW1=0,PtsM1=0,PtsL1=0;
    public int PtsA2=0, PtsW2=0,PtsM2=0,PtsL2=0;
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jugador()
    {
        
    }
    
    public int puntosA1()
    {
        return PtsA1;
    }
}
