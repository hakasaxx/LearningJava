void main() {

    this.testTasarDepto();


}

void testTasarDepto() {
    System.out.println("\n--- test tasación depto--");
    Departamento depto = new Departamento(
            new Propietario("Pablo",26,'M', false),
            new Direccion("Alameda",1234, "Stgo"),
            120, 50_000,
            2, 2, 10,
            true, true);

    depto.imprimirInformacion();

}