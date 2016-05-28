import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LogoUbuntu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogoUbuntu extends Linux
{
    private int aux1,aux2,jug;
    private String tec1,tec2;
    /**
     * Act - do whatever the LogoUbuntu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Elementos(aux1,aux2,tec1,tec2,jug);
    }
    
    public LogoUbuntu(int lim1, int lim2, String tecla1, String tecla2, int juga)
    {
     aux1=lim1;
     aux2=lim2;
     tec1=tecla1;
     tec2=tecla2;
     jug=juga;
    }
}
