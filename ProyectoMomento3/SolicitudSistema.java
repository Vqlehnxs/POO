public class SolicitudSistema {
    
    private int numeroPiso;
    private Direcciones direccion;
    private TiposDeSolicitud tipo;

    public SolicitudSistema(int numeroPiso, Direcciones direccion, TiposDeSolicitud tipo){
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

    public TiposDeSolicitud getTipo(){
        return tipo;
    }
}
