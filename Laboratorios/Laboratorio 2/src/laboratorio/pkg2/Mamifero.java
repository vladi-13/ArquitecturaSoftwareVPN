package laboratorio.pkg2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladi
 */
public class Mamifero extends Animal {
    public enum TipoMamifero { LEON, OSO, MONO }
    
    private TipoMamifero tipo;
    private double temperatura;
    private int nroDePatas;
    private String color;
    
    public Mamifero(String nombre, TipoMamifero tipo, double temperatura, int nroDePatas, String color) {
        super(nombre);
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.nroDePatas = nroDePatas;
        this.color = color;
    }

    public TipoMamifero getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Mamifero [Tipo=" + tipo + ", Nombre=" + getNombre() + ", Temperatura=" + temperatura 
                + ", NroPatas=" + nroDePatas + ", Color=" + color + "]";
    }
}
