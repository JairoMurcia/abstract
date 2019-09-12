/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Arma_hyliana;
import clase_abstractas.Articulo_hyliano;
import clase_abstractas.Escudo_hyliano;
import clase_abstractas.Fabrica_personaje;

import clase_abstractas.Personaje;

/**
 *
 * @author jairo
 */
public class Fabrica_personajeh extends Fabrica_personaje{

   
   

    @Override
    public Personaje get_personaje() {
        return new Hyliano();
    }

   
    
    
    
}
