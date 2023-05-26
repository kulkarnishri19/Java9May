package controlflowstatement;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        int  j,i;
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter Any number");
//        int n = sc.nextInt();
        for (i =0;i<3; i++ )
        {
            for (j =0; j>=3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// _ _*
// _* *
//* * *
