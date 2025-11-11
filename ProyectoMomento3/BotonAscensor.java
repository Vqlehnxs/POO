public class BotonAscensor extends Boton {

    private int pisoDestino;
    private Elevador elevador;

    public BotonAscensor(String idBoton, int pisoDestino, Elevador elevador){
        super(idBoton);
        this.pisoDestino = pisoDestino;
        this.elevador = elevador;
    }

    @Override
    public void presionar(){
        System.out.println("Boton del ascensor presionado - Destino: " + pisoDestino);
        setIlumiado(true);
        elevador.agregarDestino(pisoDestino);
    }

    @Override
    public void reset(){
        setIlumiado(false);
    }

    public int getPisoDestino(){
        return pisoDestino;
    }
    
}
