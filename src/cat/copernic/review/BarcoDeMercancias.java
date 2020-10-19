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
public abstract class BarcoDeMercancias extends Barco {
    
    private String descripcionMercancia;
    
    public BarcoDeMercancias(Motor motor, double eslora, double manga, int nudos, int peso, String descripcionMercancia) {
        super(motor, eslora, manga, nudos, peso);
        this.descripcionMercancia = descripcionMercancia;
    }
    
    @Override
    public void arranca() {
        System.out.println("Arrancando barco de mercancias...");
    }
    
    @Override
    public void atraca() {
        System.out.println("Atracando barco de mercancias...");
    }
    
    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco de forma escalonada y tomando todas las medidas y precauciones posibles.");
    }

    @Override
    public void comportamiento() {
        System.out.println("Se intentará salvar la mayor cantidad de mercancia posible");
    }    
    
}
