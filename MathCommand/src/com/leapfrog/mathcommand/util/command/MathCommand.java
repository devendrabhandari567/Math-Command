/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mathcommand.util.command;

/**
 *
 * @author Beats
 */
public abstract class MathCommand {
    
    public MathCommand(){
        System.out.println("Math Command Initialized.");
    }
    
    public abstract int calculate(int x,int y);
    
}
