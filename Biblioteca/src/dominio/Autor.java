/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;
import java.util.Objects;
import utilidad.Consola;

/**
 *
 * @author Luis Cruz
 */
public class Autor {
    
    private String nombreAutor;
    private String apellidoAutor;
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    /**
     * Constructor por defecto
     */
    public Autor() {
        this.nombreAutor = "";
        this.apellidoAutor = "";
        this.fechaNacimiento = null;
        this.nacionalidad = "";
    }

    /**
     * Solicita al usuario el ingreso de todos los datos de las variables miembro de la clase
     * @param nombreAutor
     * @param apellidoAutor
     * @param fechaNacimiento
     * @param nacionalidad 
     */
    public Autor(String nombreAutor, String apellidoAutor, LocalDate fechaNacimiento, String nacionalidad) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void cargarInformacionAutor(){
        cargarNombreAutor();
        cargarApellido();
        cargarFechaNacimiento();
        cargarNacionalidad();
    }
    
    private void cargarNombreAutor(){
        Consola.emitirMensaje("Nombre:");
        this.nombreAutor = Consola.leerString();
    }
    
    private void cargarApellido(){
        Consola.emitirMensaje("Apellido:");
        this.apellidoAutor = Consola.leerString();
    }
    
    private void cargarFechaNacimiento(){
        Consola.emitirMensaje("Año:");
        int añoAx = Consola.leerInt();
        Consola.emitirMensaje("Mes:");
        int mesAx = Consola.leerInt();
        Consola.emitirMensaje("Día:");
        int diaAx = Consola.leerInt();
        
        LocalDate fecha = LocalDate.of(añoAx, mesAx, diaAx);
        this.fechaNacimiento = fecha;
    }
    
    private void cargarNacionalidad(){
        Consola.emitirMensaje("Nacionalidad:");
        this.nacionalidad = Consola.leerString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombreAutor);
        hash = 97 * hash + Objects.hashCode(this.apellidoAutor);
        hash = 97 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 97 * hash + Objects.hashCode(this.nacionalidad);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombreAutor, other.nombreAutor)) {
            return false;
        }
        if (!Objects.equals(this.apellidoAutor, other.apellidoAutor)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

    /**
     * Muestra la informacion del autor en el siguiente formato:
     *      *Apellido y Nombre de Autor:Gerald Sussman
     *      *Nacionalidad:Estadounidense
     *      *Fecha de Nacimiento:1947/02/08
     * @return Informacion del Autor
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apellido y Nombre del Autor:").append(apellidoAutor).append(" ").append(nombreAutor).append("\n");
        sb.append("Fecha de Nacimiento:").append(fechaNacimiento.getYear()).append("/").append(fechaNacimiento.getMonth()).append("/").append(fechaNacimiento.getDayOfMonth()).append("\n");
        sb.append("Nacionalidad:").append(nacionalidad).append("\n");
        return sb.toString();
    }
    
}
