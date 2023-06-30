package CicloFor;

public class CalcularSuma {
    public static void main(String[] args) {
        double[] valores = {1.5, 2.3, 4.1, 3.7};
        double suma = 0;

        for (double valor : valores) {
            suma += valor;
        }
//        System.out.println("La suma de los elementos es: " + suma);

        // Imprimir los caracteres de una cadena utilizando un arreglo de caracteres:
        String palabra = "Hola";
        char[] letras = {'H', 'o', 'l', 'a'};
//        char[] caracteres = palabra.toCharArray();

        for (char c : palabra.toCharArray()) {
            System.out.println(c);
        }



    }
}
