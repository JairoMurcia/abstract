/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Articulo;
import clase_abstractas.Articulo_hyliano;
import clase_abstractas.Fabrica_articulo;

/**
 *
 * @author jairo
 */
public class Fabricah_articulo extends Fabrica_articulo{

    
    public Articulo get_articulo(String tipo) {
       Articulo_hyliano ah=null;
       
       switch(tipo){
           case "guantes":
               ah=new Guantes();
               break;
           default:
               break;
       }
       
       return ah; 
    }
    
    
    
}
