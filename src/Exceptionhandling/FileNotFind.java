package Exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFind {
    public static void main(String[] args) {
        try{
            PrintWriter PW = new PrintWriter("abc.text");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
