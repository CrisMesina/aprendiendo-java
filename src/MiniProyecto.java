import OOP.Producto;

import java.util.Scanner;

public class MiniProyecto {

    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        Producto[] productos = new Producto[2];
        Producto pro = new Producto();


        // Llamar a menu.
        menu(s, productos, pro);




    }

    // ----------------------------------------------------------------------------------//
    // ----------------------------- REGISTRAR LOS PRODUCTOS ----------------------------//
    // ----------------------------------------------------------------------------------//

    public static void registrarProducto(Scanner s, Producto[] p, Producto producto){

        s.nextLine();

        for (int i = 0; i <p.length ; i++){
            Producto prod = new Producto();

            System.out.println("INGRESA EL NOMBRE DEL PRODUCTO NRO "+  ( i+1 ) + ": ");
            prod.setNombre(s.nextLine());

            System.out.println("INGRESA EL PRECIO DEL PRODUCTO NRO "+  ( i+1 ) + ": ");
            prod.setPrecio(s.nextDouble());

            s.nextLine();

            System.out.println("INGRESA EL STOCK DEL PRODUCTO NRO "+  ( i+1 ) + ": ");
            prod.setStock(s.nextInt());

            s.nextLine();

            p[i] = prod;

        }

        // Cuando termine el bucle for, hacer llamada a menu();
        menu(s, p, producto);
    }


    // ----------------------------------------------------------------------------------//
    // ----------------------------- MOSTRARR LOS PRODUCTOS -----------------------------//
    // ----------------------------------------------------------------------------------//


    public static void mostrarProductos(Producto[] p, Scanner s, Producto producto){

        for (int i = 0; i < p.length; i++ ){

            System.out.println("================ PRODUCTOS ===============");
            System.out.println("PRODUCTO: " + p[i].getNombre());
            System.out.println("PRECIO: " + p[i].getPrecio());
            System.out.println("STOCK: " + p[i].getStock());
        }

        int option = 0;
        System.out.println("1. VOLVER AL MENU");
        System.out.println("2. SALIR");

        option = s.nextInt();

        if (option == 1){
            menu(s, p, producto );
        }else if(option == 2){
            System.out.println("Saliendo...");
        }else {
            System.out.println("OPCION INCORRECTA. VOLVIENDO AL MENU...");
            menu(s, p , producto);
        }

    }



    // ----------------------------------------------------------------------------------//
    // -------------------------------- MOSTRAR MENU ------------------------------------//
    // ----------------------------------------------------------------------------------//


    public static void menu(Scanner s, Producto[] p, Producto producto){
        System.out.println("=======================================");
        System.out.println("         SISTEMA DE PRODUCTOS          ");
        System.out.println("=======================================");

        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar productos");
        System.out.println("4. Comprar productos");
        System.out.println("5. Reponer stock");
        System.out.println("6. Modificar producto");
        System.out.println("7. Eliminar Producto");
        System.out.println("8. Salir");

        System.out.println("Selecciona una opcion...");

        int option = s.nextInt();

        if (option == 1){
            registrarProducto(s, p, producto);
        }else if (option == 2){
            mostrarProductos(p, s, producto);
        } else if (option == 3) {
            System.out.println("Buscar Productos");
        }else if (option == 4){
            System.out.println("Comprar Productos");
        } else if (option ==5) {
            System.out.println("Reponer stock");
        } else if (option == 6) {
            System.out.println("Modificar producto");
        }else if (option == 7){
            System.out.println("Eliminar Producto");
        }else if (option == 8){
            System.out.println("Salir");
        }else{
            System.out.println("Opcion invalida. Vuelve a intentarlo.");
            menu(s, p, producto);
        }



    }

}
