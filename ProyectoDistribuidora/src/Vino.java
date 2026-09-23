public final class Vino extends Producto{
    private double gradoAlcoholico;

    public Vino(String nombre, String proveedor,
                int precio, double gradoAlcoholico) {
        super(nombre, proveedor, precio);
        this.gradoAlcoholico = gradoAlcoholico;
    }

    public Vino() {
        super();
        this.gradoAlcoholico = 0;
    }

    public double getGradoAlcoholico() {
        return gradoAlcoholico;
    }

    public void setGradoAlcoholico(double gradoAlcoholico) {
        this.gradoAlcoholico = gradoAlcoholico;
    }

    @Override
    public double calcularDescuento() {
        return this.getPrecio()*Calculable.DCTO_VINO;
    }

    @Override
    public double calcularTotalPagar() {
        double total = this.getPrecio()-this.calcularDescuento();
        return total*(1 + Calculable.IVA);
    }

    @Override
    public String toString() {
        return "Vino{" +
                "gradoAlcoholico=" + gradoAlcoholico +
                ", nombre='" + nombre + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
