import java.util.Scanner;

public class Ejercicio6_Temperaturas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperatura;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        double promedio;

        int cantidad = 0;
        int frio = 0;
        int templado = 0;
        int calido = 0;
        int muyCalido = 0;

        System.out.print("Ingrese una temperatura (-50 a 60) o 999 para finalizar: ");
        temperatura = entrada.nextDouble();

        while (temperatura != 999) {

            // Validar temperatura
            if (temperatura < -50 || temperatura > 60) {

                System.out.println("Temperatura invalida. Debe estar entre -50 y 60.");

            } else {

                // Acumulador y contador
                suma = suma + temperatura;
                cantidad = cantidad + 1;

                // Mayor y menor
                if (cantidad == 1) {
                    mayor = temperatura;
                    menor = temperatura;
                } else {

                    if (temperatura > mayor) {
                        mayor = temperatura;
                    }

                    if (temperatura < menor) {
                        menor = temperatura;
                    }
                }

                // Clasificacion
                if (temperatura < 10) {

                    frio = frio + 1;

                } else if (temperatura <= 24) {

                    templado = templado + 1;

                } else if (temperatura <= 34) {

                    calido = calido + 1;

                } else {

                    muyCalido = muyCalido + 1;
                }
            }

            System.out.print("Ingrese otra temperatura o 999 para finalizar: ");
            temperatura = entrada.nextDouble();
        }

        // Mostrar resultados
        if (cantidad > 0) {

            promedio = suma / cantidad;

            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Temperatura mayor: " + mayor);
            System.out.println("Temperatura menor: " + menor);
            System.out.println("Promedio: " + promedio);
            System.out.println("Frio: " + frio);
            System.out.println("Templado: " + templado);
            System.out.println("Calido: " + calido);
            System.out.println("Muy calido: " + muyCalido);

        } else {

            System.out.println("No se ingresaron temperaturas validas.");
        }

        entrada.close();
    }
}
