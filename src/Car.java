import java.util.Random;

public class Car {

    private String name;
    private double price;
    private Engine engine;


    public Car(String name) {
        this.price = Math.round(Math.random() * (50000 - 25000) + 25000);
        this.name = name;
        this.engine = new Engine(Math.round(Math.random() * (5 - 1) + 1));

    }

    public double getEngineVolume(){
        return engine.getSizeofEngine();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
