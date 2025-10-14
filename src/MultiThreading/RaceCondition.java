package MultiThreading;

class Counter{
    private int count = 0;
    public void increment(){
        count++;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(()-> {
          for(int i=0;i<1000;i++){
              c.increment();
          }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.getCount());//Often less than 2000,because threads are not in sync with each other and
        //count varibale updated by one thread might not be visible to second thread.
    }
}
