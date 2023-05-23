package controlflowstatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number odd or even");
        int n = sc.nextInt();
        if ( n%2== 0)
        {
            System.out.println("Enter a Even number " +n);
        }
        else {
            System.out.println("Enter a odd number " +n );
        }
    }
}
