package multithreading;

public class MultithreadingDemo {
    int i=10;
    public static void main(String[] args) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
        System.out.println(obj.getName());
    }

    private int getName() {
        return 0;
    }

    private void start() {
    }


}
