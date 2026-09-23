void main() {
    Bebida bebida1 = new Bebida("PEPSI", "CCU", 1200, false, true);
    Bebida bebida2 = new Bebida("FRUCOLA", "FRUNA", 600, false, true);
    Vino vino1 = new Vino("GATO", "SAN PEDRO", 5000,10.5);
    Distribuidora distribuidora = new Distribuidora();
    System.out.println("\n---------- TEST AGREGAR ----------");
    distribuidora.agregarProducto(bebida1);
    distribuidora.agregarProducto(bebida2);
    distribuidora.agregarProducto(vino1);
    System.out.println("\n---------- TEST LISTAR ----------");
    distribuidora.listarProductos();
    System.out.println("\n--------- TEST BUSCAR X PROOVEDOR -----------");
    distribuidora.buscarPorProveedor("FRUNA");
}
