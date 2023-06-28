package CicloWhile;

public class SumaNumeros {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        while (numero <= 10) {  // numero = 1, 2, 3
            suma += numero; // suma = 1 , 3, 6,
            numero++;  // numero = 2, 3 , 4
            System.out.println(suma);
        }
        System.out.println("La suma de los números del 1 al 10 es: " + suma);

    }
}
