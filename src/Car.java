import java.util.Random;

public class Car {

    private String name;
    private double price;
    private Color color;
    private Engine engine;
    private TypeOfGearbox typeOfGearbox;

    public Car(String name) {
        this.price = Math.round(Math.random() * (50000 - 25000) + 25000);
        this.name = name;
        this.color = randomColor();
        this.engine = new Engine(Math.round(Math.random() * (5 - 1) + 1));
        this.typeOfGearbox = randomTypeOfGearbox();
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

    public Color randomColor() {
        int pick = new Random().nextInt(Color.values().length);
        return Color.values()[pick];
    }

    public TypeOfGearbox randomTypeOfGearbox() {
        int pick = new Random().nextInt(TypeOfGearbox.values().length);
        return TypeOfGearbox.values()[pick];
    }

    public Color getColor() {
        return color;
    }

    public TypeOfGearbox getTypeOfGearbox() {
        return typeOfGearbox;
    }
}
