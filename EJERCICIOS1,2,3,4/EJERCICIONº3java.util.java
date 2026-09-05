import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // El ejercicio pide iniciar con un saldo de $500
        double saldo = 500.0;
        int opcion;

        // Estructura requerida: do-while para mantener el menú activo
        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO BÁSICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            // Estructura requerida: switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = teclado.nextDouble();

                    // Estructura requerida: if-else para validar el depósito
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Saldo actualizado: $" + saldo);
                    } else {
                        System.out.println("Error: El depósito debe ser un monto positivo.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = teclado.nextDouble();

                    // Estructura requerida: if-else para validar los requisitos de retiro
                    if (retiro <= 0) {
                        System.out.println("Error: El monto a retirar debe ser positivo.");
                    } else if (retiro > 500) {
                        System.out.println("Error: No puede retirar un monto superior a $500 por transacción.");
                    } else if (retiro > saldo) {
                        System.out.println("Error: Fondos insuficientes. Su saldo es menor al monto solicitado.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo actualizado: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 4);

        teclado.close();
    }
}
