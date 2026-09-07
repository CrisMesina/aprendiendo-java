import OOP.Estudiante;

public class Ejercicio4 {

    public static void main(String[] args){


        Estudiante estudiante1 = new Estudiante("Cristopher", 25);
        Estudiante estudiante2 = new Estudiante("", -10 , -1.80);
        Estudiante estudiante3 = new Estudiante("Valentina", 22);
        Estudiante estudiante4 = new Estudiante();

        System.out.println("====================INFORMACION DE ESTUDIANTE 1====================");
        System.out.println("NOMBRE: " + estudiante1.getNombre());
        System.out.println("EDAD: " + estudiante1.getEdad());
        System.out.println("ALTURA: " + estudiante1.getAltura());

        System.out.println("---");
        System.out.println("---");
        System.out.println("---");

        System.out.println("====================INFORMACION DE ESTUDIANTE 2====================");

        System.out.println("NOMBRE: " + estudiante2.getNombre());
        System.out.println("EDAD: " + estudiante2.getEdad());
        System.out.println("ALTURA: " + estudiante2.getAltura());

        System.out.println("====================INFORMACION DE ESTUDIANTE 3====================");

        System.out.println("NOMBRE: " + estudiante3.getNombre());
        System.out.println("EDAD: " + estudiante3.getEdad());
        System.out.println("ALTURA: " + estudiante3.getAltura());

        System.out.println("====================INFORMACION DE ESTUDIANTE 3====================");

        System.out.println("NOMBRE: " + estudiante4.getNombre());
        System.out.println("EDAD: " + estudiante4.getEdad());
        System.out.println("ALTURA: " + estudiante4.getAltura());



    }

}
