// Variables.java

public class Variables {
    public static void main(String[] args) {
        // Declarar la variable edad de tipo int (números enteros)
        int edad;

        // Actualizar el contenido de la variable edad:
        edad = 10; // si ya habías declarado la variable

        // Declarar una variable y asignarle un valor al mismo tiempo:
        //int salario = 1000;

        // Crear una variable de tipo String:
      //  String nombre = "Gustavo";



        // Actualizar datos numéricos:
        int salario = 1000;
        salario = salario + 200;
        System.out.println(salario); // 1200

        salario += 300;
        System.out.println(salario); // 1500

        // Actualizar variables de tipo String:
        String nombre = "Santiago";
        nombre = nombre + " Castillo";
        System.out.println(nombre); // Santiago Castillo

        nombre += " De León";
        System.out.println(nombre); // Santiago Castillo De León

        nombre = "Alex" + nombre;
        System.out.println(nombre); // Alex Santiago Castillo De León
    }
}
