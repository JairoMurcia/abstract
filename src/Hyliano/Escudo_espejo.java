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
public class Escudo_espejo extends Escudo_hyliano {

    public Escudo_espejo(){
        this.descripcion="<html><body>Es un escudo capas de reflejar<br>"
                + "magia de luz,electricidad </html></body>";
    }
    
    public String get_escudo() {
        return "/image/escudo/escudo_espejo.png";
    }
    
}
