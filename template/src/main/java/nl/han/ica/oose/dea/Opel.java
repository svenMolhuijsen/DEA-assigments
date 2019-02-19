package nl.han.ica.oose.dea;

public class Opel implements Car {
    String engine;
    Opel(String engine){
        this.engine = engine;
    }
    @Override
    public void drive() {
        System.out.println("De Opel gaat rijden met een "+ engine + "motor");
    }
}
