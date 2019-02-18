package nl.han.ica.oose.dea;

public class negativeNumberException extends Throwable {
    public negativeNumberException(Integer number) {
        super("negatief nummer niet toegestaan: " + number);
    }
}
