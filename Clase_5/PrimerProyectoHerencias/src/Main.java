//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("--- ESTUDIANTES ---");
    Estudiante estudiante1 = new Estudiante("Jose", 23, 'M', "Teleco");
    estudiante1.imprimir();
    EstudianteNormal estudianteNormal1 = new EstudianteNormal("Maria", 18,'F', "Ciberseguridad");
    estudianteNormal1.imprimir();
    EstudianteTrabajador estudianteTrabajador1 = new EstudianteTrabajador("Andrea", 21, 'F', "Gastronomia", "Cocina");
    estudianteTrabajador1.imprimir();
    System.out.println("--- DOCENTES ---");
    Docente docente1 = new Docente("Arturo", 41, 'M', "PPO", "Ing. Inormatica");
    docente1.imprimir();
    Docente docente2 = new Docente("Mish", 128, 'X', "mishmish" );
    docente2.imprimir();
}
