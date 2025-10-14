package MultiThreading;

public class TestBedMultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableInterfaceImplement());
        Thread t2 = new ThreadSuperClass();
        t1.start();
        t2.start();
    }
    //Note : You dont call run method rather,you call start method which internally invokes run method
}
