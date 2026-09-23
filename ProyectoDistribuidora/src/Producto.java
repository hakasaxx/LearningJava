public abstract class Producto implements Calculable{
    ///  + significa public --> TODOS TIENEN ACCESO
    ///  - significa private --> SOLO la clase tiene acceso
    ///  # significa protected--> SOLO LA FAMILIA tiene acceso
    protected String nombre;
    protected String proveedor;
    protected int precio;

    public Producto(String nombre, String proveedor, int precio) {
        this.setNombre(nombre);
        this.setProveedor(proveedor);
        this.setPrecio(precio);
    }
    public Producto(){
        this("NO info","NO info",0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty() || nombre == null){
            throw new IllegalArgumentException("NO puede ser vacio!!");
        } else {
            this.nombre = nombre.trim();
        }
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        if(proveedor.isEmpty() || proveedor ==null){
            throw new IllegalArgumentException("NO puede ser vacio");
        } else {
            this.proveedor = proveedor.trim();
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio >0) {
            this.precio = precio;
        }else {
            throw new IllegalArgumentException("Error debe ser mayor a cero");
        }
    }
}
