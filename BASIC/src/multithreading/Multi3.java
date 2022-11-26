package multithreading;

public class Multi3 {
    public static void main(String[] args) {
        Thread t1= new Thread(()->{
            for(int i=1; i <=5; i++){
                System.out.println("Hii");

               try {
                   Thread.sleep(500);
               }catch(InterruptedException e){
                   throw new RuntimeException(e);
                }
            }
        });
            t1.start();
    }
}
