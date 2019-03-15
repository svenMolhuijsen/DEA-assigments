package nl.han.ica.oose.dea;

public class Game extends BibliotheekItem {

    private String platform;

    public Game(String titel, String auteur, String platform) {
        super(titel, auteur);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
