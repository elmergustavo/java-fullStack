public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Computadora", "Silla", "Libro", "Reloj"}; // tamaño del array 5
        int total = productos.length;

        System.out.println("total = " + total);

        System.out.println("------------ Usando for -----------");

        for (int i =0; i < total; i++) {
            System.out.println("Para el i = " + i + " : " + productos[i]);
        }

        System.out.println("------------ Usando for inverso -----------");
        for (int i = 0; i <total; i++) {
            System.out.println("Para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println(" ------------ Usando for inverso de otra manera -------------- ");
        for (int i = total - 1; i >= 0; i-- ) {
            System.out.println("Para i = " + " valor " + productos[i]);
        }


    }
}
