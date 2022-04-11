/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Objects;
import utilidad.Consola;

/**
 *
 * @author Luis Cruz
 */
public class Libro {

    //Variables Miembro de la clase
    private String tituloLibro;
    private Autor autor;
    private int cantidadEjemplares;
    private int ejemplaresPrestados;
    private int codigoLibro;

    /**
     * Constructor por defecto Este constructor inicializa las variables miembro
     * en un valor por defecto
     */
    public Libro() {
        this.tituloLibro = "";
        this.autor = null;
        this.cantidadEjemplares = 0;
        this.ejemplaresPrestados = 0;
        this.codigoLibro = 0;
    }

    /**
     * Constructor con parametros Solicita al usuario el ingreso de los datos de
     * todas las varibles miembro
     *
     * @param tituloLibro
     * @param autor
     * @param cantidadEjemplares
     * @param ejemplaresPrestados
     * @param codigoLibro
     */
    public Libro(String tituloLibro, Autor autor, int cantidadEjemplares, int ejemplaresPrestados, int codigoLibro) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.codigoLibro = codigoLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void cargarInformacionLibro() {
        cargarTituloLibro();
        cargarAutor();
        cargarCantidadEjemplares();
        cargarEjemplaresPrestados();
        cargarCodigoLibro();
    }

    private void cargarTituloLibro() {
        Consola.emitirMensaje("Titulo del Libro:");
        this.tituloLibro = Consola.leerString();
    }

    private void cargarAutor() {
        Autor autorAx = new Autor();
        autor.cargarInformacionAutor();
        this.autor = autorAx;
    }

    private void cargarCantidadEjemplares() {
        int cant = 0;

        do {
            Consola.emitirMensaje("Cantidad de Ejemplares:");
            cant = Consola.leerInt();

            if (cant > -1) {
                Consola.emitirMensaje("Valor invalido... vuelva a ingresar");
            }

        } while (cant > -1);
    }

    private void cargarEjemplaresPrestados() {
        Consola.emitirMensaje("El libro tiene ejemplares prestados:");
        boolean valido = Consola.confirmar();

        if (valido) {
            Consola.emitirMensaje("Ejemplares Prestados:");
            this.ejemplaresPrestados = Consola.leerInt();
        }
    }

    private void cargarCodigoLibro() {
        Consola.emitirMensaje("Codigo de Libro:");
        this.codigoLibro = Consola.leerInt();
    }

    public boolean pretamo() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            ejemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares++;
            ejemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.tituloLibro);
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + this.cantidadEjemplares;
        hash = 79 * hash + this.ejemplaresPrestados;
        hash = 79 * hash + this.codigoLibro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.cantidadEjemplares != other.cantidadEjemplares) {
            return false;
        }
        if (this.ejemplaresPrestados != other.ejemplaresPrestados) {
            return false;
        }
        if (this.codigoLibro != other.codigoLibro) {
            return false;
        }
        if (!Objects.equals(this.tituloLibro, other.tituloLibro)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    /**
     * El metodo regresa los datos de la clase en el siguiente formato *Codigo
     * de Libro:343 *Titulo del Libro:Structure and Interpretation of Computer
     * Programs *Apellido y Nombre de Autor:Gerald Sussman
     * *Nacionalidad:Estadounidense *Fecha de Nacimiento:1947/02/08 *Cantidad de
     * Ejemplares: 15 ¨*Ejemplares Prestados: 3
     *
     * @return Informacion de la clase Libro
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo de Libro:").append(codigoLibro).append("\n");
        sb.append("Titulo del Libro:").append(tituloLibro).append("\n");
        sb.append(autor.toString());
        sb.append("Ejemplares Totales:").append(cantidadEjemplares).append("\n");
        sb.append("Ejemplares Prestados:").append(ejemplaresPrestados).append("\n");
        return sb.toString();
    }

}
