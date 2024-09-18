/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author vladi
 */
public class Jaula {
    private Animal animal;
    private double alto;
    private double ancho;
    private double largo;
    
    public Jaula(Animal animal, double alto, double ancho, double largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Jaula [Animal=" + animal + ", Alto=" + alto + ", Ancho=" + ancho + ", Largo=" + largo + "]";
    }
}
