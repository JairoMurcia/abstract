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
public class Casco_trueno extends Articulo_gerudo{

    public Casco_trueno(){
        this.descripcion="Casco que bloquea cualquier ataque de magia";
    }
    public String get_articulo() {
        return "/image/articulo/gerudo/casco.png";
    }
    
}
