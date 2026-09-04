
package Cosas_Basicas;
import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args){

        String correctUser = "admin";
        String correctPass = "123";

        // Declarar scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario: ");
        String name = scanner.nextLine(); // Para textos

        System.out.println("Ingresa tu contraseña: ");
        String password = scanner.nextLine();

        if (name.equalsIgnoreCase(correctUser) && password.equals(correctPass)){
            System.out.println("Inicio de sesion exitoso");
        }else{
            System.out.println("Datos incorrectos");
        }



    }

}
