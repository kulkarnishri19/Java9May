package controlflowstatement;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter any Alphabet");
        char ch = sc .next().charAt(0);
        if ( ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("This is Vowels " +ch);
        }
        else {
            System.out.println("This is not matched any Vowels Alphabet " +ch);
        }
    }
}
