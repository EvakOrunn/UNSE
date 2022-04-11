
package proyectosapo;

public class ProyectoSapo {

    public static void main(String[] args) {
        int op = 0;
        
        //Metodo do-while utlizado para la creacion de multiples sapos siempre
        //y cuando el usuario quiera seguir con la operacion
        do {            
            
            menu();
            op = Consola.leerInt();
            
            if (op == 1) {
                Sapo pepe = new Sapo();
                pepe.cargarInformacionSapo();
                pepe.mostrarInfo();
            }
            
        } while (op != 0);
    }
    
    /**
     * Metodo añadido para mostrar un menu con las opciones disponibles para el usuario
     */
    public static void menu(){
        Consola.emitirMensajeLN("------------------------------");
        Consola.emitirMensajeLN("          Menu Sapos          ");
        Consola.emitirMensajeLN("------------------------------");
        Consola.emitirMensajeLN("- 1)Crear Sapo               -");
        Consola.emitirMensajeLN("- 0)Cerrar                   -");
        Consola.emitirMensajeLN("------------------------------");
        Consola.emitirMensaje("Operacion:");
    }
    
}
