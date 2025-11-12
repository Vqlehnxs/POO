/*Esta clase es hija de la clase boton */
public class BotonPasillo extends Boton {
    
    private Direcciones direccion; /*Aca utilizamos las enumeraciones de las direcciones (Ya que deben saber en que direccion se esta llamando el elevador) */
    private int numeroPiso;
    private InterfazElevador controlador;

    public BotonPasillo(String idBoton, int numeroPiso, Direcciones direccion, InterfazElevador controlador){ /* Metodo constructor */
        super(idBoton); /* Ya que los constructores no se heredan, se usa el supero como puente */
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
        this.controlador = controlador;
    }

    @Override
    public void presionar(){ /* Metodo al presionar el boton del pasillo */
        System.out.println("Boton pasillo presionado - Piso: " + numeroPiso + " - Direccion: " + direccion);
        setIlumiado(true);
        controlador.gestionSolicitudPiso(numeroPiso, direccion);
    }

    @Override
    public void reset(){
        setIlumiado(false);
    }

    public int getNumeroPiso(){
        return numeroPiso;
    }
    public Direcciones getDireccion(){ /*Este metodo lo resalto, ya que aqui tomamos la direccion la cual se esta solicitando el elevador */
        return direccion;
    }
}
