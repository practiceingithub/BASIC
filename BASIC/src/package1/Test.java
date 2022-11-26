package package1;

public class Test {
    int i= 10;

    public static void main(String[] args) {
         Test test= new Test();

         System.out.println(test.i);
    }
}
/**
Default -> The access level of a default modifier is only within the package.
public ->  The access level of a public modifier is everywhere.
protected -> through inheritance we can access protected variables
private ->  The access level of a private modifier is only within the class
**/
