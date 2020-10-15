/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author Adrian
 */
public class Cuadrado {
    
    private double lado;

    public Cuadrado(double lado) throws Exception {
        if (lado <= 0) throw new Exception("El lado tiene que ser positivo" + lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: " + "Lado = " + lado;
    }
   
    // Devuelve el area de este cuadrado lado*lado
    public double area() {
        return Math.pow(lado,2.0);
    }
    
    // Devuelve el valor del perimetro de este cuadrado 4 * lado
    public double perimetro() {
        return lado*4.0;
    }
    
}
