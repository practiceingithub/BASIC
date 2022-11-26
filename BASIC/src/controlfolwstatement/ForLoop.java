package controlfolwstatement;

//import java.net.SocketOption;

//IMPORTANT
public class ForLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];//how to declare array
        arr[0] = 10;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 32;

        System.out.println(arr[2]);

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//
//        HOW TO PRINT ARRAY
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);

//        HOW TO PRINT ARRAY REVERSE
//            for( int i =arr.length-1; i>=0; i--) {
//                System.out.println(arr[i]);
//            }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]+" "+"even");
            }
            else{
                System.out.println(arr[i]+" "+"odd");
            }
            }


    }
}