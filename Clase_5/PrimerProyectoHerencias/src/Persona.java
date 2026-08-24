public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona() {
        this.nombre = "SIN INFO";
        this.edad = 0;
        this.sexo = 'F';
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void imprimir () {
        System.out.println("----- INFO -----");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Sexo: "+ this.sexo);
    }
}
