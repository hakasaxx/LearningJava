public final class Vino extends Producto {
    private double gradoAlcohol;
    public Vino(String nombre, String proveedor, int precio, double gradoAlcohol) {
        super(nombre, proveedor, precio);
        this.gradoAlcohol = gradoAlcohol;
    }

    public Vino() {
        super();
        this.gradoAlcohol = 0;
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
}
