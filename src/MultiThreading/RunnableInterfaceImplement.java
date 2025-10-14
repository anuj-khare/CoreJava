package MultiThreading;

public class RunnableInterfaceImplement implements Runnable {
    public void run(){
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
    }
}
