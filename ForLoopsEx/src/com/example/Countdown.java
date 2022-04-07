
package com.example;

public class Countdown {

    public static void main(String[] args) {
        int c = 0;
        System.out.println("Count up form 0 to 5: ");

        for(int i = 5; i >= 0; i--) {
            System.out.print(i +" "); 
            c = c + i;
        }
        System.out.println("");
        System.out.println("Result :"+ c);
        c = 0;
        System.out.println("Count all even number from 0 to 20 : ");
        for(int a = 0; a<=20; a=a+2){
            c = c + a;
        }
        System.out.println("Result " + c);
        
    }
}
