package Constructor;

public class StaticDemoBlock {
    int x ;
    static  int cnt;

    public static void main(String[] args) {
        cnt = 0;
        System.out.println("in main method");

    }
    static {
        cnt = 0;
        // x =0; //not allows
        System.out.println("in static method");

    }
    void display(){
        x= 0;
        cnt =0;
    }
}
