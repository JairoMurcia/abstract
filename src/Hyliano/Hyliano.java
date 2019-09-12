/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hyliano;

import clase_abstractas.Arma_hyliana;
import clase_abstractas.Articulo_hyliano;
import clase_abstractas.Escudo_hyliano;
import clase_abstractas.Personaje;
import clase_abstractas.Personaje;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Hyliano extends Personaje {
    private Arma_hyliana arma;
    private Escudo_hyliano escudo;
    private Articulo_hyliano articulo;

    public Hyliano() {
        this.arma = arma;
        this.escudo = escudo;
        this.articulo = articulo;
        this.descripcion="<html><body>Raza de humanoides bastante longeva<br>"
                + "su fuerza fisica es la equivalente a la humana,lo conpensan<br>"
                + "con su manejo de magia</html></body>";
    }

   

    public Arma_hyliana getArma() {
        return arma;
    }

    public Escudo_hyliano getEscudo() {
        return escudo;
    }

    public Articulo_hyliano getArticulo() {
        return articulo;
    }

    public void setArma(Arma_hyliana arma) {
        this.arma = arma;
    }

    public void setEscudo(Escudo_hyliano escudo) {
        this.escudo = escudo;
    }

    public void setArticulo(Articulo_hyliano articulo) {
        this.articulo = articulo;
    }
    
    
    
    
    @Override
    public String get_cuerpo() {
        
        return "/image/cuerpo/hyliano.png";
    }
    
}
