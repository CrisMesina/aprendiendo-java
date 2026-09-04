import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeros = new int[5]; // Con esto creo un array con 5 posiciones. (0 -> 4)

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("INGRESA EL NUMERO DE LA POSICION " + (i+1) + ": ");
            numeros[i] = s.nextInt();

        }

        System.out.println(" ========== NUMEROS INGRESADOS ========== ");

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }

}
