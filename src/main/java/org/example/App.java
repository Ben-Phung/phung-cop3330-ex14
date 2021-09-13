/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double WItax = .055;

        // Prompt input
        System.out.print("What is the order amount? ");
        String Order = scan.nextLine();

        System.out.print("What is the state? ");
        String State = scan.nextLine();

        double dOrder = Double.parseDouble(Order);
        double dTotal;

        // If statement for if string is WI and put return at end to stop program
        if (State.equals("WI"))
        {
            double Tax = (dOrder * WItax);
            dTotal = dOrder + Tax;
            System.out.println("The subtotal is $"+String.format("%.2f", dOrder)+".\n"+ "The tax is $"+String.format("%.2f", Tax) + ".\n"+ "The total is $"+String.format("%.2f", dTotal)+".");
            return;
        }

        // For if state != WI
        System.out.println("The total is $" +String.format("%.2f", dOrder) + ".");
    }
}
