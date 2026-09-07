import OOP.Estudiante;

public class Ejercicio2 {

    public static void main(String[] args){

        Estudiante estudiante = new Estudiante("Cristopher", 25, 1.72);
        Estudiante estudiante1 = new Estudiante("Valentina", 22, 1.69);
        System.out.println("====================INFORMACION DE ESTUDIANTE 1====================");
        System.out.println("NOMBRE: " + estudiante.getNombre());
        System.out.println("EDAD: " + estudiante.getEdad());
        System.out.println("ALTURA: " + estudiante.getAltura());

        System.out.println("---");
        System.out.println("---");
        System.out.println("---");

        System.out.println("====================INFORMACION DE ESTUDIANTE 2====================");
        System.out.println("NOMBRE: " + estudiante1.getNombre());
        System.out.println("EDAD: " + estudiante1.getEdad());
        System.out.println("ALTURA: " + estudiante1.getAltura());


    }

}
