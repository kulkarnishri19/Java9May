package Exceptionhandling;

public class IndexOutOfException {
    public static void main(String[] args) {
        int arr [] = new int [5];
        try {
            arr[0] = 5;
            arr[1] = 5;
            arr[2] = 5;
            arr[5] = 5;

        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }
        System.out.println(arr);
        System.out.println("Remaining  code");
    }
}
