public class NullpointerExpection {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.toUpperCase());
        }catch(NullPointerException e){
            //e.printStackTrace();
            System.out.println("sting can not bre null");
            //System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
