package controlflowstatement;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First no");
            int n1 = sc.nextInt();
            System.out.println("Enter First no");
            int n2 = sc.nextInt();
            System.out.println("Enter First no");
            int n3 = sc.nextInt();

            if (n1 < n2 && n1 < n3)
                System.out.println(" is a Smallest  number : " + n1);
            else if (n2 < n1 && n2 < n3)
                System.out.println(" is a Smallest number: " + n2);
            else
                System.out.println(" is Smallest number:  " + n3);

        }
    }
}

