/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coches;

import java.util.Scanner;
/**
 *
 * @author vladi
 */

public class MenuCoche {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coche coche = null;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear un Coche");
            System.out.println("2. Guardar el Coche en la base de datos");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    coche = crearCoche(scanner);
                    break;
                case 2:
                    if (coche != null) {
                        coche.GuardarBd();
                    } else {
                        System.out.println("Primero debe crear un coche.");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static Coche crearCoche(Scanner scanner) {
        System.out.println("Seleccione la Marca:");
        for (Marca marca : Marca.values()) {
            System.out.println(marca.ordinal() + 1 + ". " + marca);
        }
        Marca marca = Marca.values()[scanner.nextInt() - 1];

        System.out.println("Ingrese el modelo:");
        int modelo = scanner.nextInt();

        System.out.println("Ingrese la placa:");
        String placa = scanner.next();

        System.out.println("Seleccione el Color:");
        for (Color color : Color.values()) {
            System.out.println(color.ordinal() + 1 + ". " + color);
        }
        Color color = Color.values()[scanner.nextInt() - 1];

        System.out.println("Ingrese la cilindrada:");
        int cilindrada = scanner.nextInt();

        return new Coche(marca, modelo, placa, color, cilindrada);
    }
}