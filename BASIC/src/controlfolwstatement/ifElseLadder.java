package controlfolwstatement;

public class ifElseLadder {
    public static void main(String[] args) {

        int a=10, b=20, c=30;
        if(a>b&&a>c){
            System.out.println("a is grater");
        }else if(b>c){
            System.out.println("b is grater");
        }else{
            System.out.println("c is grater");
        }
    }
}
