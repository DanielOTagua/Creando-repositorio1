
package RocaPapelTijera;

import java.util.Random;

public class Computadora extends GameItem {
    //ATRIBUTO
    private Random rand;
    //cosntructor

    public Computadora() {
        super();
        rand=new Random();//creo el objeto para ser usado 
    }
    //creo una funcion que retornanar algo de la eleccion(piedra,papel,tijera)
    public ELECCION getEleccion(){
        int num=rand.nextInt(3+1);
        //ahora usamos un switch para asignar a cada numero uno de los elementos
        switch (num){
            case 1:
                return ELECCION.ROCA;
            case 2:
                return ELECCION.PAPEL;
            
        }
        //case 3:como necesito un retorno para la funcion colo el tres como retorno
        return ELECCION.TIJERA;
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

