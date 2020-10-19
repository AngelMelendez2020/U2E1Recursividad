package Main;

import static Main.Metodos.factorial;
import static Main.Metodos.fibonacci;
import static Main.Metodos.numeros;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Metodos obj = new Metodos();

        int opcion;
        Scanner ingresar = new Scanner(System.in);

        do {
            System.out.println("1.- Serie Fibonaccí ");
            System.out.println("2.- Numeros del 1 al 10 ");
            System.out.println("3.- Factorial de 5 ");
            System.out.println("4.- Salir");

            System.out.println("¿Qué quieres hacer?: ");
            opcion = ingresar.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    fibonacci(10);
                    break;

                case 2:
                    numeros(1);
                    break;

                case 3:
                    factorial(5);
                    break;

               

            }

        } while (opcion!=4);
    }

}
