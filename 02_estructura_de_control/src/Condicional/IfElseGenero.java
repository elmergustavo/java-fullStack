package Condicional;

import java.util.Scanner;

public class IfElseGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu género (Hombre/Mujer): ");
        String genero = scanner.nextLine();

        if (genero.equalsIgnoreCase("Hombre")){
            System.out.println("Bienvenido");
        } else if (genero.equalsIgnoreCase("Mujer")) {
            System.out.println("Bienvenida");
        } else {
            System.out.println("Género no reconocido");
        }
        scanner.close();

    }
}
