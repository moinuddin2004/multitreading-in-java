//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//
//public class Lock2 {
//
//    private final Lock lock = new ReentrantLock(true);
//
//    public void accessResource() throws InterruptedException {
//        lock.lock();
//        try {
//            System.out.println(Thread.currentThread().getName());
//            Thread.sleep(2000);
//
//        } catch (InterruptedException e) {
//          Thread.interrupted();
//        }finally {
//            System.out.println("thread" + Thread.currentThread().getName() +" is release");
//
//            lock.unlock();
//
//        }
////        Thread.sleep(2000);
//
//
//    }
//
//    static void main() {
//        Lock2 lock2 = new Lock2();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    lock2.accessResource();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        Thread t3 = new Thread(runnable);
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//
//}
