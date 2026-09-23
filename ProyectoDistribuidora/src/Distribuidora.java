import java.util.ArrayList;

public class Distribuidora {
    ///  definimos y creamos la colección
    private ArrayList<Producto> productos =
            new ArrayList<>();

    //---- ahora creamos las transacciones ----------
    public void agregarProducto(Producto p){
        this.productos.add(p);
        System.out.println("...registro almacenado!!!");
    }

    public void listarProductos(){
        if(this.productos.isEmpty()){
            System.out.println("NO hay productos registrados");
        } else {
            for (Producto producto : productos) {
                System.out.println("\n_________________");
                System.out.println(producto);
            }
        }
    }
    public void buscarPorProveedor(String proveedor){
        boolean encontrado = false;
        for (Producto producto : productos) {
            if(producto.getProveedor().equalsIgnoreCase(proveedor)){
                encontrado = true;
                System.out.println("\n_________________");
                System.out.println(producto.toString());
            }
        }
        if (encontrado == false){
            System.out.println("NO hay productos del proveedor");
        }
    }


}
