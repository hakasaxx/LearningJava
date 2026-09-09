// Una interface soporta constantes y metodods abstractos
public interface Tasar {
    //definir constante del enunciado
    public final double FACTOR_VENTA = 1.18;

    //definir metodo abs, no es necesario escribir abstract ya que solo soporta estas y se asume
    public double calcularTasacion();
}
