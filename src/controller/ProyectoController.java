package controller;

import dao.ProyectoDAO;

import java.util.Scanner;

public class ProyectoController {

    private final ProyectoDAO dao = new ProyectoDAO();

    public void anadirProyecto(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el titulo del proyecto: ");
        String titulo = sc.nextLine();

        System.out.println("Ingrese descripcion del proyecto: ");
        String descripcion = sc.nextLine();

        System.out.println("Ingrese la fecha de presentacion: ");

        System.out.println("Precio: ");
        double precio = sc.nextDouble();


        //Viaje myviaje = new Viaje(destino, agencia, duracion, precio);
        //dao.guardar(myviaje);
        //System.out.println("Viaje insertado en BBDD");

    }
}
