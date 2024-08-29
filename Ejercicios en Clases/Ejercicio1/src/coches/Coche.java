/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author vladi
 * 
 */

public class Coche {
    private Marca marca;
    private int modelo;
    private String placa;
    private Color color;
    private int cilindrada;

    public Coche(Marca marca, int modelo, String placa, Color color, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public void GuardarBd() {
        String url = "jdbc:mysql://localhost:3306/bd_coches?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String usuario = "root"; 
        String contraseña = ""; 
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            String sql = "INSERT INTO coches(marca, modelo, placa, color, cilindrada) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement instruccion = conexion.prepareStatement(sql)) {
                instruccion.setString(1, marca.name());
                instruccion.setInt(2, modelo);
                instruccion.setString(3, placa);
                instruccion.setString(4, color.name()); 
                instruccion.setInt(5, cilindrada);
                instruccion.executeUpdate();
                System.out.println("Coche guardado correctamente en la base de datos.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al guardar el coche: " + ex.getMessage());
        }
    }

    // Getters y Setters
}
