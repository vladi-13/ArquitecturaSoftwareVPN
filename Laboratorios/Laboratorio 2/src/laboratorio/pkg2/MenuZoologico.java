/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author vladi
 */
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class MenuZoologico {
    private static Zoologico zoologico = new Zoologico("Zoo Nacional", "Av. Siempre Viva", "12345678");
    private static FabricaAnimales fabrica = new FabricaAnimales();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú Zoológico ---");
            System.out.println("1. Añadir Mamífero");
            System.out.println("2. Añadir Ave");
            System.out.println("3. Añadir Pez");
            System.out.println("4. Mostrar Mamíferos");
            System.out.println("5. Mostrar Aves");
            System.out.println("6. Mostrar Peces");
            System.out.println("7. Mostrar Zoológico");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    añadirMamifero(scanner);
                    break;
                case 2:
                    añadirAve(scanner);
                    break;
                case 3:
                    añadirPez(scanner);
                    break;
                case 4:
                    mostrarMamiferos();
                    break;
                case 5:
                    mostrarAves();
                    break;
                case 6:
                    mostrarPeces();
                    break;
                case 7:
                    System.out.println(zoologico);
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void añadirMamifero(Scanner scanner) {
        System.out.println("\n--- Añadir Mamífero ---");
        System.out.print("Ingrese el nombre del mamífero: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el tipo de mamífero:");
        System.out.println("1. León");
        System.out.println("2. Oso");
        System.out.println("3. Mono");
        int tipoOpcion = scanner.nextInt();

        Mamifero.TipoMamifero tipo = null;
        switch (tipoOpcion) {
            case 1:
                tipo = Mamifero.TipoMamifero.LEON;
                break;
            case 2:
                tipo = Mamifero.TipoMamifero.OSO;
                break;
            case 3:
                tipo = Mamifero.TipoMamifero.MONO;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        Mamifero mamifero = fabrica.crearMamifero(nombre, tipo);
        añadirJaula(scanner, mamifero);
    }

    private static void añadirAve(Scanner scanner) {
        System.out.println("\n--- Añadir Ave ---");
        System.out.print("Ingrese el nombre del ave: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el tipo de ave:");
        System.out.println("1. Loro");
        System.out.println("2. Águila");
        System.out.println("3. Cóndor");
        int tipoOpcion = scanner.nextInt();

        Ave.TipoAve tipo = null;
        switch (tipoOpcion) {
            case 1:
                tipo = Ave.TipoAve.LORO;
                break;
            case 2:
                tipo = Ave.TipoAve.AGUILA;
                break;
            case 3:
                tipo = Ave.TipoAve.CONDOR;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        Ave ave = fabrica.crearAve(nombre, tipo);
        añadirJaula(scanner, ave);
    }

    private static void añadirPez(Scanner scanner) {
        System.out.println("\n--- Añadir Pez ---");
        System.out.print("Ingrese el nombre del pez: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el tipo de pez:");
        System.out.println("1. Pacú");
        System.out.println("2. Sábalo");
        int tipoOpcion = scanner.nextInt();

        Pez.TipoPez tipo = null;
        switch (tipoOpcion) {
            case 1:
                tipo = Pez.TipoPez.PACU;
                break;
            case 2:
                tipo = Pez.TipoPez.SABALO;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        Pez pez = fabrica.crearPez(nombre, tipo);
        añadirJaula(scanner, pez);
    }

    private static void añadirJaula(Scanner scanner, Animal animal) {
        System.out.println("\n--- Datos de la Jaula ---");
        System.out.print("Ingrese el alto de la jaula (en metros): ");
        double alto = scanner.nextDouble();

        System.out.print("Ingrese el ancho de la jaula (en metros): ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingrese el largo de la jaula (en metros): ");
        double largo = scanner.nextDouble();

        Jaula jaula = new Jaula(animal, alto, ancho, largo);
        zoologico.añadirJaula(jaula);

        System.out.println("Animal y jaula añadidos correctamente.");
    }

    private static void mostrarMamiferos() {
        List<Jaula> mamiferos = zoologico.getJaulas().stream()
            .filter(j -> j.getAnimal() instanceof Mamifero)
            .collect(Collectors.toList());
        
        if (mamiferos.isEmpty()) {
            System.out.println("No hay mamíferos en el zoológico.");
        } else {
            System.out.println("\n--- Mamíferos en el Zoológico ---");
            mamiferos.forEach(System.out::println);
        }
    }

    private static void mostrarAves() {
        List<Jaula> aves = zoologico.getJaulas().stream()
            .filter(j -> j.getAnimal() instanceof Ave)
            .collect(Collectors.toList());
        
        if (aves.isEmpty()) {
            System.out.println("No hay aves en el zoológico.");
        } else {
            System.out.println("\n--- Aves en el Zoológico ---");
            aves.forEach(System.out::println);
        }
    }

    private static void mostrarPeces() {
        List<Jaula> peces = zoologico.getJaulas().stream()
            .filter(j -> j.getAnimal() instanceof Pez)
            .collect(Collectors.toList());
        
        if (peces.isEmpty()) {
            System.out.println("No hay peces en el zoológico.");
        } else {
            System.out.println("\n--- Peces en el Zoológico ---");
            peces.forEach(System.out::println);
        }
    }
}