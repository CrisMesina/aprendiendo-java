//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Repaso1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        System.out.println("Suma: " + sumar(num1, num2));

        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        System.out.println("Resta: " + restar(num1, num2));

        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        System.out.println("Multiplicacion: " + multiplicar(num1, num2));

        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        System.out.println("Division: " + division(num1, num2) );




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

    public static float division(float a, float b){
        return a / b;
    }
}