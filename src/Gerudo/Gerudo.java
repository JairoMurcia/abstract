/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerudo;

import clase_abstractas.Arma;
import clase_abstractas.Arma_gerudo;
import clase_abstractas.Articulo_gerudo;
import clase_abstractas.Personaje;


/**
 *
 * @author jairo
 */
public class Gerudo extends Personaje{
    private Arma_gerudo arma;
    private Articulo_gerudo articulo;

    public Gerudo(Arma_gerudo arma, Articulo_gerudo articulo) {
        this.arma = arma;
        this.articulo = articulo;
        this.descripcion="<html><body>Raza conformada solo por mujeres,<br>"
                + "usualmente fuertes y altas,su estilo de pelea no usa<br>"
                + "escudos</html></body>";
    }

    public Arma_gerudo getArma() {
        return arma;
    }

    public Articulo_gerudo getArticulo() {
        return articulo;
    }

    public void setArma(Arma_gerudo arma) {
        this.arma = arma;
    }

    public void setArticulo(Articulo_gerudo articulo) {
        this.articulo = articulo;
    }
    
    
    
    
    @Override
    public String get_cuerpo() {
         return "/image/cuerpo/gerudo.png";
    }

   
    
}
