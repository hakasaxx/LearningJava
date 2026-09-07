public abstract class Propiedad implements Tasar {
    private Propietario propietario;
    private Direccion direccion;
    private double metrosCuadrados;
    private double valorMetroCuadrado;
    private double valorPropiedad;
    private int numDormitorios;
    private int numBannos;

    public Propiedad(Propietario propietario, Direccion direccion, double metrosCuadrados, double valorMetroCuadrado, int numDormitorios, int numBannos) {
        this.propietario = propietario;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.numDormitorios = numDormitorios;
        this.numBannos = numBannos;
    }

    public Propiedad() {
        this.propietario = new Propietario();
        this.direccion = new Direccion();
        this.metrosCuadrados = 0;
        this.valorMetroCuadrado = 0;
        this.numDormitorios = 0;
        this.numBannos = 0;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public int getNumDormitorios() {
        return numDormitorios;
    }

    public void setNumDormitorios(int numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public double getValorPropiedad() {
        return valorPropiedad;
    }

    public void setValorPropiedad(double valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public int getNumBannos() {
        return numBannos;
    }

    public void setNumBannos(int numBannos) {
        this.numBannos = numBannos;
    }
    public abstract void imprimirInformacion();
}
