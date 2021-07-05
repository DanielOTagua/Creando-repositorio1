package RocaPapelTijera;

public class ElJuego extends GameItem {

    //atributos
    private Jugador jugador;
    private Computadora computadora;
    private ELECCION jugadorEleccion;
    private ELECCION computadoraEleccion;
    private RESULTADO resultado;
    private static int gano;
    private static int perdio;
    private static int empato;

    public ElJuego() {
        super();
        jugador = new Jugador();
        computadora = new Computadora();
    }

    //realizo un metodo para jugar
    public void jugar() {
        //inicializo los jugadores
        jugadorEleccion = jugador.getEleccion();
        computadoraEleccion = computadora.getEleccion();
        resultado = getResultado();
        juegoResultado();
        tablaResultado();

    }

   

    //metodo para colectar los resultados generales
    private void tablaResultado() {
        if (resultado == RESULTADO.GANADOR) {
            gano++;
        } else {
            if (resultado == RESULTADO.PERDEDOR) {
                perdio++;
            } else {
                empato++;
            }
        }
    }

    //creo un metodo privado  para mostra los resultado del juego
    public void juegoResultado() {
        switch (resultado) {
            case GANADOR:
                System.out.println(jugadorEleccion + " vence  " + computadoraEleccion + ".El jugador GANO!!!! ");
                break;
            case PERDEDOR:
                System.out.println(jugadorEleccion + " pierde " + computadoraEleccion + " .Computadora Gano!!!");
                break;
            case EMPATE:
                System.out.println(jugadorEleccion + " empate " + computadoraEleccion + ". Empataron ");
                break;
        }

    }

    //creo un metodo prvado ya que no se vera en las demas clasespara saber la eleccion y quiern gana o pierde
    private RESULTADO getResultado() {
        if (jugadorEleccion == computadoraEleccion) {
            return RESULTADO.EMPATE;
        }
        switch (jugadorEleccion) {
            case ROCA:
                return (computadoraEleccion == ELECCION.TIJERA ? RESULTADO.GANADOR : RESULTADO.PERDEDOR);
            case PAPEL:
                return (computadoraEleccion == ELECCION.ROCA ? RESULTADO.GANADOR : RESULTADO.PERDEDOR);
            case TIJERA:
                return (computadoraEleccion == ELECCION.PAPEL ? RESULTADO.GANADOR : RESULTADO.PERDEDOR);
        }
        return RESULTADO.PERDEDOR;
    }
     public void mostrarResultado() {
        System.out.println("Se jugo: " + (empato + gano + perdio) + " juegos");
        System.out.println("Ganastes: " + gano + " veces");
        System.out.println("Perdistes: " + perdio + " veces");
        System.out.println("Empatastes: " + empato + " veces ");
        System.out.println("\nGracias por jugar Adios");
    }

}
