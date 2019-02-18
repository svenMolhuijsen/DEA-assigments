package nl.han.ica.oose.dea;

/**
 * Hello world!
 *
 */
public class PrimeTestingApp
{
    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();

    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        Thread[] threads = new Thread[4];

        for(int i = 0 ; i < threads.length ; i++){
            threads[i] = new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
            threads[i].start();
            threads[i].run();

        }

        for(int i = 0 ; i < threads.length ; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
