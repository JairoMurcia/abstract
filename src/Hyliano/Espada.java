/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;


import clase_abstractas.Arma_hyliana;


/**
 *
 * @author jairo
 */
public class Espada extends Arma_hyliana {

    public Espada(){
        this.descripcion="<html><body>Arma de medio alcance de facil<br>"
                + "maniobrabilidad,es capas de rechazar algunos tipos de magia</body></html>";
    }
    
    public String get_arma() {
        return "/image/arma/espada.png";
    }
    
}
