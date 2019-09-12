/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Arma_zora;
import clase_abstractas.Articulo_zora;
import clase_abstractas.Fabrica_personaje;
import clase_abstractas.Personaje;

/**
 *
 * @author jairo
 */
public class Fabrica_zora extends Fabrica_personaje {
    
    Arma_zora arma;
    Articulo_zora articulo;
    public Personaje get_personaje() {
       return new Zora(arma,articulo);
    }
    
    
    
}
