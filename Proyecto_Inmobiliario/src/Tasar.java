// Una interface soporta constantes y metodods abstractos
public interface Tasar {
    //definir constante del enunciado
    public final double FACTOR_VENTA = 1.18;

    //definir met abs no es necesario abstract ya que solo soporta estas
    public double calcularTasacion();
}
