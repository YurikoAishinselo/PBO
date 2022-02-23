package com.example;

import javax.swing.JOptionPane;

/**
 *
 * @author Yuriko
 */
public class TestClass {

    public static void main(String args[]) {
        ComputeMethods calc = new ComputeMethods();
        
        //Convert fahrenheit to celcius
        String f;
        double c;
        f = JOptionPane.showInputDialog(null,"Fahrenheit");
        Double fConvert = Double.parseDouble(f);
        fConvert = fConvert * 1.0;
        c = calc.fToC(fConvert);
        
        JOptionPane.showMessageDialog(null, "Celcius : " + c);



        //Calculate the hyphotenuse of triangle
        String a,b;
        double result;
        a = JOptionPane.showInputDialog(null,"Panjang a");
        b = JOptionPane.showInputDialog(null,"Panjang b");
        
        Double aConvert = Double.parseDouble(a);
        Double bConvert = Double.parseDouble(b);
        aConvert = aConvert * 1.0;
        bConvert = bConvert * 1.0;
      
        result = calc.hypotenuse(aConvert,bConvert);
        
        JOptionPane.showMessageDialog(null, "Panjang Hipotenusa : " + result);


        
        //Sum of dice Value                               
        int diceValue = calc.roll();
        JOptionPane.showMessageDialog(null, "Jumlah nilai dadu : " + diceValue);
        
                
        
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
    }
}
