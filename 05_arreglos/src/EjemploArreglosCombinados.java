public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c ;
        a = new int[12];
        b = new int[12];
        c = new int[a.length + b.length];

        System.out.println("Asignacion de valores del arreglo a");
        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        System.out.println("Asignacion de valores del arreglo b");
        for (int i = 0; i < b.length; i++){
            b[i] = (i + 1) * 5 ;
        }

        for (int x: a) {
            System.out.println(x);
        }

        System.out.println(" --------------  ----- ");

        for (int x: b) {
            System.out.println(x);
        }

        System.out.println(" --------------------------------- ");
        int aux = 0;
        for (int i =0; i < b.length; i+= 3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a [i+j];
            }
            for (int j=0; j < 3; j++) {
                c[aux++] = b[i+j];
            }
        }

        for (int i=0; i < c.length; i++) {
            System.out.println(i + " : " + c[i]);
        }

    }
}
