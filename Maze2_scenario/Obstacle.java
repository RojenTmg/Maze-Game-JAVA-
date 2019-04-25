import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        over();
    }
    
    public void movement()
    {
        move(30);
        if(isAtEdge()) 
        {
            turn(180);
        }  
        
    }    
         
    public void over()
    {
        // stops the game when ball touches obstacle
           //display gameover message
        Actor gol=getOneObjectAtOffset(0,0,GoldenBall.class);
        if(gol != null)
        {
           getWorld().removeObject(gol); //(Stewart,2018)
           World myWorld=getWorld();
           Lose ls=new Lose();
           myWorld.addObject(ls,myWorld.getWidth()/2,myWorld.getHeight()/2); //(Greenfoot,2013) 
                 
           Greenfoot.stop();    
           Greenfoot.playSound("gameover.wav"); 
           
        } 
    }
}