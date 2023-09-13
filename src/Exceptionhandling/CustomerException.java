package Exceptionhandling;

interface  Bank {
    void depositMoney(Double amount);
    void withdrawMoney(Double amount);
}

class BankImp implements Bank {
    private Double balanceAmount = 5000.0;


    @Override
    public void depositMoney(Double amount) {
       if ( amount >0 ){
           balanceAmount =balanceAmount +amount ;
       }
          else {
              try{
                  throw  new InvalidAmount("Invalid Amount");
              }catch(Exception e){
                  System.out.println(e.getMessage());
              }
       }
        System.out.println("Balance : "+balanceAmount);
        }


    @Override
    public void withdrawMoney(Double amount) {
        if (balanceAmount < amount){
            try{
                throw new InsufficientAmount ("Insufficient Balance");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Reaming code");
    }
}
public class CustomerException {
    public static void main(String[] args) {
        Bank bank = new BankImp ();
        bank.depositMoney(-10000.0);
    }

}