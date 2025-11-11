public interface InterfazElevador {
    void gestionSolicitudPiso(int numeroPiso, Direcciones direccion);
    void gestionSolicitudElevador(int pisoDestino);
    void procesarSiguienteSolicitud();
    void agergarElevador(Elevador elevador);
}
