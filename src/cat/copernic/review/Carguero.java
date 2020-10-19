/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author Adrian
 * 
 * Utilizaremos una variable tipo boolean para diferenciar la mercancia entre contenedores y carga sólida a granel.
 * En el caso de que la variable sea 'true' el carguero transportará contenedores
 * En el caso de que la varaible sea 'false' el carguero tranportará carga sólida a granel
 * 
 */
public class Carguero extends BarcoDeMercancias {
    
    private boolean transporteContenedores;
    
    public Carguero(boolean transporteContenedores,Motor motor, double eslora, double manga, int nudos, int peso, String descripcionMercancia) {
        super(motor, eslora, manga, nudos, peso, descripcionMercancia);
        this.transporteContenedores = transporteContenedores;
        this.nombre = "Carguero";
    }
    
}
