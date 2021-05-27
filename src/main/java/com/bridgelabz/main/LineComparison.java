package com.bridgelabz.main;

import com.bridgelabz.user.LineLength;

public class LineComparison extends LineLength {

    public static void main(String[] args){
    //object
    LineLength lineLength = new LineComparison();

    //object passing value using wrapper data type
    Integer LengthCalculationOne = lineLength.calculationOne(1, 8, 5, 4);
    Integer LengthCalculationTwo = lineLength.calculationTwo(1, 8, 5, 4);

    //calling
    System.out.println("To calculation of line length one = " + LengthCalculationOne);
    System.out.println("To calculation of line length two = " + LengthCalculationTwo);

    //Given equal operator
    if (LengthCalculationOne == LengthCalculationTwo) {
        System.out.println("Equal ");
    } else {
        System.out.println("Not Equal ");
    }

    //equal method
    if(LengthCalculationOne.equals(LengthCalculationTwo)){
        System.out.println("Equal ");
    } else {
        System.out.println("Not Equal ");
    }

    //Given compare two value and use compareTo method
    int diffInLength = LengthCalculationOne.compareTo(lineLength.calculationTwo(1,12,6,4));
    if (diffInLength == 0) {
        System.out.println("Equal of line length");
    } else if (diffInLength > 0) {
        System.out.println("Line1 is greater in length than lengthOne ");
    } else {
        System.out.println("Line1 is smaller in length than lengthTwo ");
    }

    //Given compare two value and use compareTo method
    int diffInLength1 = LengthCalculationTwo.compareTo(lineLength.calculationOne(1,8,4,5));
    if (diffInLength1 == 0) {
        System.out.println("Equal of line length");
    } else if (diffInLength > 0) {
        System.out.println("Line1 is greater in length than lengthOne ");
    } else {
        System.out.println("Line1 is smaller in length than lengthTwo ");
    }
    }
}