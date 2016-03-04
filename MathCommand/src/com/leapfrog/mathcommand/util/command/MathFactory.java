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
public class MathFactory {
    
    public static MathCommand get(String key){
        
        if(key.equals("1")){
            return new AddCommand();
        }
        
        else if(key.equals("2")){
            return new SubtractCommand();  
        }
        
        else if(key.equals("3")){
            return new MultiplyCommand();
        }
        
        else if(key.equals("4")){
            return new DivideCommand();
        }

        
        
        return null;
    }


    
}
