/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Arma;
import clase_abstractas.Arma_zora;
import clase_abstractas.Fabrica_arma;

/**
 *
 * @author jairo
 */
public class Fabrica_armaz extends Fabrica_arma {

    
    public Arma get_arma(String tipo) {
        Arma_zora az=null;
        switch(tipo){
            case"tridente":
                az=new Tridente();
                break;
            case "cuchillas":
                az=new Cuchillas();
                break;
            default:
                break;
        }
        
        return az;
    }
    
    
}
