package Multitheradting;

public class Sleep extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class SleepImpl{
    public static void main(String[] args) {
        Sleep t1 =new Sleep();
        t1.setName("T1");
        Sleep t2 =new Sleep();
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}
