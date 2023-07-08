public class BooleanWrapper {
    public static void main(String[] args) {
        boolean parsedBoolean = Boolean.parseBoolean("true"); // Convertir una cadena de texto a un valor booleano

        System.out.println("parsedBoolean = " + parsedBoolean);
        
        String toString = Boolean.toString(true); // Convertir un valor booleano a una cadena de texto

//        System.out.println("toString = " + toString);

        boolean logicalAnd = Boolean.logicalAnd(true, true); // Realizar una operación lógica AND entre dos valores booleanos

        System.out.println("logicalAnd = " + logicalAnd);
        
        
        boolean logicalOr = Boolean.logicalOr(true, false); // Realizar una operación lógica OR entre dos valores booleanos
        System.out.println("logicalOr = " + logicalOr);

    }
}
