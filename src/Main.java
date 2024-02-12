import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase main del proyecto JorgeAllepuzEntornos
 * @author jorge
 */
public class Main{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato = teclado.nextInt();
        int[] numPosibles = Criba.vectorCandidato(dato);
        System.out.println("Vector inicial hasta: " + dato + "\n" + Arrays.toString(numPosibles));
        int[] numPrimos = Criba.generarPrimos(dato);
        System.out.println("Vector de primos hasta: " + dato + "\n" + Arrays.toString(numPrimos));
        teclado.close();

    }
}