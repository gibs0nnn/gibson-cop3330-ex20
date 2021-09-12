package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("What is the order amount? ");
        double order = scanner.nextDouble();
        System.out.print("What state do you live in? ");
        String state = scanner.next();
        double tax = 0;

        //Sort based on state/county input
        if(state.contentEquals("Wisconsin")) {
            tax = order * 0.05;
            System.out.println("What county do you live in?");
            scanner.nextLine();
            String county = scanner.nextLine();
            if(county.contentEquals("Eau Claire")) {
                tax = tax + (order * 0.005);
            } else if(county.contentEquals("Dunn")) {
                tax = tax + (order * 0.004);
            }
        } else if(state.contentEquals("Illinois")) {
            tax = order * 0.08;
        }
        order += tax;

        //Output
        System.out.println("The tax is $" + Math.round(tax * 100.0) / 100.0);
        System.out.println("The total is $" + Math.round(order * 100.0) / 100.0);





        /*
        //User input for order amount and state residing
        double tax = 0;
        System.out.print("What is the order amount? ");
        double total = scanner.nextDouble();
        System.out.print("What state do you live in? ");
        String state = scanner.next();

        //Conditional for Wisconsin/Illinois and Calculations
        if(state.toLowerCase(Locale.ROOT).contentEquals("wisconsin")) {
            tax = total * 0.05;
            System.out.println("DEBUG tax in WI is " + tax);
            total += tax;
            System.out.println("total currently is: " + total);

            System.out.print("What county do you live in? ");
            String county = scanner.next();

            if(county.toLowerCase(Locale.ROOT).contentEquals("eau claire") ||
                    county.toLowerCase(Locale.ROOT).contentEquals("dunn")) {
                tax = tax + (total * 0.005);
                System.out.println("tax in county is " + tax);
                total += tax;

            }
        } else if(state.toLowerCase(Locale.ROOT).contentEquals("illinois")) {
            tax = total * 0.08;
            System.out.println("tax in illinois is " + tax);
            total += tax;
            System.out.println("total in illinois is " + total);

        }

        //Output
        System.out.println("The tax is $" + Math.round(tax * 100) / 100 +
                    "\nThe total is $" + Math.round(total * 100) / 100);
        */
    }
}
