import java.util.*;

public class Elevador {

    private int pisoActual;
    private Direcciones direccionActual;
    private Puerta puerta;
    private List<BotonAscensor> botones;
    private Queue<Integer> destinos;
    private String id;
    private boolean enMovimiento;
    private int totalPisos;

    public Elevador(String id, int totalPisos){
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

    public void moverAPiso(int pisoDestino){
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

    public void agregarDestino(int piso){
        if(!destinos.contains(piso)){
            destinos.add(piso);
            System.out.println("Destino agregado: piso " + piso);
        }
    }

    public void abrirPuertas(){
        if(!enMovimiento){
            puerta.abrir();
        } else{
            System.out.println("No se pueden abrir la puertas en movimiento");
        }
    }

    public void cerrarPuertas(){
        puerta.cerrar();
    }

    public void llegarAPiso(){
        System.out.println("Elevador " + id + " llego al piso " + pisoActual);
        abrirPuertas();
        resetIluminacionBoton(pisoActual);
        destinos.remove(pisoActual);
    }

    private void resetIluminacionBoton(int piso){
        for(BotonAscensor boton : botones){
            if(boton.getPisoDestino() == piso){
                boton.reset();
            }
        }
    }

    private void inicializarBotones(){
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
