package controlfolwstatement;

import java.util.Arrays;
import java.util.List;

public class ForLoop1 {
    public static void main(String[] args) {
        int[] arr = new int[4];//how to declare array
        arr[0] = 10;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 32;

//        Tranditional for loop
//        for( int i =arr.length-1; i>=0; i--) {
////                System.out.println(arr[i]);
////            }

//        enhance for loop
        for(int i: arr){
            System.out.println(i);
        }


        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(s->{
            System.out.println(s);
        });
//        or
//        methode References
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.forEach(System.out::println);

//        or
//        Arrays.asList(1,2,3,4,5).forEach(System.out::println);


    }
}
