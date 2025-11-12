public interface InterfazElevador { /*Interface me permite usar como firma los metodos para poder usar en el controlador */
    void gestionSolicitudPiso(int numeroPiso, Direcciones direccion);
    void gestionSolicitudElevador(int pisoDestino);
    void procesarSiguienteSolicitud();
    void agregarElevador(Elevador elevador);
}
