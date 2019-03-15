package nl.han.ica.oose.dea;

public class BibliotheekItem {
    protected String titel;
    protected String auteur;

    public BibliotheekItem(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }
}
