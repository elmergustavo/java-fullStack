public class Casting {
    public static void main(String[] args) {
        // Casting de ampliación (upcasting):

//        int x = 5;
//        double y = x; // Casting implícito de int a double (upcasting)
//        System.out.println(y); // Resultado: 5.0

        // Casting de reducción (downcasting):
//        double x = 3.14;
//        int y = (int) x; // Casting explícito de double a int (downcasting)
//        System.out.println(y); // Resultado: 3 (parte decimal truncada)

        // Casting entre tipos numéricos:
        int a = 10;
        byte b = (byte) a; // Casting explícito de int a byte
        System.out.println(b); // Resultado: 10 (sin pérdida de información)

        double c = 3.75;
        int d = (int) c; // Casting explícito de double a int
        System.out.println(d); // Resultado: 3 (parte decimal truncada)

        long e = 2147483643534547l;
        int f = (int) e; // Casting explícito de long a int
        System.out.println(f); // Resultado: -4465453 (pérdida de información, fuera del rango de int)

        //Casting con tipos de datos booleanos:
        int x = 1;
        boolean y = (x != 0); // Casting implícito de int a boolean
        System.out.println(y); // Resultado: true

        boolean z = true;
        int w = (z) ? 1 : 0; // Casting implícito de boolean a int
        System.out.println(w); // Resultado: 1

    }
}
