package Exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Remaing Code");
            String str = null ;
            System.out.println(str .toUpperCase());
        }catch (NullPointerException e ){
            System.out.println(e.getMessage());
        }
        System.out.println("Reaming Code");
    }
}
