/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.parcial;

/**
 *
 * @author vladi
 */
public class PagoTransferencia extends Pago {
    private String numeroCuenta;

    public PagoTransferencia(double monto, String numeroCuenta) {
        super(monto);
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago por transferencia bancaria:");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Monto: " + monto);
    }
}