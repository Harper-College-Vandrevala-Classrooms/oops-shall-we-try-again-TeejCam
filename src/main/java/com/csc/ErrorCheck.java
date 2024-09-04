package com.csc;
import java.util.Scanner;

// Your code goes here!
public class ErrorCheck
{
    public static int getValue (String welcPrompt)
    {
        int userInt;
        System.out.println(welcPrompt);
        Scanner scanner = new Scanner(System.in);
        userInt = scanner.nextInt();

        while (userInt < -10 || userInt > 10) {
        System.out.println("Your number is not within my chosen bounds. Enter again: ");
        userInt = scanner.nextInt();
       }
        System.out.println("Goodbye!");
       return userInt;
    }
    public static void main (String[] args)
    {
        getValue("Welcome! Enter a number: ");
    }
}