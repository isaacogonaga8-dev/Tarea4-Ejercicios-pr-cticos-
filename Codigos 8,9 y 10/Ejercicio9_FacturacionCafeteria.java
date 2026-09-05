/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaejercicios;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio9_FacturacionCafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double subtotal = 0.0;

        do {
            System.out.println("\n===== MENU CAFETERIA =====");
            System.out.println("1. Cafe ($1.50)");
            System.out.println("2. Sandwich ($2.50)");
            System.out.println("3. Jugo ($1.75)");
            System.out.println("4. Ensalada ($3.00)");
            System.out.println("5. Finalizar compra");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            double precio = 0.0;
            boolean opcionValida = true;

            switch (opcion) {
                case 1:
                    precio = 1.50;
                    break;
                case 2:
                    precio = 2.50;
                    break;
                case 3:
                    precio = 1.75;
                    break;
                case 4:
                    precio = 3.00;
                    break;
                case 5:
                    System.out.println("Procesando factura...");
                    opcionValida = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    opcionValida = false;
                    break;
            }

            if (opcionValida) {
                System.out.print("Ingrese la cantidad deseada: ");
                int cantidad = scanner.nextInt();

                if (cantidad > 0) {
                    subtotal += precio * cantidad;
                    System.out.printf("Subtotal acumulado actual: $%.2f\n", subtotal);
                } else {
                    System.out.println(" Error: Rechazado. La cantidad debe ser mayor a 0.");
                }
            }

        } while (opcion != 5);

        // Aplicación de escala de descuentos
        double porcentajeDescuento = 0.0;
        if (subtotal < 10.0) {
            porcentajeDescuento = 0.0;
        } else if (subtotal >= 10.0 && subtotal <= 19.99) {
            porcentajeDescuento = 0.05;
        } else if (subtotal >= 20.0 && subtotal <= 49.99) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.15;
        }

        double montoDescuento = subtotal * porcentajeDescuento;
        double totalAPagar = subtotal - montoDescuento;

        System.out.println("\n===== FACTURA FINAL =====");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Descuento aplicado (%.0f%%): $%.2f\n", (porcentajeDescuento * 100), montoDescuento);
        System.out.printf("Total a Pagar: $%.2f\n", totalAPagar);

        scanner.close();
    }
}
