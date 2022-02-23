/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Random;
import javax.swing.JOptionPane;


public class ComputeMethods {
    public double fToC(double degreeF){
        double temperature = (5.0/9.0) * (degreeF - 32.0);
        return temperature;
    }
public double hypotenuse (double a,double b){
        double c = (Math.sqrt(Math.pow(a, 2)+ (Math.pow(b,2))));
        return c;
}
public int roll(){
    Random rand = new Random();
    int randNum_1 = rand.nextInt(6)+1;
    int randNum_2 = rand.nextInt(6)+1;
    int randNum = randNum_1 + randNum_2;
    return randNum;
        
}

}

