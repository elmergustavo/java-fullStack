package CicloWhile;

import java.util.Scanner;

public class LecturaEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "salir";
        boolean contraseñaValida = false;

        while (!input.equalsIgnoreCase("salir")){
            System.out.print("Ingresa un valor (escribe 'salir' para terminar): ");
            input = scanner.nextLine();
            System.out.println("Ingresaste: " + input);
        }

        scanner.close();
    }
}
