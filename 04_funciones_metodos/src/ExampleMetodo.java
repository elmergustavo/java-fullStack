public class ExampleMetodo {
    public static void main(String[] args) {
//        saludar();
        int resul = sumar(2,5);
        System.out.println("sumar(2,5) = " + sumar(2,5));


        System.out.println("Factorial = " +  calcularFactorial(5));

        System.out.println("--------------------------");

        saludar();
    }

    public static void saludar() {
        System.out.println("¡Hola, bienvenido!");
        System.out.println("Factorial = " +  calcularFactorial(5));
    }

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
