package Cosas_Basicas;
public class Ejercicio10 {

    public static void main(String[] args){

        String correctUser = "admin";
        String correctPass = "123";

        String insertUser = "Admin";
        String insertPass = "123";

        if (correctUser.equalsIgnoreCase(insertUser) && insertPass.equals(correctPass)){
            System.out.println("Inicio de sesion exitoso");
        }else{
            System.out.println("Datos incorrectos :P");
        }

    }

}
