/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.parcial;

/**
 *
 * @author vladi
 */
public class Main {
    public static void main(String[] args) {
        Venta ventaFisica = new Venta("Fisica", 100.50, new PagoEfectivo(100.50));
        ventaFisica.procesarVenta();

        System.out.println();

        Venta ventaEnLinea = new Venta("En linea - Tarjeta", 250.75, new PagoTarjetaCredito(250.75, "1234-5678-9012-3456", "Juan Perez"));
        ventaEnLinea.procesarVenta();

        System.out.println();

        Venta ventaTransferencia = new Venta("En linea - Transferencia", 500.00, new PagoTransferencia(500.00, "123456789"));
        ventaTransferencia.procesarVenta();
    }
}