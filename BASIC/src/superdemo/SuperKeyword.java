package superdemo;



/**
 *  su[er :
 *  it refers the immediate parent class variable
 *  it refers the immediate parent class methode
 *  it refers the immediate parent class constructor
 */
public class SuperKeyword {
    int i = 10;
    public void  show(){
        System.out.println("in super");
    }
    public SuperKeyword(){
        System.out.println("in super Constructor");
    }
    public  SuperKeyword(int i){
        System.out.println("in super const parameter");
    }
}
class Sample extends SuperKeyword{
    int i = 20;
    public Sample(){
//        super(6);
        System.out.println("Simple const");
    }
    public Sample(int i){
        System.out.println("in sample parameter");
    }

    public void display(){
        super.show();
        System.out.println(super.i);
    }
    public static  void  main(String[] args){
        Sample obj = new Sample();
  obj.display();
    }
}
