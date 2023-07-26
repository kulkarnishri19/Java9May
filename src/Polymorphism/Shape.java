package Polymorphism;

import javax.sound.midi.Soundbank;

public class Shape {
    float calculateArea(float i){
        System.out.println("Your didn't select shape");
        return  0;
    }
    float calculateArea(float height , float base, float breadth){
        return (height * base /2);
    }
}
class Circle extends  Shape {
    float calculateArea(float radius){

        return (float) (2*3.14*radius);
    }
}
class Triangle extends  Shape {
    float calculateArea(int l , int b ,int h ){

        return (h*b*l);
    }
}

class Square extends  Shape {
    float calculateArea(float side ){
        return (side * side);
    }
}

class Rectangle extends  Shape {
    float calculateArea(float length , float width ){
        return (length * width);
    }
}

class ShapeImpl{
    public static void main(String[] args) {

        Shape s ;

        s = new Circle();
        System.out.println("Circle area is :"+ s.calculateArea(5));

        s = new Triangle();
        System.out.println("Triangle Area is : "+s.calculateArea(45,24,58));

        s = new Square();
        System.out.println("Square area is : "+ s.calculateArea(5));

        s = new Rectangle();
        System.out.println("Rectangle Area is : "+s.calculateArea(45,24,85));
}
}
