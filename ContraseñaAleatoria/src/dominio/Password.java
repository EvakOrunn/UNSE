package dominio;

import java.util.Random;

/**
 * @author Luis Cruz
 * @version 1.0.0
 */
public class Password {

    private int longitud;
    private String contraseña;

    /**
     * Constructor por defecto. Pone la longitud a 0 y la cadena vacía.
     */
    public Password() {
        longitud = 8;
        contraseña = "";
    }

    /**
     * Se construye una cadena aleatoria con la longitud dada.
     *
     * @param longitud Longitud de la cadena.
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = this.generarPassword();
    }

    /**
     * Este constructor se utilizará cuando queramos asignar una contraseña
     * determinada. No generada aleatoriamente.
     *
     * @param contrasena
     */
    public Password(String contrasena) {
        this.longitud = contrasena.length();
        this.contraseña = contrasena;
    }

    /**
     * Setter para establecer el atributo longitud.
     *
     * @param longitud Valor entero que indicará la longitud de la contraseña.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        // Debería truncar la contraseña
    }

    public int getLongitud() {

        return longitud;
    }

    /**
     * Getter del atributo contrasena.
     *
     * @return La constraseña.
     */
    public String getContrasena() {
        return contraseña;
    }

    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
    }

    /**
     *
     */
    private boolean esFuerte(String password) {
        int contMayusculas = 0, contMinusculas = 0, contNumeros = 0;
        boolean validez = false;

        for (int i = 0; i < password.length(); i++) {

            if (!Character.isDigit(password.charAt(i))) {
                contNumeros++;
            } else {
                if (Character.isUpperCase(password.charAt(i))) {
                    contMayusculas++;
                } else {
                    if (Character.isLowerCase(password.charAt(i))) {
                        contMinusculas++;
                    }
                }
            }
        }

        if (contNumeros >= 5 && contMayusculas >= 2 && contMinusculas >= 1) {
            validez = true;
        }

        return validez;
    }

    /**
     * Genear una contraseña aleatoria con la longitud indicada por el atributo
     * del objeto.
     *
     * @return String Contraseña generada.
     */
    public String generarPassword() {
        // Para resolver este método utilizamos un array con todos los posibles
        // caracteres que puede tener una contraseña. Posteriormente generaremos
        // números aleatorios entre 0 y la longitud de este array.
        //
        // El carácter asociado a cada posición generada aleatoriamente se irá
        // concatenando a una cadena, inicialmente vacía, que al final del método
        // contendrá la contraseña generada aleatoriamente.

        // Array de posibles caracteres que contendrá la contraseña generada
        final char[] caracteres
                = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                    'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'l', 'k', 'm',
                    'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                    '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        // Esta cadena guardará al final del método la contraseña generada aleatoriamente
        String temporal = "";

        do {
            Random aleatorio = new Random();

            // Iteramos tantas veces como longitud de caracteres debe tener la contraseña
            for (int i = 0; i < this.longitud; i++) {
                // En cada iteracción a la cadena temporal le asignamos el carácter
                // asociado a la posición (generada aleatoriamente) del array caracteres
                temporal += caracteres[aleatorio.nextInt(caracteres.length)];
            }
        } while (esFuerte(temporal));
        
        return temporal;
    }

    @Override
    /**
     * Imprime el estado de un objeto password en un momento determinado.
     */
    public String toString() {
        return "Longitud: " + this.longitud + " Password: " + this.contraseña;
    }
}
