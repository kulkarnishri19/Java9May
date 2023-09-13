package Multitheradting;

public class DemonThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isDaemon());

    }
}
class DemonThreadDemoImpl{
    public static void main(String[] args) {
        DemonThreadDemo t1 = new DemonThreadDemo();
        DemonThreadDemo t2 = new DemonThreadDemo();
        t1.setDaemon(true);
        t1.start();

        t2.start();
    }

}