package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 4;
        int b = 7;
        int c = 10;

        if (a > b) {
            if (a > c) {
                System.out.println("katta son a = " + a);
            } else {
                System.out.println("katta son c = " + c);
            }
        } else {
            if (b > c) { 
                System.out.println("katta son b = " + b);
            } else {
                System.out.println("katta son c = " + c);
            }
        }
    }
}
