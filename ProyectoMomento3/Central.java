import java.util.*;

public class Central {

    private List<Elevador> elevadores;
    private List<Piso> pisos;
    private InterfazElevador controlador;
    private final int TOTAL_PISOS = 10; /* Al usar Final, una vez inicializada, no puede cambiarse su valor */

    public Central() {
        this.controlador = new ControladorElevador();
        this.elevadores = new ArrayList<>();
        this.pisos = new ArrayList<>();
        inicializarSistema();
    }

    private void inicializarSistema() {
        Elevador elevador1 = new Elevador("F1", TOTAL_PISOS);
        controlador.agregarElevador(elevador1);
        elevadores.add(elevador1);

        for (int i = 1; i <= TOTAL_PISOS; i++) {
            pisos.add(new Piso(i, TOTAL_PISOS, controlador));
        }

        System.out.println("Sistema de elevador inicializado con " + TOTAL_PISOS + " pisos");
    }

    public void simular(){
        System.out.println("\n--- SIMULACION INICIADA ---");

        System.out.println("\n--- Primer escenario: Una persona en el piso 6 presiona subir el elevador ---");
        System.out.println("\n ");
        pisos.get(5).getBotonSubir().presionar();
        System.out.println("\n ");
        esperarMovimientoTerminado();

        System.out.println("\n--- Segundo escenario: Una vez dentro, la persona presiona ir al piso 2 ---");
        System.out.println("\n ");
        elevadores.get(0).getBotones().get(1).presionar();
        
        esperarMovimientoTerminado();
        System.out.println("Persona saliendo del elevador...");
        System.out.println("\n ");
        System.out.println("--- SIMULACION FINALIZADA ---");
    }

    private void esperarMovimientoTerminado() {
        // Esperar hasta que el ascensor termine de moverse
        while (elevadores.get(0).estaMovimiento()) {
            try {
                Thread.sleep(500); // Esperar medio segundo entre verificaciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Central sistema = new Central();
        sistema.simular();
    }
}
