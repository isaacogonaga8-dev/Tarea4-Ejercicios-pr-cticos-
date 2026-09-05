import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int opcion;

        // Estructura do-while: El menú se ejecuta al menos una vez hasta que se elija salir
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Tabla ascendente");
            System.out.println("2. Tabla descendente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            // Estructura switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    System.out.print("Solicite un número entre 1 y 12: ");
                    numero = teclado.nextInt();

                    // Estructura if-else para validar si el número está en el rango correcto
                    if (numero >= 1 && numero <= 12) {
                        System.out.println("\nTabla ascendente del " + numero + ":");
                        // Estructura for para el orden ascendente (1 a 12)
                        for (int i = 1; i <= 12; i++) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                    } else {
                        System.out.println("Error: Número inválido. Debe estar entre 1 y 12.");
                    }
                    break;

                case 2:
                    System.out.print("Solicite un número entre 1 y 12: ");
                    numero = teclado.nextInt();

                    // Estructura if-else para validar el rango del número
                    if (numero >= 1 && numero <= 12) {
                        System.out.println("\nTabla descendente del " + numero + ":");
                        // Estructura for para el orden descendente (12 a 1)
                        for (int i = 12; i >= 1; i--) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                    } else {
                        System.out.println("Error: Número inválido. Debe estar entre 1 y 12.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 3);

        teclado.close();
    }
}
