package controlfolwstatement;

import java.util.Scanner;

public class convertIfelseToTernary {
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


         String str = i>0?"number is positive":"Number is negative";
         System.out.println(str);
    }
}
