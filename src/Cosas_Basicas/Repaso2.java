package Cosas_Basicas;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Repaso2 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 6;

        separador();

        System.out.println("Suma: " + sumar(num1, num2));

        separador();

        System.out.println("Resta: " + restar(num1, num2));

        separador();

        System.out.println("Multiplicacion: " + multiplicar(num1, num2));

        separador();

        System.out.println("Division: " + division(num1, num2) );

        separador();

        System.out.println("Modulo: " + modulo(num1, num2) );





    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static int modulo(int a, int b ){
        return a%b;
    }



    public static void separador(){
        System.out.println("");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("");

    }
}