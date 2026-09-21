public interface Calculable {
    public final double IVA = 0.19;
    public final double DCTO_BEBIDA = 0.10;
    public final double DCTO_VINO = 0.15;
    public abstract double calcularDescuento();
    public abstract double calcularTotalPagar();
}
