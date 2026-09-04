public class Ejercicio17 {

    public static void main(String[] args){

        int [] numeros = {10, 20, 30, 40, 50};

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        separador();

        numeros[0] = 100;
        numeros[4] = 500;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }



    }


    public static void separador(){
        System.out.println("/----------------------/");
    }

}
