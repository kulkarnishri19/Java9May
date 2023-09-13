package Exceptionhandling;

import java.util.Scanner;

public class VottingException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if (age<=18)
            throw new ArithmeticException("You not Vot any Party");
        else
            System.out.println("You Vot any Party");
    }
}
