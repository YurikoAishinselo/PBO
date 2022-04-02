/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ValidatePin {

    public static void main(String[] args) {
        String PIN = JOptionPane.showInputDialog("Your PIN");
        int PINConvert = Integer.parseInt(PIN);
        
        while (PINConvert != 233456){
               PIN = JOptionPane.showInputDialog("Your PIN is Incorrect");
               PINConvert = Integer.parseInt(PIN);
            }
        System.out.println("Your PIN is Correct");
    }
}
