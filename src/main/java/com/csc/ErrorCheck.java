package com.csc;
import java.util.Scanner;

// Your code goes here!
public class ErrorCheck
{
    public static int getValue (String welcPrompt, int lowBound, int upBound, String error, String exPrompt)
    {
        String userIn;
        System.out.println(welcPrompt);
        Scanner scanner = new Scanner(System.in);
        
        boolean invalidValue = true;
        int returnValue = -100;

        while (invalidValue){
            userIn = scanner.nextLine();
            if (userIn.trim().equals("Exit")){
                System.out.println("Exiting gracefully...");
                return returnValue;
            }
            returnValue = Integer.parseInt(userIn);
            if(returnValue < lowBound || returnValue > upBound) {
                System.out.println(error);
            } else {
                System.out.println(exPrompt);
                return returnValue;
            }
        }
        return returnValue;
    }

    public static void main (String[] args)
    {
        getValue("Welcome! Enter a number: ", -10, 10, "Your number is not within my chosen bounds. Enter again: ", "Goodbye!");

    }

}

