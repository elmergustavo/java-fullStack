package Arrays;

public class Example {
    public static void main(String[] args) {
        // Declaración y asignación directa
//        int[] numeros = {1, 2, 3, 4, 5, 50, 100, 85};

        double[] decimal = {25.25, 30.25, 15.45};

        String[] nombre = {"Juan", "Jose", "Gustavo"};

        char[] caracter = {'a', 'e', 'i', 'o', 'u'};

        // Declaración y asignación por separado
        int[] numeros2;
        numeros2 = new int[]{1, 2, 3, 4, 5};


        //Acceso a elementos
        // posicion      0, 1, 2, 3, 4, 5,  6,   7
        int[] numeros = {1, 2, 3, 4, 5, 50, 100, 85};
//        System.out.println(numeros[0]);  // Imprime el primer elemento (1)

        // Longitud de un array
        int longitud = numeros.length;
        System.out.println("La longitud del array es: " + longitud);


















    }
}
