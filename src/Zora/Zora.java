/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zora;

import clase_abstractas.Arma_zora;
import clase_abstractas.Articulo_zora;
import clase_abstractas.Personaje;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Zora extends Personaje {
    private Arma_zora arma;
    private Articulo_zora Articulo;

    public Zora(Arma_zora arma, Articulo_zora Articulo) {
        this.arma = arma;
        this.Articulo = Articulo;
        this.descripcion="<html><body>Raza de anfibios humanoides que requieren de humedad para<br>"
                + "sobrevivir,aunque bastantes habiles en el agua y tierra,son bastantes debiles ante<br>"
                + "las altas temperaturas y ataques electricos</html></body>";
    }

    public Arma_zora getArma() {
        return arma;
    }

    public Articulo_zora getArticulo() {
        return Articulo;
    }

    public void setArma(Arma_zora arma) {
        this.arma = arma;
    }

    public void setArticulo(Articulo_zora Articulo) {
        this.Articulo = Articulo;
    }
    
    
    
    
   
    public String get_cuerpo() {
        return "/image/cuerpo/zora.png";
    }
    
}
