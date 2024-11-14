public class BasicOperations {
    public static void main(String[] args){
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Escogiste el modo claro");
                break;
            case "Dark":
                System.out.println("Escogiste el modo oscuro");
                break;
            default:
                System.out.println("No es una opción válida");
        }
    }
}
