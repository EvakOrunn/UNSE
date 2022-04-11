/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import cajaFuerte.cajaFuerte;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        cajaFuerte caja1 = new cajaFuerte(345);
        cajaFuerte caja2 = new cajaFuerte();
        
        caja1.abrirCaja(245);
        caja1.abrirCaja(345);
        caja1.abrirCaja(345);
        caja2.cambiarClave();
    }
}
