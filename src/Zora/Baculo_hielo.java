/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Articulo_zora;


/**
 *
 * @author jairo
 */
public class Baculo_hielo extends Articulo_zora {
    
    public Baculo_hielo(){
        this.descripcion="<html><body>herramienta que arroja un flujo de magia<br>que baja las temperaturas de lo que<br>"
                + "toca</body></html>";
    }
   
    public String get_articulo() {
         return "/image/arti/baculo_hielo.png";
    }
    
}
