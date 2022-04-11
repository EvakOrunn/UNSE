/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Luis Cruz
 */
public class Empresa {
    
    private int codigoEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private LocalDate fechaInauguracion;

    public Empresa() {
        this.codigoEmpresa = 0;
        this.nombreEmpresa = "";
        this.direccionEmpresa = "";
        this.fechaInauguracion = null;
    }

    public Empresa(int codigoEmpresa, String nombreEmpresa, String direccionEmpresa, LocalDate fechaInauguracion) {
        this.codigoEmpresa = codigoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.fechaInauguracion = fechaInauguracion;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public LocalDate getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(LocalDate fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.codigoEmpresa;
        hash = 29 * hash + Objects.hashCode(this.nombreEmpresa);
        hash = 29 * hash + Objects.hashCode(this.direccionEmpresa);
        hash = 29 * hash + Objects.hashCode(this.fechaInauguracion);
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
        final Empresa other = (Empresa) obj;
        if (this.codigoEmpresa != other.codigoEmpresa) {
            return false;
        }
        if (!Objects.equals(this.nombreEmpresa, other.nombreEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.direccionEmpresa, other.direccionEmpresa)) {
            return false;
        }
        return Objects.equals(this.fechaInauguracion, other.fechaInauguracion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("codigoEmpresa=").append(codigoEmpresa);
        sb.append(", nombreEmpresa=").append(nombreEmpresa);
        sb.append(", direccionEmpresa=").append(direccionEmpresa);
        sb.append(", fechaInauguracion=").append(fechaInauguracion);
        sb.append('}');
        return sb.toString();
    }
    
}
