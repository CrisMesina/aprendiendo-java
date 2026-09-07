import OOP.Estudiante;

public class Ejercicio5 {

    public static void main(String[] args){

        // Creamos un estudiante.

        Estudiante estudiante = new Estudiante("Cristopher", 25, 1.72);

        System.out.println("EDAD ACTUAL DE " + estudiante.getNombre() + ": " + estudiante.getEdad());
        estudiante.cumpliAnios();
        System.out.println("EDAD ACTUAL PROXIMO AÑO : " + estudiante.getEdad());
        estudiante.estudiarHoras(3);
        estudiante.edadFutura();

    }

}
