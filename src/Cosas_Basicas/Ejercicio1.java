package Cosas_Basicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {

        String nombre = "Cristopher";
        int edad = 25;
        double altura = 1.73;
        boolean esEstudiante = false;
        char inicial = 'C';


        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("ALTURA:" + altura);
        if (!esEstudiante){
            System.out.println("ES ESTUDIANTE: NO");
        }else{
            System.out.println("ES ESTUDIANTE: SI");
        }
        System.out.println("INICIAL: " + inicial);

    }
}