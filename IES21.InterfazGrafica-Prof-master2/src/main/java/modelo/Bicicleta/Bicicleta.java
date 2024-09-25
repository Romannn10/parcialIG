/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Bicicleta;

public class Bicicleta {
    private String color;
    private int rodado;
    private String marca;
    private double precio;

    public Bicicleta(String color, int rodado, String marca, double precio) {
        this.color = color;
        this.rodado = rodado;
        this.marca = marca;
        this.precio = precio;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicleta [Color=" + color + ", Rodado=" + rodado + ", Marca=" + marca + ", Precio=" + precio + "]";
    }
}

