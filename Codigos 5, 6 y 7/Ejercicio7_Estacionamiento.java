import java.util.Scanner;

public class Ejercicio7_Estacionamiento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double recaudacion = 0;

        do {

            System.out.println("\n===== ESTACIONAMIENTO UNIVERSITARIO =====");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Mostrar recaudacion");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    int vehiculo;
                    int horas;
                    int rol;
                    double tarifa = 0;
                    double subtotal;
                    double descuento = 0;
                    double total;
                    char boleto;

                    System.out.println("\n--- CALCULAR TARIFA ---");
                    System.out.println("1. Motocicleta - $0.50 por hora");
                    System.out.println("2. Automovil - $1.00 por hora");
                    System.out.println("3. Camioneta - $1.50 por hora");
                    System.out.print("Seleccione el vehiculo: ");
                    vehiculo = entrada.nextInt();

                    System.out.print("Ingrese las horas: ");
                    horas = entrada.nextInt();

                    if (horas < 1 || horas > 24) {

                        System.out.println("Cantidad de horas invalida.");

                    } else {

                        switch (vehiculo) {
                            case 1:
                                tarifa = 0.50;
                                break;

                            case 2:
                                tarifa = 1.00;
                                break;

                            case 3:
                                tarifa = 1.50;
                                break;

                            default:
                                System.out.println("Vehiculo invalido.");
                        }

                        if (vehiculo >= 1 && vehiculo <= 3) {

                            System.out.println("\n1. Estudiante");
                            System.out.println("2. Profesor");
                            System.out.println("3. Otro");
                            System.out.print("Seleccione el rol: ");
                            rol = entrada.nextInt();

                            subtotal = tarifa * horas;

                            if (rol == 1) {
                                descuento = subtotal * 0.20;
                            } else if (rol == 2) {
                                descuento = subtotal * 0.10;
                            } else {
                                descuento = 0;
                            }

                            total = subtotal - descuento;

                            System.out.print("¿Perdio el boleto? (S/N): ");
                            boleto = entrada.next().charAt(0);

                            if (boleto == 'S' || boleto == 's') {
                                total = total + 5;
                            }

                            recaudacion = recaudacion + total;

                            System.out.printf("Tarifa final: $%.2f%n", total);
                        }
                    }

                    break;

                case 2:

                    System.out.println("\n===== TARIFAS =====");
                    System.out.println("Motocicleta: $0.50 por hora");
                    System.out.println("Automovil: $1.00 por hora");
                    System.out.println("Camioneta: $1.50 por hora");
                    System.out.println("Estudiante: 20% de descuento");
                    System.out.println("Profesor: 10% de descuento");
                    System.out.println("Boleto perdido: $5.00");

                    break;

                case 3:

                    System.out.printf("\nRecaudacion total: $%.2f%n", recaudacion);

                    break;

                case 4:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}