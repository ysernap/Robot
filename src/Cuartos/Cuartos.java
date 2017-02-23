/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuartos;

import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Cuartos {
    private Robot yisus;
    private City cuarto;
    private Thing pepa;
    private Wall pared;
    
    public Cuartos(){
        this.cuarto = new City(11,11);
        this.yisus = new Robot(cuarto, 6, 2, Direction.NORTH);
        this.pepa = new Thing(this.cuarto, 5, 2);
        for (int i = 1; i < 10; i++) {
        this.pared = new Wall(this.cuarto, 1, i, Direction.NORTH);
    }
    }
    
    
}
