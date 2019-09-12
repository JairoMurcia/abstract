/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Arma;
import clase_abstractas.Arma_gerudo;
import clase_abstractas.Fabrica_arma;

/**
 *
 * @author jairo
 */
public class Fabrica_armasg extends Fabrica_arma {

    
    public Arma get_arma(String tipo) {
        Arma_gerudo c=null;
        if(tipo.equals("cimitarra")){
           c=new Cimitarra();
        }
        if(tipo.equals("lanza")){
            c=new Lanza();
        }
        return c;
    }
    
}
