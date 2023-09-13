package Exceptionhandling;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        if (age <=60)
            throw new ArithmeticException("Not applicable for vaccine ");
        else
            System.out.println("applicable for vaccine");

    }
}
