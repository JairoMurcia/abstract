/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Articulo;
import clase_abstractas.Articulo_zora;
import clase_abstractas.Fabrica_articulo;

/**
 *
 * @author jairo
 */
public class Fabrica_articuloz extends Fabrica_articulo{

    
    public Articulo get_articulo(String tipo) {
        Articulo_zora az=null;
        switch(tipo){
            case"gema azul":
                az=new Gema_azul();
                break;
            case "baculo de hielo":
                az=new Baculo_hielo();
            default:
                break;
        }
        
        return az;
    }
    
}
