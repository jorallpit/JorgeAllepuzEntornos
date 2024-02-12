import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas de funcionalidad de la clase Criba.
 */
class CribaTest {
    /**
     * Prueba que verifica primos mayores a 2.
     */

    @org.junit.jupiter.api.Test
    void generarPrimosConMaxMayor2() {
        int max = 10;
        assertArrayEquals(new int[]{2,3,5,7}, Criba.generarPrimos(max));
    }

    /**
     * Prueba que verifica primos menores a 2.
     */
    @Test
    void generarPrimosConMaxMenor2() {
        int max = 1;
        assertArrayEquals(new int[0], Criba.generarPrimos(max));
    }

    /**
     * Prueba que verifica primos iguales a 2.
     */
    @Test
    void generarPrimosConMaxIgual2() {
        int max = 2;
        assertArrayEquals(new int[]{2}, Criba.generarPrimos(max));
    }
}