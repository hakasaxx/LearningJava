public class Empleado {
    private String rut;
    private String nombre;
    private  int edad;
    private char sexo;
    private String cargo;
    private boolean casado;
    private double sueldoBase;

    public Empleado(String rut, String nombre, int edad, char sexo, String cargo, boolean casado, double sueldoBase) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cargo = cargo;
        this.casado = casado;
        this.sueldoBase = sueldoBase;
    }

    public Empleado() {
        this.rut = "NO INFO";
        this.nombre = "No info";
        this.edad = 18;
        this.sexo =  'M';
        this.cargo = "No info";
        this.casado = false;
        this.sueldoBase = 500000;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(this.rut.trim().length() != 0)
        this.rut = rut;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public  void imprimir(){
        System.out.println("RUT: "+this.rut);
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("EDAD: "+this.edad);
        System.out.println("SEXO: "+this.sexo);
        System.out.println("CARGO: "+this.cargo);
        if(casado){
            System.out.println("CASADO: SÍ");
        }else {
            System.out.println("CASADO: NO");
        }
        System.out.println("SUELDO BASE: "+this.sueldoBase);
    }
}
