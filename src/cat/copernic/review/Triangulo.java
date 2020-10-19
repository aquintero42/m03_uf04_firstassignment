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
public class Triangulo {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws Exception {
        if (base <= 0) throw new ParametroNoPositivoException("La base tiene que ser positiva: " + base);
        this.base = base;
        if (altura <= 0) throw new Exception("La altura tiene que ser positiva: " + altura);
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo: " + "Base = " + base + ", Altura = " + altura;
    }
    
    // Devuelve el área de este triángulo 'base' multiplicado por 'altura' partido por 2
    public double area() {
        return (base*altura)/2;
    }
    
    public double perimetro() {
        return calcHipotenusa()*2 + base;
    }
    
    public double calcHipotenusa() {
        return Math.sqrt( Math.pow(base / 2, 2.0) + Math.pow(altura, 2.0));
    }
    
}
