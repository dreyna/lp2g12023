/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import PASO001.PRIMERO;
public class SEGUNDO {
        // Colores ANSI para la salida de texto
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLACK = "\u001B[30m";
    private static Scanner scanner = new Scanner(System.in);
    private static PRIMERO lectura = new PRIMERO();
public static void mostrarMenuPrincipa() {
    mostrarTransicionEspera();

    
}

public static void esperar(int milisegundos) {
    try {
        Thread.sleep(milisegundos);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        
        
        System.out.print(ANSI_CYAN + "B  "+ ANSI_RESET);
        esperar(500);
        System.out.print(ANSI_CYAN + "I  "+ ANSI_RESET);
        esperar(400);
        System.out.print(ANSI_CYAN + "E  "+ ANSI_RESET);
        esperar(300);
        System.out.print(ANSI_CYAN + "N  "+ ANSI_RESET);
        esperar(400);
        System.out.print(ANSI_CYAN + "V  "+ ANSI_RESET);
        esperar(300);
        System.out.print(ANSI_CYAN + "E  "+ ANSI_RESET);
        esperar(400);
        System.out.print(ANSI_CYAN + "N  "+ ANSI_RESET);
        esperar(300);
        System.out.print(ANSI_CYAN + "I  "+ ANSI_RESET);
        esperar(400);
        System.out.print(ANSI_CYAN + "D  "+ ANSI_RESET);
        esperar(300);
        System.out.print(ANSI_CYAN + "O  "+ ANSI_RESET);
        esperar(400);

        System.out.println();

        boolean inicioSesionExitoso = false;
        int intentos = 0;

        while (!inicioSesionExitoso && intentos < 3) {
    System.out.print(ANSI_CYAN + "                                    I "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "N "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "I "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "C "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "I "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "A "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "R     "+ ANSI_RESET);

    System.out.print(ANSI_CYAN + "S "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "E "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "S "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "I "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "O "+ ANSI_RESET);
    esperar(300);
    System.out.print(ANSI_CYAN + "N "+ ANSI_RESET);
    esperar(300);

    esperar(5000);
            System.out.println(" ");
            System.out.print(ANSI_PURPLE + "     Usuario: "+ ANSI_RESET);
            esperar(500);
            String usuario = lectura.cadena();

            System.out.print(ANSI_PURPLE + "     Contraseña: "+ ANSI_RESET);
            
            String contraseña = lectura.cadena();

            if (usuario.equalsIgnoreCase("admin") && contraseña.equals("1234")) {
                inicioSesionExitoso = true;
                System.out.println(ANSI_YELLOW + "                              Inicio de sesión exitoso"+ ANSI_RESET);
                esperar(100);
                System.out.println("");
                System.out.print(ANSI_RED + "                                 Cargando el programa."+ ANSI_RESET);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(500);
                System.out.print(ANSI_RED + "." + ANSI_RESET);
                esperar(4000);
                mostrarMenuPrincipal();
            } else {
                intentos++;
                System.out.println(ANSI_RED + "DATOS INGRESADOS INCORRECTOS. VUELVA A INTENAR NUEVAMENTE: " + (10 - intentos)+ ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);
                System.out.println(ANSI_RED + "E R R O R"+ ANSI_RESET);
                esperar(100);

            }
        }

        if (!inicioSesionExitoso) {
            System.out.println("Has alcanzado el máximo número de intentos. Programa terminado.");
            return;
        }
    }

    public static void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("                                              \n=== Menú Principal ===");
            System.out.println("                                              \n1. Temas de matemáticas y algoritmos");
            System.out.println("                                              \n2. Generador de archivos");
            System.out.println("                                              \n3. Salir");

            int opcion = lectura.entero();

            switch (opcion) {
                case 1:
                    mostrarSubMenuMatematicasAlgoritmos();
                    break;
                case 2:
                    mostrarSubMenuGeneradorArchivos();
                    break;
                case 3:
                    System.out.println("Programa terminado.");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            }
        }
    }

    public static void mostrarSubMenuMatematicasAlgoritmos() {
        while (true) {
            System.out.println("\n=== Submenú de Matemáticas y Algoritmos ===");
            System.out.println("1. Ejercicios de matemáticas");
            System.out.println("2. Ejercicios de algoritmos");
            System.out.println("3. Volver al menú principal");

            int opcion = lectura.entero();

            switch (opcion) {
                case 1:
                    realizarEjerciciosMatematicas();
                    break;
                case 2:
                    realizarEjerciciosAlgoritmos();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            }
        }
    }

    public static void realizarEjerciciosMatematicas() {
        while (true) {
            System.out.println("\n=== Ejercicios de Matemáticas ===");
            System.out.println("1. Tema 1: Álgebra");
            System.out.println("2. Tema 2: Geometría");
            System.out.println("3. Tema 3: Trigonometría");
            System.out.println("4. Tema 4: Cálculo");
            System.out.println("5. Tema 5: Estadística");
            System.out.println("6. Volver al submenú anterior");

            int opcion = lectura.entero();

            switch (opcion) {
                case 1:
                    // Realizar ejercicios del Tema 1: Álgebra
                    System.out.println("Realizando ejercicios del Tema 1: Álgebra...");
                    // Código para los ejercicios del tema de Álgebra
                    break;
                case 2:
                    // Realizar ejercicios del Tema 2: Geometría
                    System.out.println("Realizando ejercicios del Tema 2: Geometría...");
                    // Código para los ejercicios del tema de Geometría
                    break;
                case 3:
                    // Realizar ejercicios del Tema 3: Trigonometría
                    System.out.println("Realizando ejercicios del Tema 3: Trigonometría...");
                    // Código para los ejercicios del tema de Trigonometría
                    break;
                case 4:
                    // Realizar ejercicios del Tema 4: Cálculo
                    System.out.println("Realizando ejercicios del Tema 4: Cálculo...");
                    // Código para los ejercicios del tema de Cálculo
                    break;
                case 5:
                    // Realizar ejercicios del Tema 5: Estadística
                    System.out.println("Realizando ejercicios del Tema 5: Estadística...");
                    // Código para los ejercicios del tema de Estadística
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            }

            // Preguntar si desea volver a realizar la operación
            System.out.println("\n¿Deseas volver a realizar ejercicios de matemáticas? (SI/NO)");
            String respuesta = lectura.cadena();

            if (respuesta.equalsIgnoreCase("NO")) {
                return;
            }
        }
    }

    public static void realizarEjerciciosAlgoritmos() {
        while (true) {
            System.out.println("\n=== Ejercicios de Algoritmos ===");
            System.out.println("1. Tema 1: Estructuras de datos");
            System.out.println("2. Tema 2: Algoritmos de búsqueda");
            System.out.println("3. Tema 3: Algoritmos de ordenamiento");
            System.out.println("4. Tema 4: Recursividad");
            System.out.println("5. Tema 5: Complejidad algorítmica");
            System.out.println("6. Volver al submenú anterior");

            int opcion = lectura.entero();

            switch (opcion) {
                case 1:
                    // Realizar ejercicios del Tema 1: Estructuras de datos
                    System.out.println("Realizando ejercicios del Tema 1: Estructuras de datos...");
                    // Código para los ejercicios del tema de Estructuras de datos
                    break;
                case 2:
                    // Realizar ejercicios del Tema 2: Algoritmos de búsqueda
                                        System.out.println("Realizando ejercicios del Tema 2: Algoritmos de búsqueda...");
                    // Código para los ejercicios del tema de Algoritmos de búsqueda
                    break;
                case 3:
                    // Realizar ejercicios del Tema 3: Algoritmos de ordenamiento
                    System.out.println("Realizando ejercicios del Tema 3: Algoritmos de ordenamiento...");
                    // Código para los ejercicios del tema de Algoritmos de ordenamiento
                    break;
                case 4:
                    // Realizar ejercicios del Tema 4: Recursividad
                    System.out.println("Realizando ejercicios del Tema 4: Recursividad...");
                    // Código para los ejercicios del tema de Recursividad
                    break;
                case 5:
                    // Realizar ejercicios del Tema 5: Complejidad algorítmica
                    System.out.println("Realizando ejercicios del Tema 5: Complejidad algorítmica...");
                    // Código para los ejercicios del tema de Complejidad algorítmica
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            }

            // Preguntar si desea volver a realizar la operación
            System.out.println("\n¿Deseas volver a realizar ejercicios de algoritmos? (SI/NO)");
            String respuesta = lectura.cadena();

            if (respuesta.equalsIgnoreCase("NO")) {
                return;
            }
        }
    }

    public static void mostrarSubMenuGeneradorArchivos() {
        while (true) {
            System.out.println("\n=== Submenú de Generador de Archivos ===");
            System.out.println("1. Crear archivo TXT");
            System.out.println("2. Crear archivo PDF");
            System.out.println("3. Volver al menú principal");

            int opcion = lectura.entero();

            switch (opcion) {
                case 1:
                    // Crear archivo TXT
                    System.out.println("Creando archivo TXT...");
                    crearArchivoTXT();
                    break;
                case 2:
                    // Crear archivo PDF
                    System.out.println("Creando archivo PDF...");
                    crearArchivoPDF();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            }
        }
    }

    public static void crearArchivoTXT() {
        try {
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreArchivo = lectura.cadena();

            System.out.print("Ingrese el contenido del archivo: ");
            String contenido = lectura.cadena();

            FileWriter archivo = new FileWriter(nombreArchivo + ".txt");
            archivo.write(contenido);
            archivo.close();

            System.out.println("Archivo TXT creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al crear el archivo TXT.");
            e.printStackTrace();
        }
    }

    public static void crearArchivoPDF() {
        try {
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreArchivo = lectura.cadena();

            System.out.print("Ingrese el contenido del archivo: ");
            String contenido = lectura.cadena();

            // Código para generar el archivo PDF
            // ...

            System.out.println("Archivo PDF creado exitosamente.");
        } catch (Exception e) {
            System.out.println("Se produjo un error al crear el archivo PDF.");
            e.printStackTrace();
        }
    }

    private static void mostrarTransicionEspera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
