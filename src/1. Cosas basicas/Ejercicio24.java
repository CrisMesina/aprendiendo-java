import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        //Cree un Scanner

        Scanner s = new Scanner(System.in);

        //Cree un array de 5 números enteros.

        int [] numeros = new int[5];

        // Crear variable para numero mayor

        int mayor = numeros[0];


        // Crear variable para numero suma

        int suma = 0;

        //Utilice un for para pedir los 5 números al usuario

        for (int i = 0; i < numeros.length; i++){

            System.out.println("INGRESA EL NUMERO DE LA UBICACION " + (i + 1) + ": ");

            //Guarde cada número dentro del array

            numeros[i] = s.nextInt();

            //Conseguir numero mayor
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

            //Calcule la suma de todos los números
            suma += numeros[i];


        }
        // Crear variable para numero menor

        int menor = numeros[0];


        //Calcular promedio

        double promedio = (double) suma / numeros.length;

        //Mostrar informacion

        System.out.println(" ========== INFORMACION ========== ");

        //Utilice otro for para recorrer el array
        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] < menor){
                menor = numeros[i];
            }

            System.out.println(numeros[i]);
        }
        System.out.println("LA SUMA DE ARRAY ES: " + suma);
        System.out.println("EL NUMERO MAYOR ES: " + mayor);
        System.out.println("EL NUMERO MENOR ES: " + menor);
        System.out.println("EL PROMEDIO ES: " + promedio);













    }

}
