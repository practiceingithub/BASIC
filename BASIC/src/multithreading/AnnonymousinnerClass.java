package multithreading;

public class AnnonymousinnerClass {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
//        MyInterface.show();
    }

    interface MyInterface {
        void show();

    }
}
