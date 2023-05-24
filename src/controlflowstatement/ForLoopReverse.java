package controlflowstatement;

import java.util.Scanner;

public class ForLoopReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number ");
        int i, no = sc.nextInt();
        for (i=no;i>0;i--)
        System.out.println(i);
    }
}
