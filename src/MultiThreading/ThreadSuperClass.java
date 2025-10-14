package MultiThreading;

public class ThreadSuperClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
    }
}
