import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ControladorElevador implements InterfazElevador {
    private List<Elevador> elevadores;
    private Queue<SolicitudSistema> solicitudesPendientes;

    public ControladorElevador(){
        this.elevadores = new ArrayList<Elevador>();
        this.solicitudesPendientes = new LinkedList<>();
    }

    public void gestionSolicitudPiso(int numeroPiso, Direcciones direccion){
        SolicitudSistema solicitud = new SolicitudSistema(numeroPiso, direccion, TiposSolicitud.PISO);
        solicitudesPendientes.add(solicitud);
        System.out.println("Solicitud de piso registrada: " + numeroPiso + " - " + direccion);
        procesarSiguienteSolicitud();
    }

   
    public void gestionSolicitudElevador(int pisoDestino){
        if (elevadores.size() > 0){
            Elevador elevador = elevadores.get(0);
            elevador.agregarDestino(pisoDestino);
            procesarMovimientoElevador(elevador);
        }
    }


    public void procesarSiguienteSolicitud(){
        if (!solicitudesPendientes.isEmpty() && !elevadores.isEmpty()){
            SolicitudSistema solicitud = solicitudesPendientes.poll();
            Elevador mejorElevador = encontrarMejorElevador(solicitud);

            if (mejorElevador != null){
                mejorElevador.agregarDestino(solicitud.getNumeroPiso());
                procesarMovimientoElevador(mejorElevador);
            }

        }
    }


    public void agregarElevador(Elevador elevador){
        elevadores.add(elevador);
    }

    private Elevador encontrarMejorElevador(SolicitudSistema solicitud){
        for (Elevador elevador : elevadores){
            if (!elevador.estaMovimiento()){
                return elevador;
            }
        }

        return elevadores.isEmpty() ? null : elevadores.get(0);
    }

    private void procesarMovimientoElevador(Elevador elevador){
        if(!elevador.getDestinos().isEmpty()){
            int siguientePiso = elevador.getDestinos().peek();
            elevador.moverAPiso(siguientePiso);
        }
    }
}
