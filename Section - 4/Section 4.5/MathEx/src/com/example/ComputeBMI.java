/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class ComputeBMI {
    public static void main(String[] args)
	{
         //Exercise 2
         double result;
         result = Math.abs(-1.23);
         System.out.println(result);   // tanda absolut
         
         result = Math.pow(3,2);
         System.out.println(result); //tanda pangkat
         
         result = (Math.sqrt(121.0)) - (Math.sqrt(256.0)); //tanda akar kuadrat
         System.out.println(result);
         
         result = Math.abs (Math.min(-3, -5));
         System.out.println(result);
         
         //Exercise 3
         String age = JOptionPane.showInputDialog(null,"your age(min)");
         int ageConvert = Integer.parseInt(age);
         result = Math.max(ageConvert,0);
         System.out.println(result);
         
         age = JOptionPane.showInputDialog(null,"your age(max)");
         result = Math.min(ageConvert,0);
         System.out.println(result);
         
         //Exercise 4
         String weight = JOptionPane.showInputDialog(null,"Your weight");
         double weightConvert = Double.parseDouble(weight);
         
         String height = JOptionPane.showInputDialog(null,"Your height");
         double heightConvert = Double.parseDouble(height);
         
         double BMI = (weightConvert / (Math.pow(heightConvert,2)))*703;
         System.out.println(BMI);
         
         
         
         
         
         
         
         
         
        
         
         
            
        
        }
}
