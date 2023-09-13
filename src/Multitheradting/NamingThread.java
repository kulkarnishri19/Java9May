package Multitheradting;

public class NamingThread extends Thread{
    @Override
    public void run() {
        System.out.println("Name"+Thread.currentThread().getName());
        System.out.println("in run method");
    }
}
class NamingThreadimpl{
    public static void main(String[] args) {
        NamingThread t1 = new NamingThread();
        t1.setName("T1");
        t1.start();
        NamingThread t2 =new NamingThread();
        t2.setName("T2");
        t2.start();
    }
}