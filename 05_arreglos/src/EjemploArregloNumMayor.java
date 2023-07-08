import java.util.Scanner;

public class EjemploArregloNumMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos");
        int total = scanner.nextInt();

        int[] a = new int[total];

        System.out.println("Ingrese " + total + " valores");
        for (int i=0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        int max = 0;

        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max: i ;
        }

        System.out.println("max = " + a[max]);


    }
}
