package controlflowstatement;

import java.sql.SQLOutput;
import java.util.Scanner;
//smallest number
//odd even number
public class largest {
     public  static void main (String []args)
     {
          Scanner sc = new Scanner(System .in);
          System.out.println("enter first no");
          int n1 =  sc.nextInt();
          System.out.println("enter first no");
          int n2 =  sc.nextInt();
          System.out.println("enter first no");
          int n3 =  sc.nextInt();

          if (n1 > n2 && n1 >n3)
               System.out.println(n1 +"is a largest number");
          else
               if(n2> n1 && n2>n3)
                    System.out.println(n2+"is a largest number");
               else
                    System.out.println(n3+"is largest number");

     }
}
