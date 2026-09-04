public class Ejercicio20 {

    public static void main(String[] args){

        int [] numeros = {15, 42, 8, 31, 67, 23};

        int mayor = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

        }

        System.out.println("El numero mayor es: " + mayor);

    }

}
