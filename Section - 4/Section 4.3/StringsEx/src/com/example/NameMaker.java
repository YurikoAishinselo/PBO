/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class NameMaker {
    
    public static void main(String args[])
    {
        String custName = "Steve Smith";
        
        int spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space character is " +spaceIdx);
        // Get the index of the space character (" ") in custName. 

        String firstName = custName.substring(0,5);
        System.out.println("My first name is "+ firstName);
        // Use the substring method parse out the first name and print it.
    }
    
}
