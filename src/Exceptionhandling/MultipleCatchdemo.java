package Exceptionhandling;

public class MultipleCatchdemo {
    public static void main(String[] args) {
        try{
            String str = "CodeKul";
            System.out.println(str.toUpperCase());
            System.out.println(10/2);
            int n = Integer.parseInt(str);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("remaining code");

    }
}
