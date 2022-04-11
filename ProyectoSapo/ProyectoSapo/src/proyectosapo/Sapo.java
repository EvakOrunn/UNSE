package proyectosapo;

public class Sapo {

    private char color;
    private boolean venenoso;
    private boolean conHambre;

    public Sapo() {
        color = 'v';
        venenoso = false;
        conHambre = false;
    }

    public Sapo(char color, boolean venenoso, boolean conHambre) {
        setColor(color);
        setVenenoso(venenoso);
        setConHambre(conHambre);
    }

    public Sapo(String mensaje) {
        this(); // DEBE SER PRIMERA SENTENCIA DEL METODO!!!
        Consola.emitirMensajeLN(mensaje);
    }

    public String getColor() {
        if (color == 'v') {
            return "verde";
        } else {
            return "rojo";
        }
    }

    public void setColor(char color) {
        this.color = color;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public String getVenenoso() {
        if (venenoso) {
            return "venenoso";
        } else {
            return "no venenoso";
        }
    }

    private void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean isConHambre() {
        return conHambre;
    }

    public String getConHambre() {
        if (conHambre) {
            return "hambriento";
        } else {
            return "sin hambre";
        }
    }

    private void setConHambre(boolean conHambre) {
        this.conHambre = conHambre;
    }

    /**
     * Metodo para cargar la informacion de la clase sapo
     */
    public void cargarInformacionSapo() {
        cargarColor();
        cargarVeneno();
        cargarHambre();
    }

    public void saltar() {
        Consola.emitirMensajeLN("Cuantas veces quiere que salte?...");
        int a = Consola.leerInt();
        saltar(a);
    }

    private void saltar(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("salta");
        }
    }

    public void comer() {
        if (conHambre) {
            System.out.println("yendo a comer");
            System.out.println("ñama ñama mmmmm");
            conHambre = false;
        } else {
            System.out.println("no tengo hambre");
        }

    }

    public void mostrarInfo() {
        Consola.emitirMensajeLN("Información del sapo:");
        Consola.emitirMensajeLN(toString());
    }
    
    /**
     * Metodo privado para el ingreso del color del sapo
     */
    private void cargarColor(){
        Consola.emitirMensaje("Color:");
        this.color = Consola.leerChar();
    }
    
    /**
     * Metodo que define si el sapo es venenoso o no
     */
    private void cargarVeneno(){
        Consola.emitirMensaje("¿Es venenoso?:");
        boolean estdo = Consola.confirmar();
        this.venenoso = estdo;
    }
    
    /**
     * Este metodo define si el sapo esta con hambre
     */
    private void cargarHambre(){
        Consola.emitirMensaje("¿Tiene Hambre?:");
        boolean hambre = Consola.confirmar();
        this.conHambre = hambre;
    }
    
    @Override
    public String toString() {
        return getColor() + " - " + getConHambre() + " - " + getVenenoso();
    }

    public boolean equal(Object x) {
        if (!(x instanceof Sapo)) {
            return false;
        }
        Sapo verifSapo = (Sapo) x;
        return (verifSapo.conHambre == conHambre
                && verifSapo.venenoso == venenoso && verifSapo.color == color);
    }
}
