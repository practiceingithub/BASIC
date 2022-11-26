package staticdemo;

public class StaticKeyword {
    int id;
    String  name;
    String companyName;

    public StaticKeyword(int id, String name, String companyName) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword(1,"pallavi","XYZ");
        StaticKeyword obj2 = new StaticKeyword(2,"snehal","XYZ");

        StaticKeyword obj3 = new StaticKeyword(3,"shweta","XYZ");


System.out.println(obj1.id +" "+obj1.name+" "+obj1.companyName);
        System.out.println(obj2.id +" "+obj2.name+" "+obj2.companyName);

        System.out.println(obj3.id +" "+obj3.name+" "+obj3.companyName);


    }
}
