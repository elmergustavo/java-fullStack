public class IntegerWrapper {
    public static void main(String[] args) {

        // Ejemplo con la clase Integer:

        int num = 42; // tipo primitivo
        Integer obj = Integer.valueOf(num);    // clase wrapper forma explicita
        Integer obj3 = num;  // forma implicita
        System.out.println("obj = " + obj);

        // Utilizando métodos de la clase Integer
        System.out.println("Valor del objeto Integer: " + obj.toString());

//        String obj2 = obj.toString();

        System.out.println("Valor en binario: " + Integer.toBinaryString(obj));

        System.out.println("Valor en hexadecimal: " + Integer.toHexString(obj));
        System.out.println("Suma con otro entero: " + (num + 10));

        int parsedInt = Integer.parseInt(obj.toString()); // Convertir una cadena de texto a un valor entero

        int compareResult = Integer.compare(21, 50); // Comparar dos enteros

        if (compareResult == 0) {
            System.out.println("Ambos numeros son iguales");
        } else if (compareResult == 1) {
            System.out.println("El primer valor es mayor");
        } else if (compareResult == -1) {
            System.out.println("El segundo valor es mayor");
        }

        System.out.println("compareResult = " + compareResult);

        int maxValue = Integer.max(50, 20); // Obtener el valor máximo entre dos enteros
        System.out.println("maxValue = " + maxValue);

        int minValue = Integer.min(10, 20); // Obtener el valor mínimo entre dos enteros
        System.out.println("minValue = " + minValue);
        
        
        int value  = obj;
        System.out.println("obj.intValue() = " + obj.intValue());

    }
}
