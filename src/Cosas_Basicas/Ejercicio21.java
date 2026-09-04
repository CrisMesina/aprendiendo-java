package Cosas_Basicas;
public class Ejercicio21 {

    public static void main(String[] args){

        int [] numeros = {15, 42, 8, 31, 67, 23};

        int menor = 100;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] < menor){
                menor = numeros[i];
            }

        }

        System.out.println("El numero menor es: " + menor);

    }

}
