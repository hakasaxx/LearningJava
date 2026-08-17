public class Celular {
    private String numero;
    private String marca;
    private double pantalla;

    // vamos autogenerar código
    // Presionas ALt + ins
    // comenzamos con el constructor
    public Celular(String numero, String marca, double pantalla) {
        this.numero = numero;
        this.marca = marca;
        this.pantalla = pantalla;
    }

    // seguimos con getter y setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public void imprimir(){
        System.out.println("--- Info Celular ---");
        System.out.println("Numero: "+this.numero);
        System.out.println("Marca: "+this.marca);
        System.out.println("Pantalla: "+this.pantalla);
    }
}
