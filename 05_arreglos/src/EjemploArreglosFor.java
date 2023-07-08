import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Computadora", "Silla", "Libro", "Reloj"}; // tamaño del array 5
        int total = productos.length;

        System.out.println("total = " + total);

//        Arrays.sort(productos);

        System.out.println(" ------ Usando el ciclo for ---------");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i +  " : " + productos[i]);
        }

        System.out.println("------- Usando el foreach -------------");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("------- Usando el ciclo while ----------");
        int i = 0;
        while (i < total) {
            System.out.println("Para el indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("------- Usando el ciclo do while ----------");
        int j = 0;

        do {
            System.out.println("Para el indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);


        int [] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int k = 0;  k < totalNumeros; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0;  k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }








        
    }
}
