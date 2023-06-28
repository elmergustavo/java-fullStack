package Condicional;

public class RangoEdad {
    public static void main(String[] args) {
        int edad = 15;

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad <=65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres mayor de edad");
        }


    }
}
