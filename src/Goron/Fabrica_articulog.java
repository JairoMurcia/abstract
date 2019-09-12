/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Articulo;
import clase_abstractas.Articulo_goron;
import clase_abstractas.Fabrica_articulo;

/**
 *
 * @author jairo
 */
public class Fabrica_articulog extends Fabrica_articulo {

    
    public Articulo get_articulo(String tipo) {
        Articulo_goron ag=null;
        if(tipo.equals("bomba")){
            ag=new Bomba();
        }
        
        return ag;
    }
    
}
