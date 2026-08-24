public class Docente extends Persona {
    private String asignatura;
    private String tituloProfesional;

    public Docente(String nombre, int edad, char sexo, String asignatura, String tituloProfesional) {
        //super es para llama la weas de padre
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
        this.tituloProfesional = tituloProfesional;
    }
    public Docente() {
        super();
        this.asignatura = "NO INFO";
        this.tituloProfesional = "NO INFO";
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }
    public void imprimir(){
        super.imprimir();
        //se puede pasar por el pico super poniendo + this.getParametro
        System.out.println("Asignatura: " + this.asignatura);
        System.out.println("Titulo Profesional: " + this.tituloProfesional);
    }
}
