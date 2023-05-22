package controlflowstatement;

import java.util.Scanner;

public class weekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in );
        System.out.println("week Days");
        String weekday =sc.next();

        switch(weekday)
        {
            case "MON":
                System.out.println("Today is Monday");
                break;
            case "THU":
                System.out.println("Today is Tuesday");
                break;
            case "WED":
                System.out.println("Today is Wednesday");
                break;
            case "THRU":
                System.out.println("Today is Thursday");
                break;
            case "FRI":
                System.out.println("Today is Friday");
                break;
            case "SAT":
                System.out.println("Today is Saturday");
                break;
            case "SUN":
                System.out.println("Today is Sun");

            default :
                System.out.println("invalid choice");

        }
    }
}
