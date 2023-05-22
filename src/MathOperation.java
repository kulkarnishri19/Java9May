public class MathOperation {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("X :" + x);
        System.out.println("Y :" + y);
        System.out.println("message " + args[2]);
        int result = 0;
        result = x + y;
        System.out.println("Addition:-" + result);
        result = x * y;
        System.out.println("multiplication:-" + result);
        result = x - y;
        System.out.println("Subtraction:-" + result);
        result = x / y;
        System.out.println("Division:-" + result);
        result = x % y;
        System.out.println("modulo:-" + result);

    }

}
