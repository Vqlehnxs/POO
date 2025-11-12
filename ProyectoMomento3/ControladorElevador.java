import java.util.*; /*Este import de manera sencilla contiene los otros paquetes para usar las listas, asi evitandome el uso del arrays o list (que tenia anteriormente)  */

public class ControladorElevador implements InterfazElevador { /*Se usa el implements ya que esta clase como tal usa metodos abstractos de la clase del interfazelevador */
    private List<Elevador> elevadores;
    private Queue<SolicitudSistema> solicitudesPendientes;

    public ControladorElevador(){ /* Metodo constructor */
        this.elevadores = new ArrayList<Elevador>();
        this.solicitudesPendientes = new LinkedList<>();
    }

    public void gestionSolicitudPiso(int numeroPiso, Direcciones direccion){ /* Metodo para gestionar la solicitud del piso */
        SolicitudSistema solicitud = new SolicitudSistema(numeroPiso, direccion, TiposSolicitud.PISO);
        solicitudesPendientes.add(solicitud);
        System.out.println("Solicitud de piso registrada: " + numeroPiso + " - " + direccion);
        procesarSiguienteSolicitud();
    }

   
    public void gestionSolicitudElevador(int pisoDestino){ /* Metodo para gestionar la solicitud del elevador */
        if (elevadores.size() > 0){
            Elevador elevador = elevadores.get(0);
            elevador.agregarDestino(pisoDestino);
            procesarMovimientoElevador(elevador);
        }
    }


    public void procesarSiguienteSolicitud(){ /* Metodo para procesar la siguiente solicitud */
        if (!solicitudesPendientes.isEmpty() && !elevadores.isEmpty()){
            SolicitudSistema solicitud = solicitudesPendientes.poll();
            Elevador mejorElevador = encontrarMejorElevador(solicitud);

            if (mejorElevador != null){
                mejorElevador.agregarDestino(solicitud.getNumeroPiso());
                procesarMovimientoElevador(mejorElevador);
            }

        }
    }


    public void agregarElevador(Elevador elevador){ /* Metodo para agregar un elevador */
        elevadores.add(elevador);
    }

    private Elevador encontrarMejorElevador(SolicitudSistema solicitud){ /*Metodo que ayuda a buscar entre los elevadores el mejor segun la solicitud */
        for (Elevador elevador : elevadores){
            if (!elevador.estaMovimiento()){
                return elevador;
            }
        }

        return elevadores.isEmpty() ? null : elevadores.get(0);
    }

    private void procesarMovimientoElevador(Elevador elevador){ /*Metodo como lo menciona el nombre procesa el movimiento que tiene el elevador */
        if(!elevador.getDestinos().isEmpty()){
            int siguientePiso = elevador.getDestinos().peek();
            elevador.moverAPiso(siguientePiso);
        }
    }
}
