package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {
        MyInterface m = ()->{
            System.out.println("In Lambada");//without parameter
        };
        m.show();

        MyInterface1 m1 = (i,j) ->{//with parameter
            System.out.println(i*j);
        };
        m1.multi(4,4);
    }


//    List<Integer> list = Arrays.asList(1,2,3,4,5);
//    list.forEach(new Consumer<Integer>(){
//        public void accept(Integer , integer;
//        integer){
//            System.out.println(integer);
//        }
//    });
}


@FunctionalInterface
interface MyInterface{
    void show();
}
interface  MyInterface1{
    void multi(int i, int j);
}