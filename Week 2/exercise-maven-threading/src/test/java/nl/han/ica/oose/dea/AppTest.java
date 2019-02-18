package nl.han.ica.oose.dea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.apache.commons.math3.primes.Primes.isPrime;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    void Setup() {

    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //setup
        assertTrue( true );
        //test

        //verify
    }
    @Test
    void testIfSevenIsPrime(){
        Assertions.assertTrue(isPrime(7));
    }
    @Test
    void testIfEightIsPrime(){
        Assertions.assertFalse(isPrime(8));
    }


}
