
package RocaPapelTijera;

public class GameItem {
    //en esta clase hago una enumeracion de los elemetnos queseran usados 
    //tanto por la computadora como por el jugador
    public enum ELECCION{
        ROCA,PAPEL,TIJERA;
    }
    public enum RESULTADO{
        GANADOR,PERDEDOR,EMPATE;
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