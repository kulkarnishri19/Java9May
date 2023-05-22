package controlflowstatement;

public class ifstatementdemo {
    public static void main (String args[]){
        int x =10;
        int y = 10;
        if ( x< y)
            System.out.println("Y is greater");
        // if --else statement
        if (x> y)
            System.out.println("x is grater");
        else
            System.out.println("Y is grater");

        //if- else ladder
        String  city = "Mumbai ";
        if (city.equals("pune"))
            System.out.println("your in pune");
        else
            if ( city.equals("Mumbai "))
                System.out.println("your in Mumbai");
            else
                System.out.println("your in Nagpur");

            //Nested if-else
        String state = " Maharashtra";
        if (state.equals("Maharashtra")){
            if (state.equals("Pune")){
                System.out.println("your in Maharashtra");
            }

        }else {
            System.out.println("Your in Up");
        }
     }
}
