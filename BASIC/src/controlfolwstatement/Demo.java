package controlfolwstatement;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    int num , sum=0;
    char choice;
    Scanner scanner = new Scanner(System.in);
    do{
        System.out.println("Enter the number");
        num = scanner.nextInt();
        sum = sum + num;

        System.out.println("Do U Want to continue");
        choice = scanner.next().charAt(0);
    }while( choice=='Y' || choice=='y');
    System.out.println(sum);
    }
}
