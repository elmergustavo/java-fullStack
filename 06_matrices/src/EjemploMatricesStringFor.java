public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Juan";
        nombres[0][1] = "Pepe";
        nombres[1][0] = "Paco";
        nombres[1][1] = "Lucas";
        nombres[2][0] = "Fernando";
        nombres[2][1] = "Luis";

        System.out.println("Iterando con for: ");

        for (int i =0; i < nombres.length; i++) {
            for (int j =0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Iterando con foreach");
        for (String [] fila : nombres) {
            for (String nombre: fila ) {
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }





    }
}
