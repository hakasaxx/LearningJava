public class Persona {
    private String nombre;
    private String run;
    private int edad;
    private String ocupacion;

    public Persona(String nombre, String run, int edad, String ocupacion) {
        this.nombre = nombre;
        this.run = run;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public Persona() {
        this.nombre = "NO INFO";
        this.run = "MO INFO";
        this.edad = 0;
        this.ocupacion = "NO INFO";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun(){
        return run;
    }

    public void setRun(String run){
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
