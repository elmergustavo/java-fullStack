public class PasarPorReferencia {
    public static void main(String[] args) {
        int [] edad = {10, 20, 30};

        System.out.println("Iniciamo el metodo main ");
        for (int i =0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de llamar el metodo test");

        test(edad);

        System.out.println("Despues de llamar al metodo test");

        for (int i =0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!");

    }

    public static void test(int [] edadArray) {
        System.out.println("Iniciamos el metodo test");
        for (int i =0; i < edadArray.length; i++) {
            edadArray[i] = edadArray[i] + 10 ;
        }

        System.out.println("Finaliza el metodo test");

    }
}
