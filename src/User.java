public class User {

    private String name = "";
    private double summ;
    private Engine engine;



    public User(String name) {
        this.summ = Math.round((Math.random() * (50000 - 25000) + 25000));
        this.name = name;
        this.engine = new Engine(Math.round((Math.random() * (5 - 1) + 1)));

    }

    public User() {

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



}
