package String;

import com.sun.security.jgss.GSSUtil;

public class StringDemo {
    public static void main(String[] args) {
        char c[]= {'J','A','V','A'};
        //by using character array
        String s1 = c.toString();
//        System.out.println(c);

        // by using literal
        String s2 = "Codekul";

        //by using new keyword
        String s3 = new String ("Computer Science & Engineering");

        String name = "Sunday,Monday Tuesday";

        String s4 = "  H  i  ";

        System.out.println("Length: "+s2.length());
        System.out.println("Lowercase: "+s2.toLowerCase());
        System.out.println("UpperCase: "+s2.toUpperCase());
        System.out.println("equal : "+ s2.equals("Codekul"));
        System.out.println("equal ignore case: " +s2.equalsIgnoreCase("codeKUL"));
        System.out.println("substring: "+s3.substring(1,10));
        System.out.println("Char At: "+s3.charAt(9));
        System.out.println("codePoint: "+s3.codePointAt(0));// ASCII CODE
        System.out.println("concat: "+s3.concat(" Branch"));
        System.out.println("replace: "+s3.replace("Science","Application"));
        System.out.println("CodePoint before: "+s3.codePointBefore(1));//ASCII Code
        System.out.println("CodePoint Count: "+s3.codePointCount(3,6));
        System.out.println("Contains: "+s3.contains("Computer Science & Engineering"));
        System.out.println("Starts With: "+s3.startsWith("Comp"));
        System.out.println("End With: "+s3.endsWith("Comp"));
        System.out.println("Index OF: "+s3.indexOf("Science"));
//      System.out.println("  IsEmpty: "+s3.isEmpty(""));
        System.out.println("Last Index of: "+s3.lastIndexOf("Science & Engineering"));
        System.out.println("Replace All: "+s3.replaceAll("Computer Science & Engineering","CSE"));
        System.out.println("Replace First: "+s3.replaceFirst("Computer Science & Engineering","C"));
        String array[]= name.split(",");
        for(String s:array){
            System.out.println(s);
        }
        System.out.println("@ 1st index "+array[1]);

        System.out.println("trim "+s4.trim());

    }
}
