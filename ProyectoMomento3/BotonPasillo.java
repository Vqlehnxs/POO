public class BotonPasillo extends Boton {
    
    private Direcciones direccion;
    private int numeroPiso;
    private interfazElevador controlador;

    public BotonPasillo(String idBoton, int numeroPiso, Direcciones direccion, interfazElevador controlador){
        super(idBoton);
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
        this.controlador = controlador;
    }

    @Override
    public void presionar(){
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
    public Direcciones getDireccion(){
        return direccion;
    }
}
