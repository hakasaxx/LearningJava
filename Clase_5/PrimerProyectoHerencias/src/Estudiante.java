//extends hace q estudiante sea una extension o hja de persona
public class Estudiante extends Persona{
    private String carrera;
//generar un constructor con los parametros de persona
    //puede la version con o sin parametros
    public Estudiante(String nombre, int edad, char sexo, String carrera) {
        super(nombre, edad, sexo);
        this.carrera = carrera;
    }
    public Estudiante(){
        super();
        this.carrera = "SIN INFO";
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Carrera: " + this.carrera);
    }
}
