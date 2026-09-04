import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Repaso4 {


    public static void main(String[] args){

        // Ciclo for

        separador();

        for(int i = 1; i<=+5; i++){
            System.out.println(i);
        }

        separador();

        for (int i = 0; i <= 10; i +=2){
            System.out.println(i);
        }

        separador();

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        separador();

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        separador();

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = s.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero +" x " + i + " = " + (numero * i));
        }

    }


    public static void separador (){
        System.out.println("=============");
    }



}
