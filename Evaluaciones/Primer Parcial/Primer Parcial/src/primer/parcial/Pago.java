/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.parcial;

/**
 *
 * @author vladi
 */
public abstract class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();
}