package controlfolwstatement;

public class ladder2 {
    public static void main(String[] args) {
        int a=90, b=90, c=90;
        if(a+b+c==180){
            System.out.println("It is Triangle");
            if(a==90 || b==90 || c==90){
                System.out.println("It is Right angle Trianlge");
            }else{
                System.out.println("Not a Right Angle Triangle");
            }
        }else{
            System.out.println("It is Not Triangle");
        }

    }
}
