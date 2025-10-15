package MultiThreading;

public class TestBedMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter sc = new SynchronizedCounter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<2000;i++){
                sc.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<2000;i++){
                sc.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread Count : "+ sc.getCount());
    }
    //Note : You dont call run method rather,you call start method which internally invokes run method
}
