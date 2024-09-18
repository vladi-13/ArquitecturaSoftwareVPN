/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

/**
 *
 * @author vladi
 */
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Jaula> jaulas; 

    public Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jaulas = new ArrayList<>();
    }

    public void añadirJaula(Jaula jaula) {
        jaulas.add(jaula);
    }

    public List<Jaula> getJaulas() {
        return jaulas;
    }

    @Override
    public String toString() {
        return "Zoologico [Nombre=" + nombre + ", Dirección=" + direccion + ", Teléfono=" + telefono + "]";
    }
}