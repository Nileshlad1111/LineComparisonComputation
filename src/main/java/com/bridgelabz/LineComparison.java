package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    // Creates an object of Scanner
    Scanner input = new Scanner(System.in);

    //Given input value
    Integer x1= input.nextInt();
    Integer x2= input.nextInt();
    Integer y1= input.nextInt();
    Integer y2= input.nextInt();

    Integer a1= input.nextInt();
    Integer a2= input.nextInt();
    Integer b1= input.nextInt();
    Integer b2= input.nextInt();

    //Length of line calculation
    Double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    Double lengthTwo = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

    //create compareTo method
    public int compareTo(LineComparison lengthTwo  ) {
        return 0;
    }

    public static void main(String[] args) {

        LineComparison lengthOne = new LineComparison();
        LineComparison lengthTwo = new LineComparison();

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        //Given equal method
        if(lengthOne.equals(lengthTwo)){
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        //Given compare two value and use compareTo method
        int diffInLength = lengthOne.compareTo(lengthTwo);
        if (diffInLength == 0) {
            System.out.println("Equal of line length");
        } else if (diffInLength > 0) {
            System.out.println("Line1 is greater in length than lengthOne ");
        } else {
            System.out.println("Line1 is smaller in length than lengthTwo ");

        }
    }
}