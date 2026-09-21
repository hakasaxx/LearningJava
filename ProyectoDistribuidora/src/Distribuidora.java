import java.util.ArrayList;
public class Distribuidora {
    private ArrayList<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto p){
        this.productos.add(p);
        System.out.println("Agregado Correctamente");
    }
    public void listarProductos(){
        if(this.productos.isEmpty()){
            System.out.println("No hay productos registrados");
        }else {
            for (Producto producto : productos){
                System.out.println("\n____________________");
                System.out.println("Nombre: "+producto.getNombre());
                System.out.println("Precio: "+producto.getPrecio());
            }
        }
    }
    public void buscarPorProveedor(String proveedor){
        boolean encontrado = false;
        for (Producto producto : productos){
            if (producto.getProveedor().equalsIgnoreCase(proveedor)){
                encontrado = true;
                System.out.println("\n____________________");
                System.out.println("Nombre: "+producto.getNombre());
                System.out.println("Precio: "+producto.getPrecio());
            }
        }
        if (encontrado == false){
            System.out.println("NO SE ENCONTRO NADITA");
        }
    }
}
