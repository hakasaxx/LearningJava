void main() {
    // vamos a crear un objeto
    Celular celular1 = new Celular("1234",
            "iPhone", 10.5);

    celular1.imprimir();

    celular1.setMarca("Samsung");
    celular1.imprimir();
    Celular celular2 = new Celular("2222",
            "Motorola", 9.8);
    celular2.imprimir();

    Celular celular3 = new Celular("3333",
            "Samsung", 10.3);


}
