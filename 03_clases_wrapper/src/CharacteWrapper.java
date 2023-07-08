public class CharacteWrapper {
    public static void main(String[] args) {
        boolean isDigit = Character.isDigit('9'); // Verificar si un carácter es un dígito
        System.out.println("isDigit = " + isDigit);

        boolean isLetter = Character.isLetter('2'); // Verificar si un carácter es una letra
        System.out.println("isLetter = " + isLetter);

        boolean isWhitespace = Character.isWhitespace(' '); // Verificar si un carácter es un espacio en blanco
        System.out.println("isWhitespace = " + isWhitespace);

        char toUpperCase = Character.toUpperCase('a'); // Convertir un carácter a mayúscula
        System.out.println("toUpperCase = " + toUpperCase);


    }
}
