/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.parcial;

/**
 *
 * @author vladi
 */
public class PagoTarjetaCredito extends Pago {
    private String numeroTarjeta;
    private String nombreTitular;

    public PagoTarjetaCredito(double monto, String numeroTarjeta, String nombreTitular) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de credito:");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Numero de tarjeta: " + numeroTarjeta);
        System.out.println("Monto: " + monto);
    }
}
