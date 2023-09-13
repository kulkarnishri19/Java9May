package Multitheradting;

   public class PrintTableSynchronized {
       synchronized void PrintTableSynchronized(int no){
        for (int i=1; i<=10;i++){
            System.out.println(i*no);
            try{
                Thread.sleep(500);

            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class ThreadImpl{
    public static void main(String[] args) {
        PrintTableSynchronized printTable = new PrintTableSynchronized();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    printTable.PrintTableSynchronized (5);

                }
            };
            thread1.start();
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    printTable.PrintTableSynchronized(7);
                }
            };
            thread2.start();
    }
}
