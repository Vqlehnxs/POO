public class SolicitudSistema {
    
    private int numeroPiso;
    private Direcciones direccion; /*Necesita procesar en que direccion se solicita el elevador */
    private TiposSolicitud tipo; /* Procesa que tipo de boton es el que esta mandando la solicitud, si es el del pasillo o del elevador */

    public SolicitudSistema(int numeroPiso, Direcciones direccion, TiposSolicitud tipo){ /* Metodo constructor */
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
        this.tipo = tipo;
    }
    /*Aca estan los gets */
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
