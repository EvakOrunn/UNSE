/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import dominio.*;
import java.time.LocalDate;
import utilidad.Consola;

/**
 *
 * @author Luis Cruz
 * @version 1.0.0
 */
public class Biblioteca {

    public static void main(String[] args) {

        Libro libro1 = cargarPrimerLibro();
        Libro libro2 = cargarSegundoLibro();
        Libro libro3 = cargarTercerLibro();
        int op = 0;

        do {

            menuPrincipal();
            op = Consola.leerInt();

            switch (op) {                
                case 1://Solicita el prestamo de uno de los libros que se encuentran disponibles
                //de no encontrar el libro mostrara un mensaje de error y lo llevara al
                //menu anterior para un nuevo ingreso. El prestamo sera efectivo si
                //el libro seleccionado posee ejemplares disponibles, de no ser de estar forma
                //se le notificara al usuario de dicha situacion.
                    System.out.println("Seleccione un libro para solicitar el prestamo");
                    menuLibros();
                    int opLibro = Consola.leerInt();
                    prestarLibro(opLibro, libro1, libro2, libro3);
                    break;
                case 2://Muestra al usuario la lista de libros disponibles, luego se le solicita
                //el libro que desea devolver, siendo efectiva la operacion se vera reflejado
                //en la cantidad de ejemplares que fueron prestados y en los que se encuentran
                //disponibles. De no ser así se le mostrara al usuario un mensaje con el error
                //devolviendolo al menu para un nuevo ingreso
                    System.out.println("Seleccione el libro que desea devolver");
                    menuLibros();
                    int libSelec = Consola.leerInt();
                    devolucion(libSelec, libro1, libro2, libro3);
                    break;
                case 3://Se muestran todos los libros disponibles de la biblioteca
                    System.out.println(libro1.toString());
                    System.out.println(libro2.toString());
                    System.out.println(libro3.toString());
                    break;
                default:
                    break;
            }

        } while (op != 0);

    }
    
    /**
     * Menu principal del programa, muestra las opciones disponibles al que puede
     * acceder el usuario
     */
    public static void menuPrincipal() {
        System.out.println("------------------------------------");
        System.out.println("-         Menu de Opciones         -");
        System.out.println("------------------------------------");
        System.out.println("- 1)Solicitar Prestamo             -");
        System.out.println("- 2)Recibir Libro                  -");
        System.out.println("- 3)Listar Libros Disponibles      -");
        System.out.println("- 0)Cerrar Sesion                  -");
        System.out.println("------------------------------------");
        System.out.print("Operacion:");
    }
    
    /**
     * Menu de los libros disponibles para ser seleccionados por el usuario
     */
    public static void menuLibros() {
        System.out.println("---------------------------------------");
        System.out.println("-          Libros Disponibles         -");
        System.out.println("---------------------------------------");
        System.out.println("- 1)El Libro Negro                    -");
        System.out.println("- 2)Just for fun                      -");
        System.out.println("- 3)GNU Emacs Manual                  -");
        System.out.println("---------------------------------------");
        System.out.print("Libro:");
    }
    
    /**
     * Menu de una coleccion de Libros mas amplia de uso general.
     * Este ustiliza un Array de tipo Libro
     * @param coleccion de Libros
     */
    public static void menuLibro(Libro[] coleccion){
        System.out.println("---------------------------------------");
        System.out.println("-          Libros Disponibles         -");
        System.out.println("---------------------------------------");
        for(int i = 0 ; i < coleccion.length ; i++){
            Consola.emitirMensajeLN("  " + (i + 1) + ")" + coleccion[i].getTituloLibro());
        }
        System.out.println("---------------------------------------");
    }
    
    public static void prestarLibro(int selec, Libro lib1, Libro lib2, Libro lib3) {
        switch (selec) {
            case 1:
                if (lib1.pretamo()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-         Prestamo Realizado         -");
                    System.out.println("--------------------------------------");
                }
                break;
            case 2:
                if (lib2.pretamo()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-         Prestamo Realizado         -");
                    System.out.println("--------------------------------------");
                }
                break;
            case 3:
                if (lib3.pretamo()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-         Prestamo Realizado         -");
                    System.out.println("--------------------------------------");
                }
                break;
            default:
                System.out.println("Error:Libro no disponible");
                break;
        }
    }
    
    private static void devolucion(int select, Libro lib1, Libro lib2, Libro lib3){
        switch(select){
            case 1:
                if (lib1.devolucion()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-        Devolucion Realizada        -");
                    System.out.println("--------------------------------------");
                }
                break;
            case 2:
                if (lib2.pretamo()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-        Devolucion Realizada        -");
                    System.out.println("--------------------------------------");
                }
                break;
            case 3:
                if (lib3.pretamo()) {
                    System.out.println("--------------------------------------");
                    System.out.println("-        Devolucion Realizada        -");
                    System.out.println("--------------------------------------");
                }
                break;
            default:
                System.out.println("Error:Libro no disponible");
                break;
        }
    }

    public static Libro cargarPrimerLibro() {
        LocalDate date1 = LocalDate.of(1982, 7, 16);
        Autor autor1 = new Autor("Angel David", "Revilla", date1, "Venezolana");
        Libro ax = new Libro("El Libro Negro", autor1, 20, 0, 343);
        return ax;
    }

    public static Libro cargarSegundoLibro() {
        LocalDate date2 = LocalDate.of(1969, 12, 28);
        Autor autor2 = new Autor("Linus Benedict", "Torvals", date2, "Fines");
        Libro ax = new Libro("Just for fun", autor2, 57, 40, 2608);
        return ax;
    }

    public static Libro cargarTercerLibro() {
        LocalDate date3 = LocalDate.of(1953, 3, 16);
        Autor autor3 = new Autor("Richard Matthew", "Stallman", date3, "Estadounidence");
        Libro ax = new Libro("GNU Emacs Manual", autor3, 25, 4, 150);
        return ax;
    }

}
