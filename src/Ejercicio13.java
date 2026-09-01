import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);


        System.out.println("¿Que tabla de multiplicar quieres ver?");
        int multi = s.nextInt();

        System.out.println("¿Hasta que numero quiers ver?");
        int fin = s.nextInt();


        System.out.println(" == TABLA DEL " + multi + " == ");

        for (int i = 1; i <= fin; i++){
            System.out.println(multi + " * " + i + " = " + (multi * i));
        }


    }

}
