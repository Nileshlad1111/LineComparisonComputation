package com.bridgelabz;

public class LineLength {
    //Given variable
    int x1 , x2 , y1 , y2 ;
    int a1 , a2 , b1 , b2 ;

    //Length of line calculation one
    public int calculationOne(int x1 , int x2 , int y1 , int y2){
    int lengthOne = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    int claculationLengthOne = lengthOne;
    return claculationLengthOne;
    }
    //Length of line calculation
    public int calculationTwo(int a1 , int a2 , int b1 , int b2){
    int lengthTwo = (int) Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
    int claculationLengthTwo = lengthTwo;
    return claculationLengthTwo;
    }

}
