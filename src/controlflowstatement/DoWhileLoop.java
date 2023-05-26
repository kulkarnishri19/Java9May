package controlflowstatement;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int ch;
        Scanner sc =  new Scanner(System.in);
        do{
            System.out.println("Enter Any two Number ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Addition ");
            System.out.println("Subtraction");
            System.out.println("Addition");
            System.out.println("Division");
            System.out.println("Exit.");
            System.out.println("Enter any choice Number");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Addition :"+ (x+y));
                    break;
                case 2:
                    System.out.println("Addition :"+ (x-y));
                    break;
                case 3:
                    System.out.println("Addition :"+ (x*y));
                    break;
                case 4:
                    System.out.println("Addition :"+ (x/y));
                    break;
                case 5:
              System.exit(0);
            }
        }while(ch<=5);
    }
}
