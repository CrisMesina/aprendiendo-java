import java.util.Scanner;

public class Ejercicio15 {




    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int option = 0;

        while(option !=5){

            System.out.println("==== MENU ====");
            System.out.println("1. Mostra un 'HOLA' ");
            System.out.println("2. Mostrar numeros del 1 al 10");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Comprobar si el numero es par o impar");
            System.out.println("5. Salir");

            System.out.println("Selecciona una opcion: ");
            option = s.nextInt();

            if (option == 1){
                System.out.println("Hola");
            } else if (option == 2) {
                mostrarNumeros();
            } else if (option == 3) {
                tablas(s);
            } else if (option == 4) {
                par(s);
            } else if (option == 5) {
                System.out.println("Programa finalizado...");
            }else {
                System.out.println("Opcion Incorrecta ._.");
            }

        }




    }



    public static void tablas(Scanner s){

        System.out.println("INGRESA EL NUMERO DE LA TABLA QUE QUIERES VER: ");
        int numero = s.nextInt();

        System.out.println("Hasta que numero quieres ver la tabla? ");
        int fin = s.nextInt();

        System.out.println("===== TABLA DEL " + numero + "=====");

        for (int i = 1; i <= fin; i++){
            System.out.println(numero + " * " + i + " = " + (numero * i)) ;
        }

    }

    public static void mostrarNumeros(){

        int count = 1;

        System.out.println("===== NUMEROS DEL 1 AL 10 =====");

        while (count <= 10){
            System.out.println(count);
            count++;
        }

    }


    public static void par(Scanner s){

        System.out.println("Ingresa un numero: ");
        int r = s.nextInt();

        if (r % 2 == 0){
            System.out.println(r + " Es un numero par");
        }else {
            System.out.println(r + " Es un numero impar");
        }

    }

}
