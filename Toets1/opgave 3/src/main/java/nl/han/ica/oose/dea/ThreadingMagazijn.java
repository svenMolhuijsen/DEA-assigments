package nl.han.ica.oose.dea;

public class ThreadingMagazijn{

    private int voorraad;

    public ThreadingMagazijn(int startVoorraad) {
        this.voorraad = startVoorraad;
    }

    synchronized public void pak(int aantal) {
        if (aantal > voorraad) {
            return;
        }
        voorraad = voorraad - aantal;
    }

    synchronized public void plaats(int aantal) {
        voorraad = voorraad + aantal;
    }

    public String toString() {
        return "Voorraad: " + voorraad;
    }

    public int getVoorraad() {
        return voorraad;
    }
}
