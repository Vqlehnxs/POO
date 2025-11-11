public class SolicitudSistema {
    
    private int numeroPiso;
    private Direcciones direccion;
    private TiposSolicitud tipo;

    public SolicitudSistema(int numeroPiso, Direcciones direccion, TiposSolicitud tipo){
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public int getNumeroPiso(){
        return numeroPiso;
    }

    public Direcciones getDirecciones(){
        return direccion;
    }

    public TiposSolicitud getTipo(){
        return tipo;
    }
}
