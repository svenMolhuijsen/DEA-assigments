package nl.han.ica.oose.dea;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args )
    {
        Car opel = CarFactory.getInstance().createCar(CarFactory.CarType.Opel,"1.6 liter diesel");
        Car bentley = CarFactory.getInstance().createCar(CarFactory.CarType.Bentley);
        Car audi = CarFactory.getInstance().createCar(CarFactory.CarType.Audi,"1.6 liter diesel");

        opel.drive();
        bentley.drive();
        audi.drive();

    }
}
