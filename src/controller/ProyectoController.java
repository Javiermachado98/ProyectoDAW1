package controller;

import dao.ProyectoDAO;
import model.Proyecto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProyectoController {

    private final ProyectoDAO dao = new ProyectoDAO();

    public void anadirProyecto() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Alta de Proyecto ===");

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();

            System.out.print("Fecha de presentación (yyyy-MM-dd): ");
            String fechaTexto = sc.nextLine();
            LocalDate fechaPresentacion = LocalDate.parse(fechaTexto, DateTimeFormatter.ISO_LOCAL_DATE);

            System.out.print("Tecnologias ");
            String tecnologia = sc.nextLine();

            System.out.print("Puntuación: ");
            String puntuacion = sc.nextLine();

            System.out.print("Comentario: ");
            String comentario = sc.nextLine();

            System.out.print("ID del jurado: ");
            int idJurado = sc.nextInt();

            System.out.print("Código del equipo: ");
            int codigoEquipo = sc.nextInt();

            // Crear el proyecto (sin ID, ya que este lo puse como PK autoincrement)
            Proyecto myproyecto = new Proyecto(titulo, descripcion, fechaPresentacion, tecnologia, puntuacion, comentario, idJurado, codigoEquipo);

            dao.createProyecto(myproyecto);

            System.out.println("Se ha agregado tu proyecto a la base de datos.");
        } catch (Exception e) {
            System.err.println("No se ha podido agregar tu proyecto a la base de datos: " + e.getMessage());
        } finally {
            sc.close();
            dao.close();
        }
    }
}
