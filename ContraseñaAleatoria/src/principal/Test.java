/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import dominio.Password;

/**
 *
 * @author Luis Cruz
 */
public class Test {
    
    public static void main(String[] args) {
        
        Password pass = new Password();
        
        pass.generarPassword();
        System.out.println("pass = " + pass);
        
        Password pass2 = new Password(8);
        System.out.println("pass2 = " + pass2);
        
        Password pass3 = new Password(12);
        System.out.println("pass3 = " + pass3);
        
        
    }
    
}
