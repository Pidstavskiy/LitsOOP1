public class User {

    private String name = "";
    private double summ;
    private Color[] preferredColors;
    private Color color;
    private Engine engine;
    private TypeOfGearbox typeOfGearbox;


    public User(String name, Color color, TypeOfGearbox typeOfGearbox) {
        this.summ = Math.round((Math.random() * (50000 - 25000) + 25000));
        this.name = name;
        this.color = color;
        this.engine = new Engine(Math.round((Math.random() * (5 - 1) + 1)));
        this.typeOfGearbox = typeOfGearbox;
    }

    public User() {

    }

    public TypeOfGearbox getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public String getName() {
        return name;
    }

    public double getSumm() {
        return summ;
    }

    public double getEngineVolumeforUser(){
        return engine.getSizeofEngine();
    }


    public Color getColor() {
        return color;
    }


}
