package controlfolwstatement;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        FOR LOOP
        for(int i=0; i<=10; i++) {
            System.out.println(i);

        }
//        WHILE LOOP
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
            System.out.println(i);
            System.out.println(i);
            i=i+2;
            i--;
        }

//        DO WHILE LOOP- it executes atlest one time

        do {
            System.out.println(i);
            i++;

        }while(i<=10);


//        GAME THE GUSS NUMBER


        int num =(int) (Math.random()*100)+1;
        System.out.println(num);
        int guessNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the Number");
            guessNumber=scanner.nextInt();
            if(num>guessNumber){
                System.out.println("Number is Grater");
            }else if (num<guessNumber){
                System.out.println("Number is Smaller");
            }else{
                System.out.println("You Guess Correct");
            }
        }while(num!=guessNumber);



    }
}
