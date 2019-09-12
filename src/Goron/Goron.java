/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goron;

import clase_abstractas.Arma_goron;
import clase_abstractas.Articulo_goron;
import clase_abstractas.Escudo_goron;
import clase_abstractas.Personaje;
import javax.swing.ImageIcon;

/**
 *
 * @author jairo
 */
public class Goron  extends Personaje{
    private Arma_goron arma;
    private Escudo_goron escudo;
    private Articulo_goron articulo;

    public Goron(Arma_goron arma, Escudo_goron escudo, Articulo_goron articulo) {
        this.arma = arma;
        this.escudo = escudo;
        this.articulo = articulo;
        this.descripcion="<html><body>Una raza de humanoides que son bastantes<br>"
                + "fuertes fisicamente,aunque bastante lentos,son capaces<br>"
                + "de soportar temperaturas extremas,pero son incapaces de nadar</html></body>";
    }

    public Arma_goron getArma() {
        return arma;
    }

    public Escudo_goron getEscudo() {
        return escudo;
    }

    public Articulo_goron getArticulo() {
        return articulo;
    }

    public void setArma(Arma_goron arma) {
        this.arma = arma;
    }

    public void setEscudo(Escudo_goron escudo) {
        this.escudo = escudo;
    }

    public void setArticulo(Articulo_goron articulo) {
        this.articulo = articulo;
    }
    
    
    
    
    public String get_cuerpo() {
       return "/image/cuerpo/goron.png";
    }
    
}
