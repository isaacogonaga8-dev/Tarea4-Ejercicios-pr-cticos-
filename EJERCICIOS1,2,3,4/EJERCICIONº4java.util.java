import java.util.Scanner;

public class ControlIntentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables iniciales
        String claveCorrecta = "Java2026";
        int intentosMaximos = 3;
        int intentosRealizados = 0;
        boolean accesoPermitido = false;

        // Ciclo controlado por los intentos y el estado de acceso
        while (intentosRealizados < intentosMaximos && !accesoPermitido) {
            System.out.print("Ingrese la contraseña: ");
            String claveIngresada = scanner.nextLine();
            intentosRealizados++;

            // Estructura if-else para validar la contraseña
            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("Acceso permitido");
                accesoPermitido = true; // Termina el ciclo inmediatamente
            } else {
                if (intentosRealizados < intentosMaximos) {
                    int intentosRestantes = intentosMaximos - intentosRealizados;
                    System.out.println("Clave incorrecta. Intentos restantes: " + intentosRestantes);
                } else {
                    System.out.println("Usuario bloqueado");
                }
            }
        }

        scanner.close();
    }
}
