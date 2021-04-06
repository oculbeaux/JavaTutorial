package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 10;
        int b = 18;
        int c;

        c = Main.suma(a, b);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c = " + c);
    }
        private static int suma(int n1, int n2) {
            return(n1+ n2);

        }

    }
