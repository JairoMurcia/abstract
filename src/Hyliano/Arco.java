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
public  class Arco extends Arma_hyliana{
    
    public Arco(){
        this.descripcion="<html><body>Arma de largo alcanze,se puede combinar<br> con cualquier tipo de magia</body></html>";
    }
    
    public String get_arma() {
       
        return "/image/arma/arco.png";
        
    }
    
    
}
