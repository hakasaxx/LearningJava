import java.lang.reflect.GenericArrayType;

public class Main {
    //autogeneramos un metodo main escribiendo main y presionamos enter
    static void main() {
        // Crear obejtos con la sintaxis:
         // Clase nombreObj = newConstructor(Parametro);
        Alumno alumno1 = new Alumno("Javier", 18, "Informatica");
        alumno1.imprimir();
        Alumno alumno2 = new Alumno("Marcos", 27, "Teleco");
        alumno2.imprimir();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("El nombre ahora es: " + alumno1.getNombre());
        alumno1.setNombre("Juanito");
        alumno1.imprimir();
        System.out.println("_______________________________");
        System.out.println("El nombre ahora es: " + alumno2.getNombre());
        alumno2.setNombre("Pedro");
        alumno2.imprimir();
        System.out.println("");
        Producto producto1 = new Producto("Mish","Nose", 3500, true);
        producto1.imprimir();
    }
}
