import java.util.Scanner;

public class MiniProyecto1 {

    public static void main(String[] args){

        // Crear Scanner

        Scanner s = new Scanner(System.in);

        double [] notas = new double[5]; // Array con maximo de 5 notas

        double suma = 0;

        double mayor = notas[0];

        int mayorA4 = 0;
        int menorA4 = 0;

        for (int i = 0; i < notas.length; i++){

            System.out.println("INGRESA LA NOTA NRO " + ( i+1 ) + " DEL ESTUDIANTE: ");

            // Almacenar nota en Array double
            notas[i] = s.nextDouble();

           suma += notas[i]; // (int) notas[i];

            if (notas[i] > mayor){
                mayor = notas[i];
            }

            if (notas[i] >= 4.0){
                mayorA4++;
            } else{
                menorA4++;
            }




        }

        double promedio = suma / notas.length;

        double menor = notas[0];
        for(int i = 0; i < notas.length; i++){

            if (notas[i] < menor){
                menor = notas[i];
            }



            System.out.println(notas[i]);
        }



        System.out.println(" ========== INFORMACION ========== ");
        System.out.println("SUMA: " + suma);
        System.out.println("PROMEDIO: " + promedio);
        System.out.println("NOTA MAYOR: " +  mayor);
        System.out.println("NOTA MENOR: " +  menor);
        System.out.println("NOTAS MAYORES O IGUALES A 4: " + mayorA4);
        System.out.println("NOTAS MENORES A 4: " + menorA4);



    }

}

