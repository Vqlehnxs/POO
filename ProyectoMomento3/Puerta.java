public class Puerta {

    private boolean abierta;
    private String idPuerta;

    public Puerta(String idPuerta){ /* Metodo constructor */
        this.idPuerta = idPuerta;
        this.abierta = false;
    }
    
    public void abrir(){ /*Metodo encargado de abrir la puerta */
        this.abierta = true;
        System.out.println("Puerta " + idPuerta + " ABIERTA");
    }

    public void cerrar(){ /*Metodo encargado de cerrar la puerta */
        this.abierta = false;
        System.out.println("Puerta " + idPuerta + " CERRADA");

    }

    public boolean estaAbierta(){
        return abierta;
    }
}
