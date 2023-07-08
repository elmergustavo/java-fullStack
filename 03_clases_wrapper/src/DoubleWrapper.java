public class DoubleWrapper {
    public static void main(String[] args) {
//        double doubleValue = Double.parseDouble("3.14"); // Convertir una cadena de texto a un valor de punto flotante
//
//        double suma = doubleValue + 25.36;
//
//        System.out.println("suma = " + suma);

        double doubleValue = Double.parseDouble("3.14"); // Convertir una cadena de texto a un valor de punto flotante

        System.out.println("doubleValue = " + doubleValue);
        
        String hexString = Double.toHexString(3.14); // Convertir un valor de punto flotante a una cadena hexadecimal
        System.out.println("hexString = " + hexString);
        
        double maxValue = Double.max(1.23, 4.56); // Obtener el valor máximo entre dos números de punto flotante
        System.out.println("maxValue = " + maxValue);
        
        double minValue = Double.min(1.23, 4.56); // Obtener el valor mínimo entre dos números de punto flotante
        System.out.println("minValue = " + minValue);
        
        int intPrimitivo = 127;
        Integer intObjeto = intPrimitivo;

        // -32768 hasta 32767
        Short shortObjeto = intObjeto.shortValue();

        //	-128 hasta 127
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        System.out.println("shortObjeto = " + shortObjeto);




        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto ? "  + (num1 == num2));


        System.out.println("-------------------------------------------------");
        num2 = 5000;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto ? "  + (num1 == num2));


        System.out.println("condicion " + (num1.intValue() < num2.intValue()));


    }
}
