import OOP.Estudiante;

public class Ejercicio3 {

    public static void main(String[] args){

        Estudiante estudiante = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Cristopher", 25);
        Estudiante estudiante3 = new Estudiante("Valentina", 22, 1.69);


        System.out.println("====================INFORMACION DE ESTUDIANTE 1====================");
        System.out.println("NOMBRE: " + estudiante.getNombre());
        System.out.println("EDAD: " + estudiante.getEdad());
        System.out.println("ALTURA: " + estudiante.getAltura());

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


    }

}
