public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = { { "Pepe", "Pepa"}, {"Juan", "Luis" }, {"Fernando", "Kevin" } }; // matriz de [3][2]

        System.out.println("Iterando con foreach");
        for (String [] fila : nombres) {
            for (String nombre: fila ) {
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }
    }
}
