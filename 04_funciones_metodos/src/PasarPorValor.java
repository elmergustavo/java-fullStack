public class PasarPorValor {
    public static void main(String[] args) {
        Integer i = 10;

        System.out.println("Iniciamo el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i =" + i);

    }

    public static void test(int i) {
        System.out.println("Iniciamor el metodo test con i = " + i);
        i = 50;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
