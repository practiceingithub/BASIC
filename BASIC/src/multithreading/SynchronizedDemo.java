package multithreading;

public class SynchronizedDemo {
    int i;

    private synchronized void increase(){
        synchronized (this) {
            i++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj= new SynchronizedDemo();

        Thread  t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000;i++){
                    obj.increase();
                }
            }
        });

        Thread  t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000;i++){
                    obj.increase();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();



    }
}
