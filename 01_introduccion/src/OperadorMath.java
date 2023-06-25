public class OperadorMath {
    public static void main(String[] args) {
        double x = 4.3;
        double y = 2.5;

        //Operaciones básicas:
        double max = Math.max(x, y); // Obtiene el valor máximo entre x e y (max = 4.3)
        double min = Math.min(x, y); // Obtiene el valor mínimo entre x e y (min = 2.5)
        double abs = Math.abs(-5.6); // Obtiene el valor absoluto de -5.6 (abs = 5.6)
        double sqrt = Math.sqrt(25); // Obtiene la raíz cuadrada de 25 (sqrt = 5.0)


        // Funciones trigonométricas:
        double angle = 45.0;
        double radians = Math.toRadians(angle); // Convierte el ángulo a radianes
        double sin = Math.sin(radians); // Calcula el seno del ángulo (sin = 0.7071)
        double cos = Math.cos(radians); // Calcula el coseno del ángulo (cos = 0.7071)
        double tan = Math.tan(radians); // Calcula la tangente del ángulo (tan = 1.0)

        // Funciones exponenciales y logarítmicas:
        double power = Math.pow(2, 3); // Calcula 2 elevado a la potencia de 3 (power = 8.0)
        double exp = Math.exp(1.0); // Calcula el exponencial de 1.0 (exp = 2.7183)
        double log = Math.log(10.0); // Calcula el logaritmo natural de 10.0 (log = 2.3026)
        double log10 = Math.log10(100.0); // Calcula el logaritmo base 10 de 100.0 (log10 = 2.0)

        // Generación de números aleatorios:

        double random = Math.random(); // Genera un número aleatorio entre 0.0 y 1.0
        int randomInt = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 y 9





    }
}
