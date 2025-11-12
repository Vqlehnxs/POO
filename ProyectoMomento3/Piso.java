public class Piso {
    private int numeroPiso;
    private BotonPasillo botonSubir;
    private BotonPasillo botonBajar;
    private InterfazElevador controlador;
    
    public Piso(int numeroPiso, int totalPisos, InterfazElevador controlador){ /* Metodo constructor */
        this.numeroPiso = numeroPiso;
        this.controlador = controlador;
        inicializarBotones(totalPisos);
    }

    private void inicializarBotones(int totalPisos){ /*metodo que inicializa los botones, es decir, resuelve si sube o baja */
        if(numeroPiso < totalPisos){
            this.botonSubir = new BotonPasillo("SUBIR - " + numeroPiso, numeroPiso, Direcciones.SUBIENDO, controlador);
        }
        if(numeroPiso > 1){
            this.botonBajar = new BotonPasillo("BAJAR - " + numeroPiso, numeroPiso, Direcciones.BAJANDO, controlador);
        }
    }

    public BotonPasillo getBotonSubir(){
        return botonSubir;
    }

    public BotonPasillo getBotonBajar(){
        return botonBajar;
    }

    public int getNumeroPiso(){
        return numeroPiso;
    }
}
