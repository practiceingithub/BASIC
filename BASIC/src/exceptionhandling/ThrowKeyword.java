package exceptionhandling;

public class ThrowKeyword {
    public static void main(String[] args) throws Exception{
        int age =16;
        if(age>18){
            System.out.println("You Can Vote");
        }else{
//            System.out.println("SORRY!!!! You Can't Vote");

            throw  new Exception("SORRY!!!! You Can't Vote");
        }
    }
}
/**
 *        throw---------------------------------------------------throws
 * 1. to throw the exception explicit                         1. to declare exception
 * 2. throw is used in method                                 2. throws is used with method signature
 * 3. throw is followed by instance                           3. throws followed by classes
 * 4. you can throw only single exception                     4. you can declare multiple exception
 *
 */
