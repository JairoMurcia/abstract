/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Articulo_hyliano;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Guantes extends Articulo_hyliano{

    public Guantes(){
        this.descripcion="<html><body>Articulo que aumenta<br> la fuerza fisica de su portador</body></html>";
    }
    
    public String get_articulo() {
        return "/image/arti/guantes.png";
    }
    
}
