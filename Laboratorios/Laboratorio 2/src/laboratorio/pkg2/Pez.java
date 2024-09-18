package laboratorio.pkg2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladi
 */
public class Pez extends Animal {
    public enum TipoPez { PACU, SABALO }
    
    private TipoPez tipo;
    private double longitud;
    
    public Pez(String nombre, TipoPez tipo, double longitud) {
        super(nombre);
        this.tipo = tipo;
        this.longitud = longitud;
    }

    public TipoPez getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pez [Tipo=" + tipo + ", Nombre=" + getNombre() + ", Longitud=" + longitud + "]";
    }
    
    public void nadar() {
        System.out.println(tipo + " está nadando.");
    }
}
