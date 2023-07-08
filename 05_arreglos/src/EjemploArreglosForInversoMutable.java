import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String [] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Computadora", "Silla", "Libro", "Reloj", "Mesa"}; // tamaño del array 5
        int total = productos.length;

//        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println(" usando el ciclo for ");

        for ( int i =0; i < total;  i++) {
            System.out.println("Para el indice " + i + " : " + productos[i]);

        }
    }
}
