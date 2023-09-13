package Exceptionhandling;

public class InsufficientAmount extends RuntimeException {

    public InsufficientAmount(String msg){
        super(msg);
    }
}
