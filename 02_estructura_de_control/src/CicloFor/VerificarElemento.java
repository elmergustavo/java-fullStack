package CicloFor;

public class VerificarElemento {
    public static void main(String[] args) {
        // Verificar si un elemento existe en un arreglo de strings:

        String[] nombres = {"Juan", "María", "Manuel", "Ana"};

        String nombreBuscado = "Pedro";

        boolean encontrado = false;

        for (String nombre : nombres) {
            if (nombre.equals(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(nombreBuscado + " se encuentra en el arreglo.");
        } else {
            System.out.println(nombreBuscado + " no se encuentra en el arreglo.");
        }





    }
}
