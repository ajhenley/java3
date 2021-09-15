package com.byaj;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // asks for your age
        Scanner kb = new Scanner(System.in);
        int pin;
        pin = kb.nextInt();
        int pins[]= new int[pin];
        for(int i = 0; i < pins.length; i++){

            for(int j = 0; j < pins.length - i; j++)
            {
                System.out.print("j");
            }
            System.out.println();

        }

    }
}

