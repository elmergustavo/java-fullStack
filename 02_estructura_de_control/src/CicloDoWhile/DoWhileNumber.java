package CicloDoWhile;

import java.util.Scanner;
public class DoWhileNumber {
    public static void main(String[] args) {
        int suma = 0;
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número (ingresa 0 para salir): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
