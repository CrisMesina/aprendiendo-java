package OOP;

public class Estudiante {

    private String nombre;
    private int edad;
    private double altura;

    // Constructor (El nombre debe ser el mismo que el de la clase)


    public Estudiante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }


    public Estudiante() {
        this("Sin Nombre",0 ,0.0);
    }

    public Estudiante(String nombre, int edad) {
        this(nombre, edad, 0.0); // Este siempre debe estar primero.
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad >= 0){
            this.edad = edad;
        }

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }
    }

    public void estudiar(){
        System.out.println(nombre + " esta estudiando");
    }


}
