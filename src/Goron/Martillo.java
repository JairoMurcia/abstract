/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Arma_goron;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Martillo extends Arma_goron{

    public Martillo(){
        this.descripcion="Arma pesadaque requiere gran fuerza para usarse";
    }
    public String get_arma() {
        return "/image/arma/martillo.png";
    }
    
}
