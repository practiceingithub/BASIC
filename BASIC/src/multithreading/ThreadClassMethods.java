package multithreading;

public class ThreadClassMethods {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in run");
            }
        });
        t1.setName("test");
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());

    }
}

//t1.join - to join th thread
//t1.setPriority - to give the priority to thread bt it is not useful
//t1.start - to start thread
//t1.getName - to give name to the thread