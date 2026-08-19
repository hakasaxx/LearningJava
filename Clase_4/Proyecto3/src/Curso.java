import java.security.cert.TrustAnchor;
import java.util.TreeMap;

public class Curso {
    private String codigo;
    private String nombre;
    private int cupos;
    private char jornada;
    private boolean online;

    public Curso(String codigo, String nombre, int cupos, char jornada, boolean online) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupos = cupos;
        this.jornada = jornada;
        this.online = online;
    }
    public Curso(){
        this.codigo = "NO info";
        this.nombre = "NO info";
        this.cupos = 0;
        this.jornada = 'D';
        this.online = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public char getJornada() {
        return jornada;
    }

    public void setJornada(char jornada) {
        this.jornada = jornada;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void imprimir(){
        System.out.println("--- INFO ---");
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Cupos: "+ this.cupos);
        System.out.println("Jornada: "+ this.jornada);
        if (this.isOnline()){
            System.out.println("¿Es Online?: Si");
        }else {
            System.out.println("¿Es Online?: No");
        }
    }
    public void setCodigo(String codigo){
        if(codigo.trim().length() == 7){
            this.codigo = codigo.trim().toUpperCase();
        }else {
            System.out.println("error");
        }
    }
}
// == y != no sirve para string