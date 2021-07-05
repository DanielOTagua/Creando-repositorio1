
package RocaPapelTijera;

import java.util.Scanner;

public class Jugador extends GameItem{
    Scanner entrada;
   // char eleccionJugador;
    public Jugador(){
        super();
        entrada=new Scanner(System.in);
    }
    //creo un metodo para llamar a una de las posibles eleciiones
    public ELECCION getEleccion(){
        System.out.println("Por favor ingrese su eleccion: R=ROCA,P=PAPEL,T=TIJERA ");
        char eleccionJugador=entrada.nextLine().toUpperCase().charAt(0);
        //USAMOS UN SWITCH PARA LA ELECCION DEL JUGADOR
        switch (eleccionJugador){
            case 'R':
                return ELECCION.ROCA;
            case 'P':
                return ELECCION.PAPEL;
            case 'T':
                return ELECCION.TIJERA;
        }
        //que pasa si no eligen una de las anteriores?
        System.out.println("Eleccion invalida");
        return getEleccion();
    }
    
}
/*
Diseñar e implementar una aplicación que juegue el juego Piedra, Papel y Tijeras
contra la computadora.El programa debe elegir al azar una de las tres opciones y
luego solicitar la selección del usuario.En ese momento, el programa revela 
ambas opciones e imprime una declaración que indica si el usuario ganó, la 
computadora ganó o si hay un empate. Continúe jugando hasta que el usuario 
decida parar, luego imprima el número de victorias, derrotas y empates.
*/
