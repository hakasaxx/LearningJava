import java.security.PrivateKey;

public abstract class Cuenta {
    private int numero;
    //colabora con un parametro de persona
    private Persona titular;
    private double saldo;

    public Cuenta(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public Cuenta() {
        this.numero = 0;
        this.titular = new Persona();
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public void depositar(double monto){
        if (monto > 0){
            this.saldo+=monto;
        }else {
            System.out.println("Debe ser mayor a cero");
        }
    }
    public abstract void girar(double monto);
    public void imprimirCartola(){
        System.out.println("----- CARTOLA -----");
        System.out.println("N° " + this.getNumero());
        System.out.println("Nombre Titular: "+ this.getTitular().getNombre());
        System.out.println("Saldo Disponible: "+ this.getSaldo());
    }
}
