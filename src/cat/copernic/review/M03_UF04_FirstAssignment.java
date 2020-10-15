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
     */
    public static void main(String[] args) {
        // Prueba to código aquí
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
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
        }
      
    }
    
}
