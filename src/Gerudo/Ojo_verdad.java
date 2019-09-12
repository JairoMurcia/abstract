/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Articulo_gerudo;


/**
 *
 * @author jairo
 */
public class Ojo_verdad extends Articulo_gerudo {

    public Ojo_verdad(){
        this.descripcion="<html><body>Articulo que permite<br>ver a traves de ilusiones</body></html>";
    }
    public String get_articulo() {
         return "/image/articulo/gerudo/ojo.png";
    }
    
}
