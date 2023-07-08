import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForIOrdenamientoBurbuja {

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

//      arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println(" usando el ciclo for ");

        for ( int i =0; i < total;  i++) {
            System.out.println("Para el indice " + i + " : " + productos[i]);

        }

        System.out.println("------------- Metodo de ordenamiento Burbuja --------------");

        Integer []  numeros = new Integer[5];


        numeros[0] = 10;
        numeros[1] = Integer.valueOf("8");
        numeros[2] = 45;
        numeros[3] = -5;
        numeros[4] = 7;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }

    }

    public static void  sortBurbuja (Object [] arreglo) {
        int total = arreglo.length;
        int contador = 0;

        for (int i=0; i < total -1; i++) {
            for (int j =0; j < total -1; j++) {
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0 ) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }


}
