package controlfolwstatement;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int i = scanner.nextInt();
//        if (i>0){
//            System.out.println("Number is positive");
//        }
//        else{
//            System.out.println("Number is Negative");
//        }


        if (i>18){
            System.out.println("You Can Drive");
        }
        else{
            System.out.println("You Can't Drive");
        }

    }
}
