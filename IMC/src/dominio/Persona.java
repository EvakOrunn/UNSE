/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Luis Cruz
 * @version 1.0.0
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
        this.peso = 0;
        this.altura = 0;
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni() {
        this.dni = generarDNI();
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularIMC(){
        double imc = (peso / Math.pow(altura, 2));
        int value = -1;
        
        if (imc < 18.5) {
            value = -1;
        } else {
            if (imc > 18.5 && imc < 24.9) {
                value = 0;
            } else {
                if (imc >= 25) {
                    value = 1;
                }
            }
        }
        
        return value;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
    private void comprobarSexo(char sexo){
        if (!(Character.compare(sexo, 'H') == 0 || Character.compare(sexo, 'M') == 0)) {
            this.sexo = 'H';
        }
    }
    
    private int generarDNI(){
        return (int) (Math.random()*(99999999 - 0)) + 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:").append(nombre).append("\n");
        sb.append("Edad:").append(edad).append("\n");
        sb.append("DNI:").append(dni).append("\n");
        sb.append("Sexo:").append(sexo).append("\n");
        sb.append("Peso:").append(peso).append("\n");
        sb.append("Altura:").append(altura).append("\n");
        return sb.toString();
    }
    
}
