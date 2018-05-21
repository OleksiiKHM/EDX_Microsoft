
package com.company;
import java.util.Scanner;

public class VacationPlanner {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //greeting();
        //budget();
        //timeDifference();
        //squareArea();
        System.out.println("10 plus 20 is " + (10 + 20));
    }

    public static void greeting() {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name, traveller?");
        String username = input.nextLine();
        System.out.print("Nice to meet you " + username + ", where are you travelling to?");
        String destination = input.nextLine();
        System.out.println("Nice choice! " + destination + " sounds like a great trip.");
        System.out.println("********************");
        System.out.println("");
    }

    public static void budget() {
        System.out.print("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.print("Enter your budget in USD");
        int budgetUSD = input.nextInt();
        System.out.print("Specify three letter currency symbol for your travel destination");
        String currencySymbol = input.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD ?");
        double localCurrencyToUSD = input.nextDouble();

        int travelTimeInHours = days*24;
        int travelTimeInminutes = days*1440;
        double budgetPerDayUSD = budgetUSD / days;
        double budgetInLocalCurrency = budgetUSD * localCurrencyToUSD;
        double budgetPerDayLocal = budgetInLocalCurrency / days;

        System.out.println("");
        System.out.println("If you are travelling for " + days + " days that is the same as " + travelTimeInHours + " hours or " + travelTimeInminutes + " minutes");
        System.out.println("If you are going to spend $" + budgetUSD + " USD that means per day you can spend up to $" + budgetPerDayUSD + " USD");
        System.out.println("Your total budget in " + currencySymbol + " is " + budgetInLocalCurrency + " " + currencySymbol + ", which per day is " + budgetPerDayLocal + " " + currencySymbol);
        System.out.println("********************");
        System.out.println("");
    }

    public static void timeDifference() {
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int timeDifference = input.nextInt();
        int localTimeMidnight = 24 + timeDifference;
        int localTimeNoon = 12 + timeDifference;
        System.out.println("That means when it is midnight at home it will be " + localTimeMidnight + " in your travel destination");
        System.out.println("and when it is noon at home it will be " + localTimeNoon);
        System.out.println("********************");
        System.out.println("");
    }

    public static void squareArea() {
        System.out.print("What is the square area of your destination country in km2 ?");
        int squareAreaKm = input.nextInt();
        double squareAreaMiles = squareAreaKm*0.386102;
        System.out.print("In miles2 that is " + squareAreaMiles);
    }
}
