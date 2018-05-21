package com.company;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        scantest();
        /* System.out.println("Hello World");
        System.out.println("Hello \n World");
        System.out.println("Hello \\\"brave new\\\" World");
        System.out.println("Hello 'brave' new/ World");
        System.out.println("How '\"confounding' \"\\\" it is!");
        methodOutsideofMain();
        practiceIt210();
        System.out.println();
        System.out.println();
        System.out.println("hi\thello\tgoodbye\tbeautiful\thi");
        System.out.println("in 'string literals.'");
        System.out.println("''quotes.''"); */
    }

    /*public static void methodOutsideofMain() {
        System.out.println("This is a method outside of main method");
    }

    public static void practiceIt210() {
        int x = 0;
        System.out.println("x is now " + x);

        int z = 15;
        System.out.println("x is now " + z);

        int y;   // set y to 1 more than x
        y = z + 1;
        System.out.println("x and y are " + z + " and " + y);
    } */

    public static void scantest () {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome!");
            System.out.print("What is your name?");
            String name1 = input.next();
            String name2 = input.next();
            String name3 = input.next();
            String name4 = input.next();
            System.out.println(name1 + name2 + " " + name3 + " " + name4);

    }

}






