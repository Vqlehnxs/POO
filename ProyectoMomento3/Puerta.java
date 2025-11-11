public class Puerta {

    private boolean abierta;
    private String idPuerta;

    public Puerta(String idPuerta){
        this.idPuerta = idPuerta;
        this.abierta = false;
    }
    
    public void abrir(){
        this.abierta = true;
        System.out.println("Puerta " + idPuerta + " ABIERTA");
    }

    public void cerrar(){
        this.abierta = false;
        System.out.println("Puerta " + idPuerta + " CERRADA");

    }

    public boolean estaAbierta(){
        return abierta;
    }
}
