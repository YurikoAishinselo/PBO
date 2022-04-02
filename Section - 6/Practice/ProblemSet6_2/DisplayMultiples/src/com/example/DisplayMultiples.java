/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DisplayMultiples {

    public static void main(String args[]) {
       String number = JOptionPane.showInputDialog("Input a random number");
       int numConvert = Integer.parseInt(number);
       for (int a=1; a<13;a++){
           int Value = numConvert * a;
           System.out.println(Value);
       }
       
    }

}
