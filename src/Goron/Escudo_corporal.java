/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Escudo_goron;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Escudo_corporal extends Escudo_goron {

    public Escudo_corporal(){
        this.descripcion="<html><body>Escudo que consta del caparazon<br>"
                + "en la espalda del goron,en este estado es casi invulnerable<br>"
                + "pero es incapaz de moverse</html></body>";
    }
    public String get_escudo() {
        return "/image/escudo/escudo_corporal.png";
    }
    
}
