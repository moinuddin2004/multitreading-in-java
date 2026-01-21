public class Test extends Thread {
//    @Override
//    public void run() {
//        Thread.yield();
//
//        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getState());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("running");
//    }

    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());


//        Test test = new Test();
//        test.start();
//        Thread.yield();
//        System.out.println(Thread.currentThread().getState());
//
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Hello");
//        Thread.sleep(1000);
//        test.interrupt();
//
//        test.join();
//        System.out.println(test.getState());

//        World worldThread = new World();
//        worldThread.start();

//        World2 world2 = new World2();
//        Thread thread = new Thread(world2);
//        thread.start();
//        System.out.println("Bye");
    }
    // run , start . yeild, intrupt , set priority , sleep , isDeamon
}
