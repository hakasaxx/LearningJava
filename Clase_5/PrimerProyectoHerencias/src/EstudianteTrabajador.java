public class EstudianteTrabajador extends Estudiante{
    private String trabajo;
    public EstudianteTrabajador(String nombre, int edad, char sexo, String carrera, String trabajo) {
        super(nombre, edad, sexo, carrera);
        this.trabajo = trabajo;
    }
    public EstudianteTrabajador() {
        super();
        this.trabajo = "NO INFO";
    }
    public String getTrabajo() {
        return trabajo;
    }
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Trabajo: " + this.trabajo);
    }
}
