package Condicional;

import java.util.Scanner;

public class IfElseUniversitario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Tienes un título universitario? (Si/No): ");
        String titulo = scanner.next();
        scanner.nextLine();

        System.out.print("¿Tienes experiencia laboral? (Si/No): ");
        String experiencia = scanner.nextLine();

        if (edad >= 22 && titulo.equalsIgnoreCase("Si") && experiencia.equalsIgnoreCase("Si")) {
            System.out.println("Eres elegible para este empleo de nivel avanzado");
        } else if (edad >= 18 && titulo.equalsIgnoreCase("Si")) {
            System.out.println("Eres elegible para este empleo de nivel intermedio");
        } else {
            System.out.println("No eres elegible para este empleo");
        }

        scanner.close();

    }
}
