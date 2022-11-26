package constructor;

/**
 * Constructor :  It is a special type of function which invokes/call automatically  when we create object of class
 *
 * Rules:
 *     1. class name and function name should be same
 *     2.there is no return type(explicit)
 *     3. we can not declare constructor as abstract , final, static, synchronized
 *
 * Types:
 *    1.Default constructor
 *    2.Parameter constructor
 *
 * Uses:
 *    1.it initialises  variable to their default values
 *
 *
 *
 */
//(------------DEFAULT CONSTRUCTOR------------)
public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("In Constructor");
    }
    //(------------PARAMETER CONSTRUCTOR------------)
public ConstructorDemo(int i){
        System.out.println("in parameter const"+i);
}
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(2);


    }
}
