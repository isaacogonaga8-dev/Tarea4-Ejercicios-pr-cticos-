import java.util.Scanner;

public class Ejercicio5_Cine {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double total = 0;

        do {
            System.out.println("\n===== VENTA DE ENTRADAS DE CINE =====");
            System.out.println("1. 2D - $5.00");
            System.out.println("2. 3D - $7.50");
            System.out.println("3. IMAX - $10.00");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la edad del cliente: ");
                    int edad2D = entrada.nextInt();

                    if (edad2D < 0 || edad2D > 120) {
                        System.out.println("Edad invalida.");
                    } else {
                        double precio2D = 5.00;

                        if (edad2D < 12) {
                            precio2D = precio2D * 0.70;
                        } else if (edad2D >= 65) {
                            precio2D = precio2D * 0.75;
                        }

                        total = total + precio2D;
                        System.out.printf("Precio de la entrada: $%.2f%n", precio2D);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la edad del cliente: ");
                    int edad3D = entrada.nextInt();

                    if (edad3D < 0 || edad3D > 120) {
                        System.out.println("Edad invalida.");
                    } else {
                        double precio3D = 7.50;

                        if (edad3D < 12) {
                            precio3D = precio3D * 0.70;
                        } else if (edad3D >= 65) {
                            precio3D = precio3D * 0.75;
                        }

                        total = total + precio3D;
                        System.out.printf("Precio de la entrada: $%.2f%n", precio3D);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la edad del cliente: ");
                    int edadIMAX = entrada.nextInt();

                    if (edadIMAX < 0 || edadIMAX > 120) {
                        System.out.println("Edad invalida.");
                    } else {
                        double precioIMAX = 10.00;

                        if (edadIMAX < 12) {
                            precioIMAX = precioIMAX * 0.70;
                        } else if (edadIMAX >= 65) {
                            precioIMAX = precioIMAX * 0.75;
                        }

                        total = total + precioIMAX;
                        System.out.printf("Precio de la entrada: $%.2f%n", precioIMAX);
                    }
                    break;

                case 4:
                    System.out.printf("\nTOTAL FINAL: $%.2f%n", total);
                    System.out.println("Gracias por su compra.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}
