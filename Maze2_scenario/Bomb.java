import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       blast();
    }    
    
    public void blast()
    {
        Actor bom=getOneObjectAtOffset(0,0,GoldenBall.class);
        if(bom != null)
        {
             // stops the game when ball touches bomb
           //display gameover message
            getWorld().removeObject(bom); //(Stewart,2018)
            
             World myWorld=getWorld();
               Lose ls=new Lose();
               myWorld.addObject(ls,myWorld.getWidth()/2,myWorld.getHeight()/2); //(Greenfoot,2013) 
            
               Greenfoot.stop();
               Greenfoot.playSound("blast1.wav"); //(Volkovsound,2017)
               
        }
    }

}
