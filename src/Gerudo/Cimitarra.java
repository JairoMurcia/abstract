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
public class Cimitarra extends Arma_gerudo {

    public Cimitarra(){
        this.descripcion="<html><body>Arma pesada que requiere de <br>"
                + "gran fuerza para ser usada</body></html>";
    }
    
    public String get_arma() {
        return "/image/arma/cimitarra.png";
    }
    
}
