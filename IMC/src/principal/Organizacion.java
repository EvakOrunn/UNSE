/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import dominio.*;

/**
 *
 * @author Luis Cruz
 */
public class Organizacion {
    
    public static void main(String[] args) {
        
        Persona per = new Persona("Daniel", 30, 'H', 78.4, 1.66);
        Persona per2 = new Persona("Sofia", 19, 'M', 62.7, 1.59);
        Persona per3 = new Persona("Xavi", 42, 'H', 70.8, 1.82);

        switch (per.calcularIMC()) {
            case -1:
                System.out.println(per.getNombre() + " tiene bajo peso");
                break;
            case 0:
                System.out.println(per.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                System.out.println(per.getNombre() + " posee sobrepeso");
                break;
            default:
                break;
        }

        switch (per2.calcularIMC()) {
            case -1:
                System.out.println(per2.getNombre() + " tiene bajo peso");
                break;
            case 0:
                System.out.println(per2.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                System.out.println(per2.getNombre() + " posee sobrepeso");
                break;
            default:
                break;
        }

        switch (per3.calcularIMC()) {
            case -1:
                System.out.println(per3.getNombre() + " tiene bajo peso");
                break;
            case 0:
                System.out.println(per3.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                System.out.println(per3.getNombre() + " posee sobrepeso");
                break;
            default:
                break;
        }

        System.out.println("\n");

        if (per.esMayorDeEdad()) {
            System.out.println(per.getNombre() + " es mayor de edad");
        } else {
            System.out.println(per.getNombre() + " no es mayor de edad");
        }

        if (per2.esMayorDeEdad()) {
            System.out.println(per2.getNombre() + " es mayor de edad");
        } else {
            System.out.println(per2.getNombre() + " no es mayor de edad");
        }

        if (per3.esMayorDeEdad()) {
            System.out.println(per3.getNombre() + " es mayor de edad");
        } else {
            System.out.println(per3.getNombre() + " no es mayor de edad");
        }
        
        System.out.println("\n");

        System.out.println(per.toString());
        System.out.println(per2.toString());
        System.out.println(per3.toString());

    }
    
}
