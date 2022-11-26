package finaldemo;
//Variable: to store data in container
/*
Final Keyword:
               1. To declare constant
               or if u declare final variable you can not change value
               2. you can declare methode class and variable as a final
               3. if you declare final method then you can not override the method
               4. if you declare final class you can not inherit the class
 */
public class FinalDemo {
    final int i =10;
    public void show(){
//        i=20;
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println(obj.i);
    }

}
class Sample2 extends FinalDemo{
}