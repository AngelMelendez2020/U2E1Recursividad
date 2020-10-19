package Main;

public class Metodos {

    public static int fibonacci(int n) {
        int resultado;
        if (n <= 1) {
            return n;
        } else {
            resultado = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.println(resultado);
            return resultado;
        }

    }

    public static int factorial(int n) {
        int respuesta;
        if (n == 0) {
            return 1;
        } else {
            respuesta = n * factorial(n - 1);
            System.out.println(respuesta);
            return respuesta;
        }

    }

    public static int numeros(int num) {

        if (num == 11) {
            return 1;
        } else {
            System.out.println(num);
            return num + numeros(num + 1);
        }

    }

}
