package RocaPapelTijera;

import java.util.Scanner;

public class PrincipalJuego {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ElJuego jugar = new ElJuego();
        char salir = ' ';

        while (salir != 'N') {
            jugar.jugar();
            System.out.println("Desea continuar?. precione cualquier tecla para continuar"
                    + ", si quiere salir precione 'N'");

            salir = entrada.nextLine().toUpperCase().charAt(0);
        }
        entrada.close();
        jugar.mostrarResultado();
    }

}
