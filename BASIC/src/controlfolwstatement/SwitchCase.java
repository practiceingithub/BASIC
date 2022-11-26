
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter Date");
//        int day= scanner.nextInt();
//
//        switch (day){
//            case 1,8,15,22,29:
//                System.out.println("sunday");
//            case 2:
//                System.out.println("monday");
//            case 3:
//                System.out.println("tuesday");
//            case 4:
//                System.out.println("wednesday");
//            case 5:
//                System.out.println("thursday");
//            case 6:
//                System.out.println("friday");
//            case 7:
//                System.out.println("saturday");
//            default:
//                System.out.println("wrong choice");


package controlflowstatement;

import java.time.LocalDate;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        int day = scanner.nextInt();
        String nextNumber;

        switch (day){
            case 1,8,15,22,29:
                System.out.println("Sunday");

                System.out.println("Enter another String");

                nextNumber = scanner.next();
                switch (nextNumber){
                    case "One":
                        System.out.println("1");
                        break;
                    case "Two":
                        System.out.println("2");
                }
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}