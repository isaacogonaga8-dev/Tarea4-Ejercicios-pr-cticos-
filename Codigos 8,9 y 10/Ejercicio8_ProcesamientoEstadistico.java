/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaejercicios;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio8_ProcesamientoEstadistico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0, negativos = 0, ceros = 0;
        int pares = 0, impares = 0, multiplos3 = 0;
        double sumaTotal = 0;

        System.out.print("Ingrese cuantos numeros ingresara: ");
        int n = scanner.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                int numero = scanner.nextInt();

                sumaTotal += numero;

                
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }

                
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                
                if (numero % 3 == 0 && numero != 0) {
                    multiplos3++;
                }
            }

            double promedio = sumaTotal / n;

            System.out.println("\n===== RESULTADOS ESTADISTICOS =====");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
            System.out.println("Pares: " + pares);
            System.out.println("Impares: " + impares);
            System.out.println("Multiplos de 3: " + multiplos3);
            System.out.println("Suma total: " + sumaTotal);
            System.out.printf("Promedio: %.2f\n", promedio);
        } else {
            System.out.println("No se registraron datos para procesar (evitada division para cero).");
        }

        scanner.close();
    }
}