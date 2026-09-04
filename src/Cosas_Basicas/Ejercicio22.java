package Cosas_Basicas;
public class Ejercicio22 {

    public static void main(String[] args){

        int [] numeros = {10, 20, 30, 40, 50};

        int suma = 0;

        for (int i = 0;  i < numeros.length; i++){

            suma = suma + numeros[i];

        }

        double promedio = (double)suma / numeros.length; // Transformamos suma a double.


        System.out.println(promedio);




    }

}
