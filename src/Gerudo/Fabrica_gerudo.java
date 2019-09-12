/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Arma;
import clase_abstractas.Arma_gerudo;
import clase_abstractas.Articulo_gerudo;
import clase_abstractas.Fabrica_personaje;
import clase_abstractas.Personaje;

/**
 *
 * @author jairo
 */
public class Fabrica_gerudo extends Fabrica_personaje{
    private Gerudo g;
    private Arma_gerudo ag;
    private Articulo_gerudo arg;
    
    
    
    
    public Personaje get_personaje() {
        
        g=new Gerudo(ag,arg);
        return g;
        
    }
    
    
    
    
}
