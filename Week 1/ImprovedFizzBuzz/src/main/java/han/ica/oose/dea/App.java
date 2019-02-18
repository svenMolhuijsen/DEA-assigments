package han.ica.oose.dea;

import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static int FIZZ_NUMBER = 3;
    public static int BUZZ_NUMBER = 5;

    public static void main(String[] args) {
        App App = new App();
        App.streamingFizzBuzz();
    }

    public void streamingFizzBuzz() {
        IntStream.range(1, 1000).forEach(number -> {
            try {
                doFizzBuzz(number);
            } catch (niceNumberException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.print("Sex");
            }
        });

    }

    private void doFizzBuzz(int number) throws niceNumberException {
        if (number == 7) {
            throw new disgustingNumberException();
        }
        if (number == 6) {
            throw new niceNumberException("nice number has occured");
        }
        if (number % FIZZ_NUMBER == 0) {
            System.out.print("fizz");
        }
        if (number % BUZZ_NUMBER == 0) {
            System.out.print("buzz");
        }

        System.out.println();
    }
}
