
import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {
        int [] numeros = new int[4];

        numeros[0] = 50;
        numeros[1] = Integer.valueOf("8");
//        numeros[2] = 8;
        numeros[3] = 45;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; // obtener el ultimo valor del array

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String[] productos = {"Televisor", "Computadora", "Silla", "Libro", "Reloj"}; // tamaño del array 5

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);

        Arrays.sort(productos);

        System.out.println("Despues de ordenarlos");

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);














    }

}
