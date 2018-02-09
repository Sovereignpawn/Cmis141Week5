/* File:      Week5Array.java
 * Author:    Matthew Dwyer
 * Date:      7 Feb 2018
 * Purpose:   Demonstrate understanding of Arrays
 */

/**
 * This class will mimic 10 rolls of a 6 sided die. The value of each roll will be stored in an
 * arrary. Then the it will print out the nuber of each roll with its value.
 */
import java.util.Random;//import the random utility

public class Week5Array{
  public static void main (String[] args){

    int rollArray[]= new int[10];// initialize the "rollArray" array and limit it to 10 values
    Random dice = new Random();// initialize a random object called "dice"
/*
 * The following for loop will make a variable "i" and set it to zero. Then while "i" is less
 * than the rollArray length (ten) store an instance of the random object "dice" in the array
 * then add one to i and continue
 */
   for (int i=0; i<rollArray.length; i++){
     rollArray[i] = 1+dice.nextInt(6);
    }//end for loop

    System.out.println("Roll\tValue");//print the header for the output
/*
 * The following for loop will make a vairable "j" and set it to zero. Then while "j" is less
 * than the rollArray length (ten) print out the value of "j" plus one and the value stored
 * in the index equil to j. Then add one to "j" and continue.
 */
    for (int j=0; j<rollArray.length; j++){
      System.out.println((j+1) + "\t" + rollArray[j]);
    }//end for loop
  }//end main method
}//end class
