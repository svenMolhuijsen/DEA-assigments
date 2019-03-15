package nl.han.ica.oose.dea;

public class TitelAreadyInUseException extends Throwable {
    public TitelAreadyInUseException(String titel) {
        System.out.println("titel: " +titel+ " wordt al gebruikt");
    }
}
