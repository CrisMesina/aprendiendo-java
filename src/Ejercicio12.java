import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("INGRESA TU NOMBRE: ");
        String name = s.nextLine();


        System.out.println("INGRESA TU EDAD: ");
        int age = s.nextInt();

        System.out.println("Ingresa tu altura: ");
        double height = s.nextDouble();

        System.out.println("==== INFORMACION ====");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height);
        System.out.println("Edad en 5 años: " + (age + 5));

    }

}
