
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class ProgrammingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live in
        City kw = new City();
        
        // make robot to live in city, and position him at (1,1) facing East
        Robot karel = new Robot (kw, 1, 1, Direction.EAST);
        
        // make things for robot to pick up
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        
        // make robot stop when he reaches avenue 12
        while(karel.getAvenue() < 12)
        {
            // make robot pick up things until his backpack is full
            if(karel.canPickThing() && karel.countThingsInBackpack() < 7)
            {
                karel.pickThing();
                karel.move();
                
            // make robot move if he cannot pick up anything
            }else
            {
                karel.move();
            }
        } 
    }
}
