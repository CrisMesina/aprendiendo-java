package Cosas_Basicas;
public class Ejercicio6 {

    public static void main(String[] args){

        int edad = 25;


        if (edad >= 0 && edad<= 12){
            System.out.println("Eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un Adulto");
        }else{
            System.out.println("Eres un adulto mayor");
        }

    }

}
