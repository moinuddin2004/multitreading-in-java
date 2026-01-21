public class World2 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("worldThread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("world");
    }
}
