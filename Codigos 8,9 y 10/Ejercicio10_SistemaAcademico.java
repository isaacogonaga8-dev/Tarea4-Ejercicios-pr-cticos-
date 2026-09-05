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

public class Ejercicio10_SistemaAcademico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String nombreUltimo = "";
        double promedioUltimo = 0.0;
        double asistenciaUltima = 0.0;
        String estadoUltimo = "";
        boolean hayRegistros = false;

        int opcion;

        do {
            System.out.println("\n===== SISTEMA ACADEMICO INTEGRADOR =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar resultados del estudiante");
            System.out.println("3. Buscar un estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del estudiante: ");
                    nombreUltimo = scanner.nextLine();

                    double sumaCalificaciones = 0.0;
                    
                    for (int i = 1; i <= 3; i++) {
                        double nota;
                        do {
                            System.out.print("Ingrese calificacion " + i + " (0.0 a 10.0): ");
                            nota = scanner.nextDouble();
                            if (nota < 0.0 || nota > 10.0) {
                                System.out.println(" Error: Calificacion fuera de rango [0.0 - 10.0]. Reintente.");
                            }
                        } while (nota < 0.0 || nota > 10.0);
                        sumaCalificaciones += nota;
                    }

                    promedioUltimo = sumaCalificaciones / 3.0;

                   
                    do {
                        System.out.print("Ingrese porcentaje de asistencia (0.0 a 100.0): ");
                        asistenciaUltima = scanner.nextDouble();
                        if (asistenciaUltima < 0.0 || asistenciaUltima > 100.0) {
                            System.out.println(" Error: Asistencia fuera de rango [0.0 - 100.0]. Reintente.");
                        }
                    } while (asistenciaUltima < 0.0 || asistenciaUltima > 100.0);

                    
                    if (promedioUltimo >= 9.0 && asistenciaUltima >= 90.0) {
                        estadoUltimo = "Excelente";
                    } else if (promedioUltimo >= 7.0 && asistenciaUltima >= 70.0) {
                        estadoUltimo = "Aprobado";
                    } else if (promedioUltimo >= 5.0 && asistenciaUltima >= 70.0) {
                        estadoUltimo = "Supletorio";
                    } else {
                        estadoUltimo = "Reprobado";
                    }

                    hayRegistros = true;
                    System.out.println(" Estudiante registrado con exito.");
                    break;

                case 2:
                    System.out.println("\n--- ULTIMO REGISTRO PROCESADO ---");
                    if (!hayRegistros) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        System.out.printf("Nombre: %-15s | Promedio: %5.2f | Asistencia: %5.1f%% | Estado: %s\n",
                                nombreUltimo, promedioUltimo, asistenciaUltima, estadoUltimo);
                    }
                    break;

                case 3:
                    if (!hayRegistros) {
                        System.out.println("No hay estudiantes registrados para buscar.");
                    } else {
                        System.out.print("Ingrese el nombre del estudiante a buscar: ");
                        String nombreBusqueda = scanner.nextLine();

                        int intento = 0;
                        boolean encontrado = false;

                        
                        while (intento < 1 && !encontrado) {
                            if (nombreUltimo.equalsIgnoreCase(nombreBusqueda)) {
                                encontrado = true;
                                System.out.println("\n Estudiante Encontrado:");
                                System.out.println("Nombre: " + nombreUltimo);
                                System.out.printf("Promedio: %.2f\n", promedioUltimo);
                                System.out.printf("Asistencia: %.1f%%\n", asistenciaUltima);
                                System.out.println("Estado: " + estadoUltimo);
                            }
                            intento++;
                        }

                        if (!encontrado) {
                            System.out.println(" No se encontro a ningun estudiante con el nombre: " + nombreBusqueda);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema academico...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
