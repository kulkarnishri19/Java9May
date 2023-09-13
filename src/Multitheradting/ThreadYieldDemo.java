package Multitheradting;

public class ThreadYieldDemo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
    }
}

class  ThreadYeildImpl{
    public static void main(String[] args) {
        ThreadYieldDemo t1 = new ThreadYieldDemo();
        ThreadYieldDemo t2 = new ThreadYieldDemo();
        t1.setName("T1");
        t1.setName("T2");
        t1.start();
        t2.start();
        for (int i=1;i<4;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}