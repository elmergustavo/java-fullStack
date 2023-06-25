public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean and = (a && b); // false
        System.out.println(and);

        boolean or = (a || b); // true
        System.out.println(or);

        boolean not = !a; // false
        System.out.println(not);
    }
}
