/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Arma_goron;
import clase_abstractas.Articulo_goron;
import clase_abstractas.Escudo_goron;
import clase_abstractas.Fabrica_personaje;
import clase_abstractas.Personaje;

/**
 *
 * @author jairo
 */
public class Fabrica_goron extends Fabrica_personaje{
    Arma_goron arma;
    Escudo_goron escudo;
    Articulo_goron articulo;
    Goron g;
    public Personaje get_personaje() {
       g=new Goron(arma,escudo,articulo);
       return g;
    }
    
    
    
}
