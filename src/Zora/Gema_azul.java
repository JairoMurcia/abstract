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
public class Gema_azul extends Articulo_zora {

    public Gema_azul(){
        this.descripcion="<html><body>Este articulo permite<br> volverte inivsible</body></html>";
    }
    public String get_articulo() {
         return "/image/arti/gema_azul.png";
    }
    
}
