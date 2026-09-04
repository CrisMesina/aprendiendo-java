package Cosas_Basicas;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("INGRESA UN NUMERO: ");
        int numero = s.nextInt();

        int count = 1;

        while (count <= numero){
            System.out.println(count);
            count++;
        }



    }

}
