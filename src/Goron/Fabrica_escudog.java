/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Escudo;
import clase_abstractas.Escudo_goron;
import clase_abstractas.Fabrica_escudo;

/**
 *
 * @author jairo
 */
public class Fabrica_escudog extends Fabrica_escudo {

    
    public Escudo get_escudo(String tipo) {
        Escudo_goron e=null;
        switch(tipo){
            case "escudo corporal":
                e=new Escudo_corporal();
                break;
            case "escudo daruk":
                e=new Escudo_daruk();
                break;
            default:
                break;
                
        }
        return e;
    }
    
    
    
}
