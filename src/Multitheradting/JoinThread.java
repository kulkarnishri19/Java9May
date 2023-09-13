package Multitheradting;

import javax.sound.midi.Soundbank;

public class JoinThread extends Thread {
    @Override
    public void run() {
        for (int i =0 ; i<5; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
    }
    }
}
class  JoinThreadImpl
{
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
        System.out.println("Before join "+Thread.currentThread().getName());
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After join "+Thread.currentThread().getName());
    }
}
