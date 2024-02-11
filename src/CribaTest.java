import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CribaTest {

    @org.junit.jupiter.api.Test
    void generarPrimosConMaxMayor2() {
        int max = 10;
        assertArrayEquals(new int[]{2,3,5,7}, Criba.generarPrimos(max));
    }

    @Test
    void generarPrimosConMaxMenor2() {
        int max = 1;
        assertArrayEquals(new int[0], Criba.generarPrimos(max));
    }

    @Test
    void generarPrimosConMaxIgual2() {
        int max = 2;
        assertArrayEquals(new int[]{2}, Criba.generarPrimos(max));
    }
}