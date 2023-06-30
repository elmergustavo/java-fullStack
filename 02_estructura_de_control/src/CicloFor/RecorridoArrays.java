package CicloFor;

public class RecorridoArrays {
    public static void main(String[] args) {
        // posicion      0, 1, 2, 3, 4
        int[] numeros = {1, 2, 3, 4, 5, 100, 200, 350 , 500};

        // Recorrido con bucle for
        // numero.length = 5
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        // Recorrido con bucle for-each

        for (int numero : numeros) {
            System.out.println(numero);
        }






    }
}
