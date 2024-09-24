/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.parcial;

/**
 *
 * @author vladi
 */
public class Venta {
    private String tipoVenta;
    private double monto;
    private Pago pago;

    public Venta(String tipoVenta, double monto, Pago pago) {
        this.tipoVenta = tipoVenta;
        this.monto = monto;
        this.pago = pago;
    }

    public void procesarVenta() {
        System.out.println("Registrando venta " + tipoVenta + "\nPor un monto de: " + monto);
        pago.procesarPago();
        actualizarInventario();
        emitirFactura();
    }

    private void actualizarInventario() {
        System.out.println("Actualizando inventario...");
    }

    private void emitirFactura() {
        System.out.println("Factura emitida por un monto de: " + monto);
    }
}