package nl.han.ica.oose.dea;


import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        runThreads();
    }

    private static void runThreads() {
        var vermenigvuldigThreads = new ArrayList<Thread>();
        for(int i=1; i <= 10; i++) {
            vermenigvuldigThreads.add(new Thread(new Vermenigvuldiger(i)));
            vermenigvuldigThreads.get(i).run();
        }
    }
}
