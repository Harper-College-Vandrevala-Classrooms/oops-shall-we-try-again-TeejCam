package com.csc;
import java.util.Scanner;

// Your code goes here!
public class ErrorCheck
{
    public static int getValue (String welcPrompt, int lowBound, int upBound, String error, String exPrompt)
    {
        int userInt;
        System.out.println(welcPrompt);
        Scanner scanner = new Scanner(System.in);
        userInt = scanner.nextInt();

        while (userInt < lowBound || userInt > upBound) {
            System.out.println(error);
            userInt = scanner.nextInt();
       }
        System.out.println(exPrompt);
        return userInt;
    }
    public static void main (String[] args)
    {
        getValue("Welcome! Enter a number: ", -10, 10, "Your number is not within my chosen bounds. Enter again: ", "Goodbye!");
    }
}

