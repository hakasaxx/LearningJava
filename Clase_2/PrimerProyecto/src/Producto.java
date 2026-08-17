public class Producto {
    private String nombre;
    private String marca;
    private double precio;
    private boolean oferta;

    public Producto(String nombre, String marca, double precio, boolean oferta) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.oferta = oferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
    public void imprimir(){
        System.out.println("Nombre del producto: "+ this.nombre);
        System.out.println("Marca del producto: "+ this.marca);
        System.out.println("Precio del producto: "+ this.precio);
        if(this.oferta){
            System.out.println("Producto en oferta: SI");
        }else {
            System.out.println("Producto en oferta: NO");
        }
    }
}
