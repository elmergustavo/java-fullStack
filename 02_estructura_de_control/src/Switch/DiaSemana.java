package Switch;

public class DiaSemana {
    public static void main(String[] args) {
        String mes = "CASA";

        switch (mes) {
            case "Enero":
                System.out.println("Es el primer mes del año");
                break;
            case "Febrero":
                System.out.println("Es el segundo mes del año");
                break;
            case "Marzo":
                System.out.println("Es el tercer mes del año");
                break;
            default:
                System.out.println("Mes desconocido");
        }

    }
}
