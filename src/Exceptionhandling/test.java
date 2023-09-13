package Exceptionhandling;

public class test {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.toUpperCase());
        }catch(ArithmeticException e ){ // catch or finally
            System.out.println(e.getMessage());

        }
        System.out.println("rs=est of code");
    }
}
