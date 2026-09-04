package Cosas_Basicas;
public class Ejercicio19 {

    public static void main(String[] args){

        int [] numeros = {8, 15, 3, 22, 10};

        int mayorQue10 = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] > 10){
                mayorQue10++;
            }

        }

        System.out.println("Hay " + mayorQue10 + " numeros mayores que 10");
    }

}
