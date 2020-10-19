/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     * 
     * Crea una nueva sublcase de Barco llamada BarcoDeMercancias
     * 
     * Crea una nueva sublcase o más de BarcoDeMercancias llamada Carguero
     * 
     */
    public static void main(String[] args) {
        // Prueba to código aquí
        
        Barco barco1 = new Yate(true, 4, 6, new Motor(1000), 20.0, 12.5, 23, 7);
        barco1.arranca();
        
        Barco barco2 = new PortaAviones(new Motor(6000), 75, 46, 250, 60_000, 35);
        barco2.arranca();
        
        System.out.println(barco1 instanceof PortaAviones);
        
        Barco barco3 = new Carguero(true , new Motor(4500), 217.00, 30.58, 400, 50_000, "La mercancia corresponde a una carga de material de oficina almacenada en contenedores");
        barco3.arranca();
         
        Barco barco4 = new Granelero("Minerales", true, new Motor(8000), 335.07, 42.87, 800, 70_000, "En este Granelero transportaremos minerales valiosos que posteriormente se tasarán por un experto y se subastarán, consta de bodegas reforzadas para proteger la mercancía");
        barco4.arranca();
        
        Barco barco5 = new PortaContenedores(200, new Motor(9000), 400.00, 59.00, 750, 72_000, "En el PortaContenedores se transportarán todo tipo de mercancias de producto español para exportar al mercado chino y ruso para así expandir el producto nacional a otras regiones del mundo");
        barco5.arranca();
        
        System.out.println(barco3 instanceof BarcoDeMercancias);
        
        /*CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        try {
            cc1.ingresa(123.09);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(cc1);
        try {
            cc1.abona(98.87);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(cc1);
        
        Cuadrado c1;
        try {
            c1 = new Cuadrado(9);
            System.out.println(c1);
            System.out.println(c1.area());
            System.out.println(c1.perimetro());
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        
        Triangulo t1;
        try {
            t1 = new Triangulo(12,15);
            System.out.println(t1);
            System.out.println(t1.area());
            System.out.println(t1.perimetro());
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
      
    }
    
}
