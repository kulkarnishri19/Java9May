package Arrays;

public class ArraySumDemo {
    public static void main(String[] args) {
        int array[]={5,6,2,7,8,9,6,8,5,8} ;
        int result =0;
        for(int i =0 ; i<array.length; i++){
            System.out.println(array[i]);
            result=result + array[i];

        }
        System.out.println("sum "+ result);


    }
}
