import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {

    public static final int OPCION_ALTA_PARTICIPANTE = 1;
    public static final int OPCION_MODIFICAR_PARTICIPANTE = 2;
    public static final int OPCION_ELIMINAR_PARTICIPANTE = 3;
    public static final int OPCION_ALTA_EQUIPOS = 4;
    public static final int OPCION_MODIFICAR_EQUIPOS = 5;
    public static final int OPCION_ELIMINAR_EQUIPOS = 6;
    public static final int OPCION_ALTA_PROYECTOS = 7;
    public static final int OPCION_MODIFICAR_PROYECTOS = 8;
    public static final int OPCION_ELIMINAR_PROYECTOS = 9;
    public static final int OPCION_ALTA_JURADO = 10;
    public static final int OPCION_MODIFICAR_JURADO = 11;
    public static final int OPCION_ELIMINAR_JURADO = 12;
    public static final int OPCION_EVALUACION_PROYECTO = 13;
    public static final int OPCION_ESTADISTICAS = 14;
    public static final int OPCION_SALIR = 15;


    /**
     * M�todo que muestra el men� del programa.
     */
    public static void mostrarMenu() {
        System.out.println("==============================================");
        System.out.println("     PROYECTO FINAL ");
        System.out.println("==============================================");
        System.out.println("   1.-  Añandir participante");
        System.out.println("   2.-  Eliminar participante");
        System.out.println("   3.-  Modificar participante");
        System.out.println("   4.-  Añandir equipos");
        System.out.println("   5.-  Eliminar equipos");
        System.out.println("   6.-  Modificar equipos");
        System.out.println("   7.-  Añandir proyectos");
        System.out.println("   8.-  Eliminar proyectos");
        System.out.println("   9.-  Modificar proyectos");
        System.out.println("   10.-  Añandir jurado");
        System.out.println("   11.-  Eliminar jurado");
        System.out.println("   12.-  Modificar jurado");
        System.out.println("   13.-  Evaluacion proyecto");
        System.out.println("   14.-  Estadisticas");
        System.out.println("==============================================");
        System.out.print("  Introduce una opci�n: ");
    }

    public static void main(String[] args) {
        Scanner sc;
        int opcion;

        do {
            // Mostrar el men�
            mostrarMenu();

            // Obtener la opci�n seleccionada por el usuario
            sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {
                case OPCION_ALTA_PARTICIPANTE -> {
                }
                case OPCION_MODIFICAR_PARTICIPANTE -> {
                }
                case OPCION_ELIMINAR_PARTICIPANTE -> {
                }
                case OPCION_ALTA_EQUIPOS -> {
                }
                case OPCION_MODIFICAR_EQUIPOS -> {
                }
                case OPCION_ELIMINAR_EQUIPOS -> {
                }
                case OPCION_ALTA_PROYECTOS -> {
                }
                case OPCION_MODIFICAR_PROYECTOS -> {
                }
                case OPCION_ELIMINAR_PROYECTOS -> {
                }
                case OPCION_ALTA_JURADO -> {
                }
                case OPCION_MODIFICAR_JURADO -> {
                }
                case OPCION_ELIMINAR_JURADO -> {
                }
                case OPCION_EVALUACION_PROYECTO -> {
                }
                case OPCION_ESTADISTICAS -> {
                }
                case OPCION_SALIR -> {
                    System.out.println("Fin del programa.");
                }
                default -> {
                    System.out.println("Introduce una opciÓn válida");
                }
            }

        } while (opcion != OPCION_SALIR);

    }


}