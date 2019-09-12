/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Arma_zora;


/**
 *
 * @author jairo
 */
public class Tridente extends Arma_zora{

    public Tridente(){
        this.descripcion="<html><body>Arma especializada<br>para ataques rapidos</body></html>";
    }
    public String get_arma() {
         return "/image/arma/tridente.png";
    }
    
}
