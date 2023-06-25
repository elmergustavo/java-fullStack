public class OperadorDecrementoIncremento {
    public static void main(String[] args) {
        int x = 5;

        x++; // incremento en 1, x = 6
        x--; // decremento en 1, x = 5

        int y = 10;
        int z = ++y; // incremento antes de asignar, z = 11, y = 11

        int w = 10;
        int v = w++; // incremento después de asignar, v = 10, w = 11
    }
}
