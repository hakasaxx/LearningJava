public class Alumno {
    //atributos
    private String nombre;
    private int edad;
    private String carrera;
     //autogenerar con ALT + Insert
      // constructor carga los valores de arranque
       // mantener ctrl y seleccionar los campos a generar
    public Alumno(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    //ahora autogenerar los get and setter
     // getter accede a la info de un atributo y setter la modifica
      // basicamente pide la info y set modifica la info que se da en el atributo
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void imprimir () {
        // sout = System.out.println();
        System.out.println("Nombre Original: "+ this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Carrera: "+ this.carrera);
    }

}
