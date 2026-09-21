public abstract class Producto implements Calculable{
    protected String nombre;
    protected String proveedor;
    protected int precio;

    public Producto(String nombre, String proveedor, int precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    public Producto() {
        this.nombre = "NO INFO";
        this.proveedor = "NO INFO";
        this.precio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty() || nombre == null){
            System.out.println("NOMBRE VACIO Q WEA");
        } else {
            this.nombre = nombre.trim();
        }
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        if(proveedor.isEmpty() || proveedor == null){
            System.out.println("PROOVEDOR VACIO NO WEI");
        } else{
            this.proveedor = proveedor;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio >0){
            this.precio = precio;
        }else {
            System.out.println("DEBE SER MAYOR A CERO");
        }
    }
}
