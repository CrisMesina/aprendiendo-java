import OOP.Estudiante;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("CUANTOS ESTUDIANTES QUIERES INGRESAR: ");
        int cantidad = s.nextInt();

        for (int i = 0; i < cantidad; i++){
            Estudiante estudiante = new Estudiante("", 11, 1.72);

            System.out.println("========== AGREGAR ESTUDIANTE NRO " + (i + 1) + " ==========");

            s.nextLine();
            System.out.println("INGRESA EL NOMBRE DEL ALUMNO: ");
            //estudiante.nombre = s.nextLine();

            System.out.println("INGRESA LA EDAD DEL ALUMNO: ");
            //estudiante.edad = s.nextInt();

            System.out.println("INGRESA LA ALTURA DEL ALUMNO: ");
            //estudiante.altura = s.nextDouble();

            System.out.println("==============================");
            //System.out.println("Nombre: " + estudiante.nombre);
            //System.out.println("Edad: " + estudiante.edad);
            //System.out.println("Altura: " + estudiante.altura);
            System.out.println("==============================");
        }





    }

}
