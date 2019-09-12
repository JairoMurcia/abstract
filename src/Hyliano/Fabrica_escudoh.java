/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Escudo;
import clase_abstractas.Escudo_hyliano;
import clase_abstractas.Fabrica_escudo;

/**
 *
 * @author jairo
 */
public class Fabrica_escudoh extends Fabrica_escudo{

    
    public Escudo get_escudo(String tipo) {
        Escudo_hyliano es=null;
        switch(tipo){
            case "escudo espejo":
                es=new Escudo_espejo();
                break;
            case "escudo de fuego":
                es=new Escudo_fuego();
                break;
            default:
                break;
        }
        return es;
    }
    
}
