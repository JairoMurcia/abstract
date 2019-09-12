/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Articulo_goron;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Bomba extends Articulo_goron{
    
    public Bomba(){
        this.descripcion="Explosivo de gran poder y bastante pesado";
    }
    
    public String get_articulo() {
        return "/image/arti/bomba.png";
    }
    
}
