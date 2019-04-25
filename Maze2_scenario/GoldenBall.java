import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenBall extends Actor
{
    /**
     * Act - do whatever the GoldenBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        key();
        win();
        fall();
        lunch();
    }    

    public boolean canMove(int x, int y)
    {

        Actor sand;
        sand=getOneObjectAtOffset(x,y,sandroad.class);
        //the section below checks if there is a block you can move to
        // if there is it sets sand to a vlaue otherwise it says null
        boolean flag=false;
        if (sand !=null)
        {
            flag=true;
                    
        }
        return flag;
    }

    public void key()
    {
        //Note 1: Down the page increase the y value and going to the right increases the x value
        //Note 2: Each block is 60 pixels wide and high 
        int leftChange=-60;//choose the appropriate left step size ; 
        int rightChange=60;//choose the appropriate right step size ; 
        int upChange=-60;//choose the appropriate up step size ; 
        int downChange=60;//choose the appropriate down step size ; 
        if (Greenfoot.isKeyDown("left"))
        {
            if (canMove(leftChange, 0)==true){
                setLocation(getX()+leftChange, getY()) ;}
                Greenfoot.playSound("move.wav"); //(Sound-Ideas,2014)
        }
        if (Greenfoot.isKeyDown("right"))
        {
            if (canMove(rightChange, 0)==true){
                setLocation(getX()+rightChange, getY()) ;}
                Greenfoot.playSound("move.wav"); //(Sound-Ideas,2014)
        }
        if (Greenfoot.isKeyDown("up"))
        {
            if (canMove(0, upChange)==true){
                setLocation(getX(), getY()+upChange) ;}
        }
        if (Greenfoot.isKeyDown("down"))
        {
            if (canMove(0, downChange)==true){
                setLocation(getX(), getY()+downChange) ;}
        }
    }

    public void fall(){
        // this section makes the ball to fall automatically whenever there is block below
        int vSpeed=30;
         if(canMove(0,vSpeed)==true){
           setLocation(getX(), getY()+vSpeed) ;
           Greenfoot.playSound("fall.wav"); //(Volkovsound,2017)
            
        }
    } 
    
    public void lunch()
    {
        Actor fd=getOneObjectAtOffset(0,0,Food.class);
        //this portion make the ball to eat the lunch ie, grapes
        if(fd != null)
        {
            getWorld().removeObject(fd); //(Stewart,2018)
            Greenfoot.playSound("eat.wav"); //(Volkovsound,2017)
        }
    }
    
   
    public void win()
    {
           // stops the game when ball reach to the goal
           //display congratulation message
        Actor win;
        win=getOneObjectAtOffset(0,0,Goal.class);
        if (win !=null)
        {
           World myWorld=getWorld();
           Congrats cong=new Congrats();
           myWorld.addObject(cong,myWorld.getWidth()/2,myWorld.getHeight()/2); //(Greenfoot,2013) 
                                
           Greenfoot.stop();
           Greenfoot.playSound("finish.wav"); //(Sound-Ideas,2014)
         
        }
    }
}

