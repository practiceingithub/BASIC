package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int k = 0;
        int b = 10;
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            k = i / j;

            try {
                String str = null;
                System.out.println(str.toUpperCase());
                System.out.println("in nested");
            } catch (NullPointerException e) {
                System.out.println("Null pointer ==>" + e);
            }

            System.out.println("In try block");
        } catch (Exception e) {
            System.out.println("Runtime==>" + e);
        }
        System.out.println(k);
        System.out.println("Hii");
    }
}

