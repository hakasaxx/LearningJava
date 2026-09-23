public abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected Boolean activo;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, String telefono, Boolean activo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;
    }
    public Empleado(){
        this("NO INFO","NO INFO","NO INFO",false);
    }
    public String getNombre(){
        return nombre;
    }
    public abstract double calcularSalario();
    public abstract String obtenerRol();
    public void activar(){

    }
    public void desactivar(){

    }
    public String mostrarInfo(){
        return "*";
    }
    public void asignarTelefono(String telefono){

    }
}
