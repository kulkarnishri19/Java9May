package Association;

public class Car {
    String carName;
    String model;
    String color;
    Engine engine;
    Mplayer mplayer;

    public Car(String carName, String model, String color, Engine engine, Mplayer mplayer) {
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.mplayer = mplayer;
    }
    void display (){
        System.out.println("Car Name- " +carName);
        System.out.println("Model -" +model);
        System.out.println("Color -" +color);
        System.out.println("Mplayer- " +mplayer);
        System.out.println("engine  -"+ engine);
    }
}
class  Engine {
    String chassisNo ;
    int hp;
    Engine (String chassisNo, int hp){
        this.chassisNo =chassisNo;
        this.hp = hp;
    }
}
class Mplayer{
    String companyName ;
    Mplayer (String companyName ){
        this.companyName=companyName;
    }

}
class carImpl{
    public static void main(String[] args) {
        Engine engine = new Engine  ("ADVEB575748",3000);
        Mplayer mplayer = new Mplayer ("jbl");
        Car car = new Car("Harrier", "black","sports",engine,mplayer);
        car.display();
    }
}