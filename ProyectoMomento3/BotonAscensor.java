/* Esta clase es hija de la clase boton */
public class BotonAscensor extends Boton {

    private int pisoDestino;
    private Elevador elevador;

    public BotonAscensor(String idBoton, int pisoDestino, Elevador elevador){ /* Metodo constructor */
        super(idBoton); /* Ya que los constructores no se heredan, se usa el supero como puente */
        this.pisoDestino = pisoDestino;
        this.elevador = elevador;
    }

    @Override
    public void presionar(){ /* Metodo al presionar el boton del ascensor */
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
