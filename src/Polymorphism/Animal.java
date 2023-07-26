package Polymorphism;

public class Animal {
    String breed ="Any";
    void run(){
        System.out.println("a method is run animal");
    }
}
class Dog extends Animal {
    String breed = "German Shepard";

    void run ()
    {
        System.out.println("in dog run method ");
    }
}
class AnimalImpl {
    public static void main(String[] args) {
//        Animal animal = new Dog;
        Animal animal;
        animal= new Dog();
        animal.run();
        System.out.println(animal.breed);

    }
}