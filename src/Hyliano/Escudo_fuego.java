/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Escudo_hyliano;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Escudo_fuego extends Escudo_hyliano {

    public Escudo_fuego(){
        this.descripcion="<html><body>Escudo que permite aislar el calor,<br>por lo que cualquier ataque de fuego,lava o queme"
                + "<br>sera anulada</body></html>";
    }
            
   
    public String get_escudo() {
        return "/image/escudo/escudo_fuego.png";
    }
    
}
