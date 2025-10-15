package MultiThreading;

class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }
    public synchronized void setCount(int count){
        this.count = count;
    }
}
