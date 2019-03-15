package nl.han.ica.oose.dea;

public class MagazijnMedewerker implements Runnable {
ThreadingMagazijn magazijn;
int taak;

public MagazijnMedewerker(ThreadingMagazijn magazijn, int hoeveelheid) {
this.magazijn = magazijn;
taak = hoeveelheid;
    }

public void doeTaak() {
    if (taak > 0) {
        magazijn.plaats(taak);
    } else
        magazijn.pak((0-taak));
    }

    @Override
    public void run() {
        doeTaak();
    }
}
