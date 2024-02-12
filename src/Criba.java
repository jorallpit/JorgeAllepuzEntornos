import java.util.Arrays;
import java.util.Scanner;

/**
 * La clase Criba se encarga de devolvernos un array con los numeros primos que hay desde 0 hasta el numero entero
 * que le pasamos a la clase por parametro.
 * @author jorge.
 */
public class Criba {
    /**
     * El metodo generarPrimos recibe un numero max y devuelve en un array los números primos de 1 a max
     * @param max recibe un numero entero.
     * @return primos devuelve un array con los numeros primos desde 0 hasta numero max.
     */
    public static int[] generarPrimos (int max){
        int[] primos = new int[0];
        for (int i = 2; i <= max; i++){
            if (esPrimo(i)){
                primos = Arrays.copyOf(primos, primos.length + 1);
                primos[primos.length - 1] = i;
            }
        }
        return primos;
    }

    /**
     * Con este metodo privado de la clase Criba, devolvemos un true si el numero que le pasamos por parámetro es primo
     * y devolvemos false si no lo es.
     * @param num numero.
     * @return <ul>
     *              <li>true si el numero num es primo.</li>
     *              <li>false si el numero num no es primo.</li>
     *</ul>
     */
    private static boolean esPrimo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Con este metodo de la clase Criba, mostramos un array con los numeros candidatos para extraer
     * los numeros primos en el metodo generarPrimos.
     * @param max numero entero maximo.
     * @return candidatos array desde 1 hasta num.
     */
    public static int[] vectorCandidato(int max){
        int[] candidatos = new int[0];
        for (int i = 1; i <= max; i++){
            candidatos = Arrays.copyOf(candidatos, candidatos.length + 1);
            candidatos[candidatos.length - 1] = i;
        }
        return candidatos;
    }

}

