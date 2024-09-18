/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author vladi
 */
public class FabricaAnimales {
    
    public Mamifero crearMamifero(String nombre, Mamifero.TipoMamifero tipo) {
        switch (tipo) {
            case LEON:
                return new Mamifero(nombre, tipo, 37.5, 4, "Amarillo");
            case OSO:
                return new Mamifero(nombre, tipo, 36.7, 4, "Marrón");
            case MONO:
                return new Mamifero(nombre, tipo, 36.9, 2, "Negro");
            default:
                return null;
        }
    }

    public Ave crearAve(String nombre, Ave.TipoAve tipo) {
        switch (tipo) {
            case LORO:
                return new Ave(nombre, tipo, 1.2, 0.4);
            case AGUILA:
                return new Ave(nombre, tipo, 6.0, 2.5);
            case CONDOR:
                return new Ave(nombre, tipo, 12.0, 3.0);
            default:
                return null;
        }
    }

    public Pez crearPez(String nombre, Pez.TipoPez tipo) {
        switch (tipo) {
            case PACU:
                return new Pez(nombre, tipo, 0.7);
            case SABALO:
                return new Pez(nombre, tipo, 1.2);
            default:
                return null;
        }
    }
}