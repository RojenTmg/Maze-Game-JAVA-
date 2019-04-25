import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze extends World
{

    /**
     * Constructor for objects of class Maze.
     * 
     */

    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 850, 1); 
        for (int loop=40;loop<960;loop=loop+60)
        {
            addObject(new sandroad(), loop,50);
            addObject(new sandroad(), loop,230);
            addObject(new sandroad(), loop,410);
            addObject(new sandroad(), loop,590);
            addObject(new sandroad(), loop,770);
            for (int loop_2=0;loop_2<=1;loop_2=loop_2+1)
            {
                addObject(new sandroad(), 100,110+(loop_2*60));
                addObject(new sandroad(), 340,110+(loop_2*60));
                addObject(new sandroad(), 580,110+(loop_2*60));
                addObject(new sandroad(), 160,290+(loop_2*60));
                addObject(new sandroad(), 400,290+(loop_2*60));
                addObject(new sandroad(), 700,290+(loop_2*60));
                addObject(new sandroad(), 100,470+(loop_2*60));
                addObject(new sandroad(), 340,470+(loop_2*60));
                addObject(new sandroad(), 760,470+(loop_2*60));
                addObject(new sandroad(), 160,650+(loop_2*60));
                addObject(new sandroad(), 400,650+(loop_2*60));
            }
        }
        addObject(new Goal(), 40,770);
        addObject(new GoldenBall(),940 ,50);

        addObject(new Obstacle(),40,230);
        addObject(new Obstacle(),940,410);
        addObject(new Obstacle(),350,590);
        addObject(new Obstacle(),590,770); 

        addObject(new Food(),580,170);
        addObject(new Food(),160,50);
        addObject(new Food(),880,230);
        addObject(new Food(),160,290); 
        addObject(new Food(),640,410);
        addObject(new Food(),100,530);
        addObject(new Food(),760,590);
        addObject(new Food(),400,710);
        addObject(new Food(),640,770);
        
        addObject(new Bomb(),340,170);
        addObject(new Bomb(),580,410);
        addObject(new Bomb(),280,590);
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
