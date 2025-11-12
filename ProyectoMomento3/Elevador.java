import java.util.*;

public class Elevador {

    private int pisoActual;
    private Direcciones direccionActual;
    private Puerta puerta;
    private List<BotonAscensor> botones; /*Creacion de las listas de los elevadores */
    private Queue<Integer> destinos; /*Creacion de las listas de las solicitudes */
    private String id;
    private boolean enMovimiento;
    private int totalPisos;

    public Elevador(String id, int totalPisos){ /*Metodo constructor */
        this.id = id;
        this.totalPisos = totalPisos;
        this.pisoActual = 1;
        this.direccionActual = Direcciones.DETENIDO;
        this.puerta = new Puerta(id + "-Puerta");
        this.botones = new ArrayList<>();
        this.destinos = new LinkedList<>();
        this.enMovimiento = false;
        inicializarBotones();
    }

    public void moverAPiso(int pisoDestino){ /*Metodo encargado del elevador moverse al piso solicitado */
        if(pisoDestino < 1 || pisoDestino > totalPisos){
            System.out.println("Piso invalido: " + pisoDestino);
            return;
        }

        this.enMovimiento = true;
        this.direccionActual = (pisoDestino > pisoActual) ? Direcciones.SUBIENDO : Direcciones.BAJANDO;

        System.out.println("Elevador " + id + " " + direccionActual + " desde " + pisoActual + " hacia " + pisoDestino);

        while(pisoActual != pisoDestino){
            if (direccionActual == Direcciones.SUBIENDO){
                pisoActual++;
            } else {
                pisoActual--;
            }
            System.out.println("Elevador " + id + " en piso: " + pisoActual);
        }

        this.enMovimiento = false;
        this.direccionActual = Direcciones.DETENIDO;
        llegarAPiso();
    }

    public void agregarDestino(int piso){ /*Metodo que agrega el destino del elevador */
        if(!destinos.contains(piso)){
            destinos.add(piso);
            System.out.println("Destino agregado: piso " + piso);
            System.out.println("   - Cerrando puertas...");
            cerrarPuertas();

            if(!enMovimiento){
                procesarDestinos();
            }

        }
    }

    public void abrirPuertas(){ /*Metodo encargado de abrir las puertas */
        if(!enMovimiento){
            puerta.abrir();
        } else{
            System.out.println("No se pueden abrir la puertas en movimiento");
        }
    }

    public void cerrarPuertas(){ /*Metodo encargado de cerrar las puertas */
        puerta.cerrar();
    }

    public void llegarAPiso(){ /*Metodo cuando el elevador llega al piso */
        System.out.println("Elevador " + id + " llego al piso " + pisoActual);
        System.out.println("   - Abriendo puertas...");
        abrirPuertas();
        resetIluminacionBoton(pisoActual);
        destinos.remove(pisoActual);

        if(!destinos.isEmpty()){
            System.out.println(" -Procesando siguiente destino...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            procesarDestinos();
        }
    }

    public void procesarDestinos(){ /*Metodo encargado de procesar la solicitud de destino del elevador */
        if(!enMovimiento && !destinos.isEmpty()){
            int siguienteDestino = destinos.peek();
            moverAPiso(siguienteDestino);
        }
    }

    private void resetIluminacionBoton(int piso){ /*Metodo que resetea la iluminacion del boton */
        for(BotonAscensor boton : botones){
            if(boton.getPisoDestino() == piso){
                boton.reset();
            }
        }
    }

    private void inicializarBotones(){ /*Creador de los botones internos del elevador */
        for(int i = 1; i<= totalPisos; i++){
            botones.add(new BotonAscensor("B" + i, i, this));
        }
    }

    public int getPisoActual(){
        return pisoActual;
    }
    public Direcciones getDrireccionActual(){
        return direccionActual;
    }
    public boolean estaMovimiento(){
        return enMovimiento;
    }
    public List<BotonAscensor> getBotones(){
        return botones;
    }
    public Queue<Integer> getDestinos(){
        return destinos;
    }
}
