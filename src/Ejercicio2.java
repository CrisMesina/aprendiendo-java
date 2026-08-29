//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio2 {
    public static void main(String[] args) {

        String nombre = "Cristopher";
        String apellido = "Mesina";
        int edad = 25;
        int edadFutura = edad + 5;
        double altura = 1.73;
        double peso = 78.6;
        boolean tieneTrabajo = true;
        char inicial = 'C';




        System.out.println("NOMBRE: " + nombre);

        System.out.println("APELLIDO: " + apellido);
        System.out.println("EDAD: " + edad);
        System.out.println("EDAD EN 5 AÑOS: " + edadFutura);
        System.out.println("ALTURA: " + altura);
        System.out.println("PESO: " + peso + "KG");
        if (!tieneTrabajo){
            System.out.println("TIENE TRABAJO: NO");
        }else{
            System.out.println("TIENE TRABAJO: SI");
        }
        System.out.println("INICIAL: " + inicial);

    }
}