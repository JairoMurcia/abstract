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
public class Escudo_daruk extends Escudo_goron {

    public Escudo_daruk(){
        this.descripcion="<html><body>Escudo que rodea el cuerpo ,permitiendo <br>"
                + "que el usuario se mueva,pero requiere magia</html></body>";
    }
    public String get_escudo() {
        return "/image/escudo/escudo_daruk.png";
    }
    
}
