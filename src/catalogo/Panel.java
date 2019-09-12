/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

/**
 *
 * @author jairo
 */
public class Panel extends JPanel{
    String ruta;
    
    public Panel(String ruta){
        this.ruta=ruta;
        
        repaint();
    }
    public void paint(Graphics g){
         Dimension tamanio = getSize();

         ImageIcon imagenFondo = new ImageIcon(getClass().getResource(this.ruta));        
         g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
         setOpaque(false);
         setBackground(Color.BLACK);
         super.paintComponent(g);

    }
}
