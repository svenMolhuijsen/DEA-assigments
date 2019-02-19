package nl.han.ica.oose.dea;

public class Audi implements Car {

    String engine;
    Audi(String engine){
    this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("De Audi gaat rijden met een "+ engine +" motor");
    }
}
