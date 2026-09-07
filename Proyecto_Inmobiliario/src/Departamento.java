public class Departamento extends Propiedad{
    private final double FACTOR_POR_PISO = 0.35;
    private int piso;
    private boolean bodega;
    private boolean estacionamiento;

    public Departamento(Propietario propietario, Direccion direccion, double metrosCuadrados, double valorMetroCuadrado, int numDormitorios, int numBannos, int piso, boolean bodega, boolean estacionamiento) {
        super(propietario, direccion, metrosCuadrados, valorMetroCuadrado, numDormitorios, numBannos);
        this.piso = piso;
        this.bodega = bodega;
        this.estacionamiento = estacionamiento;
    }

    public Departamento() {
        super();
        this.piso = 0;
        this.bodega = false;
        this.estacionamiento = false;
    }

    public double getFACTOR_POR_PISO() {
        return FACTOR_POR_PISO;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("\n --- INFO DEPTO ---");
        System.out.println("Direccion: " + this.getDireccion().toString());
        System.out.println("Propietario: " + this.getPropietario().getNombre());
        System.out.println("Piso: " + this.getPiso());
        if (this.isBodega()) {
            System.out.println("Bodega: Si");
        } else {
            System.out.println("Bodega: No");
        }
        if (this.isEstacionamiento()) {
            System.out.println("Estacionamiento: Si");
        } else {
            System.out.println("Estacionamiento: No");
        }
        System.out.println("Valor depto: "+ this.calcularTasacion());
    }
    @Override
    public double calcularTasacion() {
        return (this.getMetrosCuadrados()*this.getValorMetroCuadrado()+ this.getPiso()*this.FACTOR_POR_PISO)*Tasar.FACTOR_VENTA;
    }
}
