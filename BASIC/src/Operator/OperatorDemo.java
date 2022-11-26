package Operator;


/**
 * unary operator           a++,++a,a--,--a
 * assignment operator      = , ==
 * relational operator      < , >, <= ,>= ,
 * shift operator           left shift, right shift
 * arithmetic operator      +,=,*,/,%
 * logical  operator         && ,|| ,NOT
 * bitwise operator          & ,|
 * ternary  operator         ? , :
 *
 */
public class OperatorDemo {
    public static void main(String[] args) {

//        UNARY OPERATOR
        int i=10;
        System.out.println(i++); //i=i+1     (10)
        System.out.println(i);
        System.out.println(++i);//i+1=i      (12)


        int p=50;
        System.out.println(p--);//p=p-1      (12)
        System.out.println(--p);//p-1 = p   (10)



//        SHIFT OPERATOR
        int r=30;
        System.out.println(r<<3);//30*2^3
        System.out.println(r>>3);//30/2^2

//        ARITHIMATIC OPERATOR
        int L=30;
        int M=30;
        System.out.println(L+M);
        System.out.println(L-M);
        System.out.println(L*M);
        System.out.println(L/M);
        System.out.println(L%M);

        String k="pallavi";
                String d="Dalavi";
                System.out.println(k+d);


//                BITWISE OPERATOR
        int A=8;
        int B=7;
        System.out.println(A&B);
        System.out.println(A|B);
        System.out.println(A>B && B<A);
        int C=8;
        int D=9;
        System.out.println(C<D || C>D);



    }
}
