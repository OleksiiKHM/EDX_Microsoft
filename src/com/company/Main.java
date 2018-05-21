package com.company;

public class Main {

    public static void main(String[] args) {
        go1();
        go2();
        shit();
        oops2();
    }

    public static void go1 () {
        System.out.println("Go, team, go!\n"+
                "You can do it.\n"+
                "\n"+
                "Go, team, go!\n"+
                "You can do it.\n"+
                "You're the best,\n"+
                "In the West.\n"+
                "Go, team, go!\n"+
                "You can do it.\n"+
                "");
    }
    public static void go2 () {
        System.out.println("Go, team, go!\n"+
                "You can do it.\n"+
                "You're the best,\n"+
                "In the West.\n"+
                "Go, team, go!\n"+
                "You can do it.\n"+
                "\n"+
                "Go, team, go!\n"+
                "You can do it.");
    }
    public static void shit (){System.out.println("method not called");
    }
    public static void oops2 () {
       int a = 5;
       int b = 10;
       int c = b;
       a = a + 1;
       b = b - 1;
       c = c + a;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
    }
    }

