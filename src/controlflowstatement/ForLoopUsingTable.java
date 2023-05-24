package controlflowstatement;

import java.util.Scanner;

public class ForLoopUsingTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Any Number");
        int number1 = sc.nextInt();
        int result = 0;
        for( int i=0; i <=10; i++){
            result = number1 * i;
            System.out.println(number1 + " * "+ i +" = " +result);
        }
    }
}
