public class MyThread extends Thread {
    Counter counter;

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            this.counter.increment();
        }
    }

    MyThread(Counter counter) {
        this.counter = counter;
    }


}
