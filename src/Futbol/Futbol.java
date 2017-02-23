/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class Futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    
    public Futbol(){
        this.unal = new City(10,10);
        this.balon = new Thing(this.unal, 9, 9);
        this.joe = new Robot(unal, 9, 9, Direction.WEST);
    }
    
    public void advance(){
        for (int i = 0; i < 2; i++) {
            this.joe.move();
        }
    }
    
    public void advanceRight(){
        if(this.joe.canPickThing()==true){
            this.joe.pickThing();
        }
        for (int i = 0; i < 2; i++) {
            this.joe.move();
        }
        for (int i = 0; i < 3; i++) {
            this.joe.turnLeft();
        }
        this.joe.move();
        this.joe.turnLeft();
    }
    
    public void advanceLeft(){
        this.joe.turnLeft();
        this.joe.move();
        for (int i = 0; i < 3; i++) {
            this.joe.turnLeft();
        }
        for (int i = 0; i < 2; i++) {
            this.joe.move();
        }
        this.joe.putThing();
    }
}

