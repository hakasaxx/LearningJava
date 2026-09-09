//Una case final no puede tenr hijas, para seguridad
public final class Casa extends Propiedad{
    private boolean entradaDeAuto;

    public Casa(Propietario propietario, Direccion direccion, double metrosCuadrados, double valorMetroCuadrado, int numDormitorios, int numBannos, boolean entradaDeAuto) {
        super(propietario, direccion, metrosCuadrados, valorMetroCuadrado, numDormitorios, numBannos);
        this.entradaDeAuto = entradaDeAuto;
    }

    public Casa() {
        super();
        this.entradaDeAuto = false;
    }

    public boolean isEntradaDeAuto() {
        return entradaDeAuto;
    }

    public void setEntradaDeAuto(boolean entradaDeAuto) {
        this.entradaDeAuto = entradaDeAuto;
    }

    @Override
    public double calcularTasacion() {
        double total = (this.getMetrosCuadrados()* this.getValorMetroCuadrado())+ Tasar.FACTOR_VENTA;
        if (this.entradaDeAuto == true){
            total = total+300000;
        }
        return total;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("---Mish test casa---");
        System.out.println("valor: ");
    }
}
