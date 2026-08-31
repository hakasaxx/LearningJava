public class CuentaAhorro extends Cuenta {
    private final double TASA_AHORRO = 1.015;
    private int numGiros;

    public CuentaAhorro(int numero, Persona titular) {
        super(numero, titular);
        this.numGiros = 0;
    }

    public CuentaAhorro() {
        super();
        this.numGiros = 0;
    }

    public double getTASA_AHORRO() {
        return TASA_AHORRO;
    }

    public int getNumGiros() {
        return numGiros;
    }

    public void setNumGiros(int numGiros) {
        this.numGiros = numGiros;
    }

    @Override
    public void girar(double monto) {
        if (monto > 0) {
            if (monto <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - monto);
                this.numGiros += 1;
            } else {
                System.out.println("MISH");
            }
        } else {
            System.out.println("MISH");
        }

    }
}