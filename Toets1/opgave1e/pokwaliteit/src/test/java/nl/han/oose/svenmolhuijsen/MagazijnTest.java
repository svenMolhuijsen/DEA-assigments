package nl.han.oose.svenmolhuijsen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MagazijnTest {
Magazijn magazijn ;

    @BeforeEach
    void setup(){
        magazijn = new Magazijn(10);
    }

    @Test
    void pak() {
        magazijn.pak(5);
assertEquals(5, magazijn.getVoorraad());

    }

    @Test
    void plaats() {
        magazijn.plaats(5);
        assertEquals(15, magazijn.getVoorraad());
    }

    @Test
    void getVoorraad() {
        assertEquals(10, magazijn.getVoorraad());
    }
}