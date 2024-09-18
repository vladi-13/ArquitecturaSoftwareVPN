package laboratorio.pkg2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladi
 */
public class Ave extends Animal {
    public enum TipoAve { LORO, AGUILA, CONDOR }
    
    private TipoAve tipo;
    private double peso;
    private double tamañoAlas;
    
    public Ave(String nombre, TipoAve tipo, double peso, double tamañoAlas) {
        super(nombre);
        this.tipo = tipo;
        this.peso = peso;
        this.tamañoAlas = tamañoAlas;
    }

    public TipoAve getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ave [Tipo=" + tipo + ", Nombre=" + getNombre() + ", Peso=" + peso + ", TamañoAlas=" + tamañoAlas + "]";
    }
    
    public void volar() {
        System.out.println(tipo + " está volando.");
    }
}