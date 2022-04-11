package cajaFuerte;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cajaFuerte {
    
    //Variables Miembros
    private int combinacion;
    private boolean estado;

    //Constructores
    public cajaFuerte(){
        this.combinacion = 453;
        this.estado = false;
    }
    
    public cajaFuerte(int combinacion) {
        this.combinacion = combinacion;
        this.estado = false;
    }
    
    
    //metodos
    
    /*[cambiarClave]
    Metodo para cambiar la clave actual
    por una nueva clave siempre que el
    usuario sea capas de poner la clave actual*/
    public void cambiarClave(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la clave actual ");
        int clave = teclado.nextInt();
        if(comprobarClave(clave)){
            System.out.print("Ingrese la nueva clave ");
            int nuevaClave = teclado.nextInt();
            if(!validarClave(nuevaClave)){
                System.out.println("Clave ingresada invalida");
            }else{
                this.setCombinacion(nuevaClave);
                System.out.println("Clave cambiada");
            }
        }else{
            System.out.println("Las clave no coinciden");
        }
    }
    
    /*[abrirCaja]
    Metodo para abrir la caja fuerte,
    la clave es porpocionada por el usuario
    si la clave es correcta la caja se abre*/
    public void abrirCaja(int clave){
        if(!this.isEstado()){
            if(this.comprobarClave(clave)){
                System.out.println("Caja fuerte abierta");
                this.setEstado(true);
            }else{
                System.out.println("Clave invalida");
            }
        }else{
            System.out.println("La caja fuerte esta abierta");
        }
    }
    
    /*[comprobarClave]
    este metodo comprueba una clave porpocionada
    por el usuario y la verifica con la clave actual*/
    private boolean comprobarClave(int clave){
        return clave == this.getCombinacion();
    }
    
    /*[validarClave]
    valida que una clave ingresada por el usuario este dentro
    del rango de valores*/
    private boolean validarClave(int clave){
        return (clave >= 100 || clave <= 999);
    }

    private int getCombinacion() {
        return combinacion;
    }

    private void setCombinacion(int combinacion) {
        this.combinacion = combinacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}
