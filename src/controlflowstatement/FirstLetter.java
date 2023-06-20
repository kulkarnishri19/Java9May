package controlflowstatement;

public class FirstLetter {
    public static void main (String args []) {
        for (int i=0; i<7; i++ ){
            for( int j=0; j< 5 ; j++){

                if ( i==0  || i==3 || i==6 ||(i==1&&j==1) ||(i==2&&j==1)
//                        ||(i==5&&j==3) ||(i==6&&j==3)
                ){
                    System.out.print(" * ");
                }


            }
            System.out.println( );
        }
    }
    }

