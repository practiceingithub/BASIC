package thisdemo;

/**
 * this keyword:
 *      1. it is used to refer current class instance variable
 *      2. it is used to invoke current class methods
 *      3. it is used to invoke current class constructor
 */
public class ThisKeyword {
//    global variable / instance variable
    int id;
    String name;
    String address;


    public void show(){
        System.out.println("in show");
    }
    public void display(){
        this.show();
    }
    public ThisKeyword(int id ,String name, String address){
      this.id= id;
      this.name = name;
      this.address= address;
      this.show();
    }

//    we can  use also  like this
//    public ThisKeyword(){
//        this(2,"pallavi","pune");
//    }
    public static void main(String[] args) {
        ThisKeyword obj= new ThisKeyword(1,"pallavi","pune");//local variable

        System.out.println(obj.id+" "+obj.name+" "+obj.address);
//        ThisKeyword obj=new ThisKeyword();
    }
}
