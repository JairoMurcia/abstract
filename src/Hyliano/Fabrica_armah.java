/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Arma;
import clase_abstractas.Arma_hyliana;
import clase_abstractas.Fabrica_arma;

/**
 *
 * @author jairo
 */
public class Fabrica_armah extends Fabrica_arma{

   
    public Arma get_arma(String tipo) {
        Arma_hyliana ah=null;
        switch(tipo){
            case("espada"):
                ah=new Espada();
                break;
            case("arco"):{
                ah=new Arco();
            }    
            default:
                break;
        }
        
        return ah;
    }
    
    
}
