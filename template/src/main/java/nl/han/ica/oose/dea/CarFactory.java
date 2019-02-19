package nl.han.ica.oose.dea;

public class CarFactory {

static CarFactory factory;
    public enum CarType {
        Opel,
        Audi,
        Bentley
    }
    public static CarFactory getInstance() {
        if (factory == null){
            factory = new CarFactory();
        }
        return factory;
    }

    public Car createCar (CarType type){
            return this.createCar(type, null);
    }

    public Car createCar (CarType type, String engine){
        switch(type){
            case Opel:
                return new Opel(engine);
            case Audi:
                return new Audi(engine);
            case Bentley:
                return new Bently();
                default:
                    return null;
        }
    }
}
