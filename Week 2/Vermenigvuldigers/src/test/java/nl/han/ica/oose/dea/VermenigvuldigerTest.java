package nl.han.ica.oose.dea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VermenigvuldigerTest {
Vermenigvuldiger vermenigvuldiger;
    @BeforeEach
    void setup(){
vermenigvuldiger = new Vermenigvuldiger(10);
    }
    @Test
    void printTafel() {
vermenigvuldiger.printTafel();
    }

    @Test
    void run() {
vermenigvuldiger.run();
    }
}