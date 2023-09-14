package Multitheradting;

public class BookTicket {
    private static Integer ticketAvailable =100;
    synchronized static  void bookTicket( int requiredTicket)
    {
        if (ticketAvailable >= requiredTicket){
            ticketAvailable = ticketAvailable- requiredTicket;
            System.out.println(requiredTicket+"are booked");
            System.out.println("Total Ticket available : "+ ticketAvailable);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            }else {
            System.out.println("No ticket available");
        }
    }
}
class ThreadTicket1 extends Thread{
    private BookTicket bookTicket;
    private int tickets;
    ThreadTicket1 (int tickets,BookTicket bookTicket1){
        this.tickets=tickets;
        this.bookTicket =bookTicket1;
    }

    @Override
    public void run() {
        bookTicket.bookTicket(tickets);
    }
}
class ThreadTicket2 extends  Thread{
    private BookTicket bookTicket2;
    private int tickets;
    ThreadTicket2 (int tickets,BookTicket bookTicket){
        this.tickets=tickets;
        this.bookTicket2 = bookTicket;
    }

    @Override
    public void run() {
        bookTicket2.bookTicket(tickets);
    }
}

class BookTicketImpl{
    public static void main(String[] args) {
        BookTicket bookTicket1 = new BookTicket();
        ThreadTicket1 t1 = new ThreadTicket1(20,bookTicket1);
        ThreadTicket2 t2 = new ThreadTicket2(30, bookTicket1);

        BookTicket bookTicket2 = new BookTicket();
        ThreadTicket1 t3 = new ThreadTicket1(40 ,bookTicket2);
        ThreadTicket2 t4 = new ThreadTicket2(50,bookTicket2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
