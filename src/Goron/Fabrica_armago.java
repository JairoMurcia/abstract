/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Arma;
import clase_abstractas.Arma_goron;
import clase_abstractas.Fabrica_arma;

/**
 *
 * @author jairo
 */
public class Fabrica_armago extends Fabrica_arma {

   
    public Arma get_arma(String tipo) {
        Arma_goron ag=null;
        if(tipo.equals("martillo")){
            ag=new Martillo();
        }
        return ag;
    }
    
}
