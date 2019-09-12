/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Articulo;
import clase_abstractas.Articulo_gerudo;
import clase_abstractas.Fabrica_articulo;

/**
 *
 * @author jairo
 */
public class Fabrica_articuloge extends Fabrica_articulo {

   
    public Articulo get_articulo(String tipo) {
        Articulo_gerudo ag=null;
        if(tipo.equals("casco trueno")){
            ag=new Casco_trueno();
        }
        if(tipo.equals("ojo de la verdad")){
            ag=new Ojo_verdad();
        }
        
        return ag;
    }
    
}
