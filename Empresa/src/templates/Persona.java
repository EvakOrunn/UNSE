package templates;

import java.time.LocalDate;
import java.util.Objects;
import utilidad.Consola;

/**
 *
 * @author Luis Cruz
 * @version 1.0.0
 */
public class Persona {
    
    private int dni;
    private String apellido;
    private String nombre;
    private String nacionalidad;
    private String direccion;
    private LocalDate fechaNacimiento;
    private char sexo;

    public Persona() {
        this.dni = 0;
        this.apellido = "";
        this.nombre = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.fechaNacimiento = null;
        this.sexo = ' ';
    }

    public Persona(int dni, String apellido, String nombre, String nacionalidad, String direccion, LocalDate fechaNacimiento, char sexo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void cargarInformacionPersona(){
        cargarDni();
        cargarApellido();
        cargarNombre();
        cargarNacionalidad();
        cargarDireccion();
        cargarFechaNacimiento();
        cargarSexo();
    }
    
    private void cargarDni(){
        Consola.emitirMensaje("DNI:");
        this.dni = Consola.leerInt();
    }
    
    private void cargarNombre(){
        Consola.emitirMensaje("Nombre:");
        this.nombre = Consola.leerString();
    }
    
    private void cargarApellido(){
        Consola.emitirMensaje("Apellido:");
        this.apellido = Consola.leerString();
    }
    
    private void cargarNacionalidad(){
        Consola.emitirMensaje("Nacionalidad:");
        this.nacionalidad = Consola.leerString();
    }
    
    private void cargarDireccion(){
        Consola.emitirMensaje("Domicilio:");
        this.direccion = Consola.leerString();
    }
    
    private void cargarFechaNacimiento(){
        Consola.emitirMensajeLN("\tFecha de Nacimiento");
        Consola.emitirMensaje("Día:");
        int diaF = Consola.leerInt();
        Consola.emitirMensaje("Mes:");
        int mesF = Consola.leerInt();
        Consola.emitirMensaje("Año:");
        int añoF = Consola.leerInt();
        
        LocalDate fecha = LocalDate.of(añoF, mesF, diaF);
        this.fechaNacimiento = fecha;
    }
    
    private void cargarSexo(){
        char ax = 'a';
        
        do {            
            Consola.emitirMensaje("Sexo (H-M):");
            ax = Consola.leerChar();
            
            if (!(Character.compare(ax, 'H') == 0 || Character.compare(ax, 'M') == 0)) {
                Consola.emitirMensajeLN("Valor invalido... vuelva a ingresar");
            }
        } while (Character.compare(ax, 'H') == 0 || Character.compare(ax, 'M') == 0);
        
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.dni;
        hash = 19 * hash + Objects.hashCode(this.apellido);
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.nacionalidad);
        hash = 19 * hash + Objects.hashCode(this.direccion);
        hash = 19 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 19 * hash + this.sexo;
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
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI:").append(dni).append("\n");
        sb.append("Apellido y Nombre:").append(apellido).append(" ").append(nombre).append("\n");
        sb.append("Nacionalidad:").append(nacionalidad).append("\n");
        sb.append("Domicilio:").append(direccion).append("\n");
        sb.append("Fecha de Nacimiento:").append(fechaNacimiento.getDayOfMonth()).append("/").append(fechaNacimiento.getMonth()).append("/").append(fechaNacimiento.getYear()).append("\n");
        sb.append("Sexo:").append(sexo).append("\n");
        return sb.toString();
    }
    
}
