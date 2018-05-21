package com.company;

import java.util.Scanner;

public class edu {
    public static void main(String[] args) {
        //int result = daysInMonth(2);
        //System.out.println(result);
        // System.out.println(x);
        //System.out.println(fibonacci(4));
         //myWriteNums(5);
        //System.out.println(fact(5));
        System.out.print(starString2(3));
        System.out.print(starString(3));


    }

    public static int daysInMonth(int month) {
        if (month == 2) {
            return 28;
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        } else if ((month == 8) || (month == 10) || (month == 12)) {
            return 31;
        } else {
            return 31;
        }
    }

    static double x = (int) Math.floor(2.22); //force int, need to google it
    // to understand it theoretically

    static double y = 100 + Math.log10(100);
    static double z = 13 + Math.abs(-7) - Math.pow(2, 3) + 5;


    static int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;

        return result;

    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int myWriteNums(int num) {
        if (num == 1) {System.out.print(num);}
        int result = myWriteNums(num-1);
        System.out.print(result + ", ");
        return result;
    }

    public static void writeNums(int n) {

        if (n == 1) {
            System.out.print("1");
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }

   /* public static String starString(int power) {
        int n = 2;
        String resultString;
        if (power == 0) {
            return "*";
        }
        resultString = starString(power - 1) * n;
        return resultString;

    }*/

    public static int starString2(int power) {

        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return 2;
        }
        return 2 * starString2(power - 1);
    }

    public static int starString3(int power) {

        if (power == 0) {
            return 1;
        } else {
            return starString3(power - 1) + starString3(power - 1);
        }
    }


    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }
}















