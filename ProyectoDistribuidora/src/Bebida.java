public final class Bebida extends Producto{
    private boolean light;
    private boolean gasificada;

    public Bebida(String nombre, String proveedor, int precio, boolean light, boolean gasificada) {
        super(nombre, proveedor, precio);
        this.light = light;
        this.gasificada = gasificada;
    }

    public Bebida() {
        super();
        this.light = false;
        this.gasificada = false;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isGasificada() {
        return gasificada;
    }

    public void setGasificada(boolean gasificada) {
        this.gasificada = gasificada;
    }

    @Override
    public double calcularDescuento() {
        return this.getPrecio()*Calculable.DCTO_BEBIDA;
    }

    @Override
    public double calcularTotalPagar() {
        double total = this.getPrecio()-this.calcularDescuento();
        return total*(1 + Calculable.IVA);
    }
}
