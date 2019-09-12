/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Arma_zora;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public  class Cuchillas extends Arma_zora {

    public Cuchillas(){
        this.descripcion="<html><body>Arma cortante arrojadiza,su diseño "
                + "<br>le permite moverse bien tanto en el aire como en el agua</body></html>";
    }
    
    public String get_arma() {
        return  "/image/arma/cuchillas.png";
    }
    
}
