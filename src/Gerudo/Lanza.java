/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Arma_gerudo;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Lanza extends Arma_gerudo {

    public Lanza(){
        this.descripcion="<html><body>Arma pesada lenta <br>pero con buen alcance</body></html>";
    }
    public String get_arma() {
         return "/image/arma/lanza.png";
    }
    
}
