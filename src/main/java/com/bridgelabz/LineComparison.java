package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        //Given input value
        int x1= input.nextInt();
        int x2= input.nextInt();
        int y1= input.nextInt();
        int y2= input.nextInt();

        int a1= input.nextInt();
        int a2= input.nextInt();
        int b1= input.nextInt();
        int b2= input.nextInt();

        //Length of line calculation
        double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lengthTwo = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }


    }
}
