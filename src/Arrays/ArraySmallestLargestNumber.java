package Arrays;

public class ArraySmallestLargestNumber {
    public static void main(String[] args) {
     int array[] ={ 0,2,4,5,6,9,1,10};
     int smallestNumber =array[0];
     int largestNumber =array[0];

     for (int i=0; i<array.length;i++){
         if (array[i] > largestNumber)
             largestNumber = array[i];
         else if (array[i] < smallestNumber)
             smallestNumber = array[i];
     }
        System.out.println("SmallestNumber is an array :"+smallestNumber );
        System.out.println("LargestNumber is an array :"+largestNumber);
    }
}
