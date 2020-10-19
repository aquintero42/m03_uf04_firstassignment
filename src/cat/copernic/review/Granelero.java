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
 * Los graneleros son los barcos de mercancia encargados de transportar cargas secas a granel.
 * Utilizaremos dos variables, una variable tipo 'String' para conocer el tipo de mercancia que transportará
 * (cereales,minerales o cargas mixtas). La segunda variable será tipo 'boolean' y la declararemos 'true' en el caso
 * de que se transporten cargas pesadas para resistir golpes.
 * 
 */
public class Granelero extends BarcoDeMercancias {
    
    private String tipoMercancia;
    private boolean bodegasReforzadas;
    
    public Granelero(String tipoMercancia, boolean bodegasReforzadas, Motor motor, double eslora, double manga, int nudos, int peso, String descripcionMercancia) {
        super(motor, eslora, manga, nudos, peso, descripcionMercancia);
        this.tipoMercancia = tipoMercancia;
        this.bodegasReforzadas = bodegasReforzadas;
        this.nombre = "Granelero";
    }
    
}
