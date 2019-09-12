/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;


import Gerudo.Fabrica_armasg;
import Gerudo.Fabrica_articuloge;
import Gerudo.Fabrica_gerudo;
import Goron.Fabrica_armago;
import Goron.Fabrica_articulog;
import Goron.Fabrica_escudog;
import Goron.Fabrica_goron;
import Hyliano.Fabrica_armah;
import Hyliano.Fabrica_escudoh;
import Hyliano.Fabrica_personajeh;
import Hyliano.Fabricah_articulo;
import Zora.Fabrica_armaz;
import Zora.Fabrica_articuloz;
import Zora.Fabrica_zora;
import clase_abstractas.Arma;
import clase_abstractas.Articulo;
import clase_abstractas.Escudo;
import clase_abstractas.Fabrica_arma;
import clase_abstractas.Fabrica_articulo;
import clase_abstractas.Fabrica_escudo;
import clase_abstractas.Fabrica_personaje;
import clase_abstractas.Personaje;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author jairo
 */
public class Ventana extends JFrame implements ActionListener{
    
    Panel pers=new Panel("/image/cuerpo/hyliano.png");
    Panel arma=new Panel("/image/arma/espada.png");
    Panel escudo=new Panel("/image/escudo/escudo_espejo.png");
    Panel magia=new Panel("/image/arti/guantes.png");
    JButton bCSig=new JButton(">");
    JButton bCAnt=new JButton("<");
    
    JButton bASig=new JButton(">");
    JButton bAAnt=new JButton("<");
    
    JButton bESig=new JButton(">");
    JButton bEAnt=new JButton("<");
    
    JButton bArSig=new JButton(">");
    JButton bArAnt=new JButton("<");
    
    JLabel desArma=new JLabel("");
    JLabel desCuerpo=new JLabel("");
    JLabel desArticulo=new JLabel("");
    JLabel desEscudo=new JLabel("");
    String [] cuerpos={"hyliano","zora","goron","gerudo"};
    //cosas gerudo
    String [] arma_gerudo={"lanza","cimitarra"};
    String [] articulos_gerudo={"casco trueno","ojo de la verdad"};
    //cosas hylianas
    String [] arma_hyliano={"espada","arco"};
    String [] escudo_hyliano={"escudo espejo","escudo de fuego"};
    
    String [] articulo_hyliano={"guantes"};
    
    //cosas goron
    String [] arma_goron={"martillo"};
    
    String [] escudo_goron={"escudo corporal","escudo daruk"};
    String [] articulo_goron={"bomba"};
    
    //cosas zora
    String [] arma_zora={"cuchillas","tridente"};
    String [] articulo_zora={"gema azul","baculo de hielo"};
    
    int iCuerpo=0,iArma=0,iEscudo=0,iArt=0;
    
     Fabrica_personaje fp;
     Fabrica_arma fa;
     Fabrica_articulo far;
     Fabrica_escudo fe;
     Personaje p;
     Arma a;
     Escudo e;
     Articulo ar;
   
    public Ventana(){
        Container c=getContentPane();
        c.setLayout(null);
        Font newFont = new Font("Serif", Font.ROMAN_BASELINE, 13);
        desCuerpo.setFont(newFont);
        desArma.setFont(newFont);
        desEscudo.setFont(newFont);
        desArticulo.setFont(newFont);
        //parte del cuerpo
        c.add(pers);
        pers.setBounds(30,10,300,500);
        pers.repaint();
        c.add(bCSig);
        bCSig.setBounds(190,510,50,30);
        c.add(bCAnt);
        bCAnt.setBounds(140,510,50,30);
        c.add(desCuerpo);
        desCuerpo.setBounds(30,550,350,140);
        
        //armas
        c.add(arma);
        arma.setBounds(400,10,290,200);
        arma.repaint();
        c.add(bAAnt);
        bAAnt.setBounds(350,85,50,30);
        
        c.add(bASig);
        bASig.setBounds(700,85,50,30);
        
        c.add(desArma);
        desArma.setBounds(760,10,200,100);
        //escudo
        c.add(escudo);
        escudo.setBounds(400,220,290,200);
        escudo.repaint();
        c.add(desEscudo);
        desEscudo.setBounds(760,220,200,100);
        
        c.add(bEAnt);
        bEAnt.setBounds(350,295,50,30);
        
        c.add(bESig);
        bESig.setBounds(700,295,50,30);
        
        //articulos
        c.add(magia);
        magia.setBounds(400,430,290,200);
        magia.repaint();
        c.add(desArticulo);
        desArticulo.setBounds(760,430,200,100);
        setSize(1000,750);
        c.add(bArAnt);
        bArAnt.setBounds(350,505,50,30);
        
        c.add(bArSig);
        bArSig.setBounds(700,505,50,30);
        
        bCSig.addActionListener(this);
        bCAnt.addActionListener(this);
        
        bASig.addActionListener(this);
        bAAnt.addActionListener(this);
        
        bESig.addActionListener(this);
        bEAnt.addActionListener(this); 
        
        bArSig.addActionListener(this);
        bArAnt.addActionListener(this);
        
        fp=new Fabrica_personajeh();
        fa=new Fabrica_armah();
        fe=new Fabrica_escudoh();
        far=new Fabricah_articulo();
        
        a=fa.get_arma(arma_hyliano[iArma]);
        e=fe.get_escudo(escudo_hyliano[iEscudo]);
        ar=far.get_articulo(articulo_hyliano[iArt]);
        p=fp.get_personaje();
        
        escudo.ruta=e.get_escudo();
        desEscudo.setText(e.descripcion);
        escudo.repaint();
        
        pers.ruta=p.get_cuerpo();
        desCuerpo.setText(p.descripcion);
        pers.repaint();
        arma.ruta=a.get_arma();
        desArma.setText(a.descripcion);
        arma.repaint();
        magia.ruta=ar.get_articulo();
        desArticulo.setText(ar.descripcion);
        magia.repaint();
        
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    
    public void actionPerformed(ActionEvent ae) {
       
        
        if(ae.getSource().equals(this.bCSig)){
            if(iCuerpo==cuerpos.length-1){
                iCuerpo=0;
            }else{
                iCuerpo++;
            }
            iArma=0;
            iEscudo=0;
            iArt=0;
            
            gestion_cuerpo();
            
            
            
        }
         if(ae.getSource().equals(this.bCAnt)){
            if(iCuerpo==0){
                iCuerpo=cuerpos.length-1;
            }else{
                iCuerpo--;
            }
            iArma=0;
            iEscudo=0;
            iArt=0;
            
            gestion_cuerpo();
            
            
            
        }
         //cambio de arma 
         if(ae.getSource().equals(this.bAAnt)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iArma==0){
                     iArma=arma_hyliano.length-1;
                 }else{
                     iArma--;
                 }
                 fa=new Fabrica_armah();
                 
                 gestion_arma(arma_hyliano[iArma]);    
                 break;    
                 case "zora":
                 
                 if(iArma==0){
                     iArma=arma_zora.length-1;
                 }else{
                     iArma--;
                 }
                 fa=new Fabrica_armaz();
                 
                 gestion_arma(arma_zora[iArma]);        
                 break;    
                 case "gerudo":
                 if(iArma==0){
                     iArma=arma_gerudo.length-1;
                 }else{
                     iArma--;
                 }
                 fa=new Fabrica_armasg();
                 
                 gestion_arma(arma_gerudo[iArma]);    
                 break;
                 case "goron":
                 if(iArma==0){
                     iArma=arma_goron.length-1;
                 }else{
                     iArma--;
                 }
                 fa=new Fabrica_armago();
                 
                 gestion_arma(arma_goron[iArma]);    
                 break;    
                 default:
                         break;
                 
             }
         }
          if(ae.getSource().equals(this.bASig)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iArma==arma_hyliano.length-1){
                     iArma=0;
                 }else{
                     iArma++;
                 }
                 fa=new Fabrica_armah();
                 
                 gestion_arma(arma_hyliano[iArma]);    
                 break;    
                 case "zora":
                 
                 if(iArma==arma_zora.length-1){
                     iArma=0;
                 }else{
                     iArma++;
                 }
                 fa=new Fabrica_armaz();
                 
                 gestion_arma(arma_zora[iArma]);        
                 break;    
                 case "gerudo":
                 if(iArma==arma_gerudo.length-1){
                     iArma=0;
                 }else{
                     iArma++;
                 }
                 fa=new Fabrica_armasg();
                 
                 gestion_arma(arma_gerudo[iArma]);    
                 break;
                 case "goron":
                 if(iArma==arma_goron.length-1){
                     iArma=0;
                 }else{
                     iArma++;
                 }
                 fa=new Fabrica_armago();
                 
                 gestion_arma(arma_goron[iArma]);    
                 break;    
                 default:
                         break;
                 
             }
         }
             //cambio de escudo
             
             if(ae.getSource().equals(this.bEAnt)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iEscudo==0){
                     iEscudo=escudo_hyliano.length-1;
                 }else{
                     iEscudo--;
                 }
                 fe=new Fabrica_escudoh();
                 
                 gestion_escudo(escudo_hyliano[iEscudo]);    
                 break;    
                 case "zora":
                 
                       
                 break;    
                 case "gerudo":
                  
                 break;
                 case "goron":
                 if(iEscudo==0){
                     iEscudo=escudo_goron.length-1;
                 }else{
                     iEscudo--;
                 }
                 fe=new Fabrica_escudog();
                 
                 gestion_escudo(escudo_goron[iEscudo]);    
                 break;    
                 default:
                         break;
                 
             }
             
             
             
             
         }
         
         
         
          if(ae.getSource().equals(this.bESig)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iEscudo==escudo_hyliano.length-1){
                     iEscudo=0;
                 }else{
                     iEscudo++;
                 }
                 fe=new Fabrica_escudoh();
                 
                 gestion_escudo(escudo_hyliano[iEscudo]);    
                 break;    
                 case "zora":
                 
                       
                 break;    
                 case "gerudo":
                  
                 break;
                 case "goron":
                 if(iEscudo==escudo_goron.length-1){
                     iEscudo=0;
                 }else{
                     iEscudo++;
                 }
                 fe=new Fabrica_escudog();
                 
                 gestion_escudo(escudo_goron[iEscudo]);    
                 break;    
                 default:
                         break;
                 
             }
             
             
             
             
         }
          
          
          //cambio de complemento
          if(ae.getSource().equals(this.bArAnt)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iArt==0){
                     iArt=articulo_hyliano.length-1;
                 }else{
                     iArma--;
                 }
                 far=new Fabricah_articulo();
                 
                 gestion_articulo(articulo_hyliano[iArt]);    
                 break;    
                 case "zora":
                 
                 if(iArt==0){
                     iArt=articulo_zora.length-1;
                 }else{
                     iArt--;
                 }
                 far=new Fabrica_articuloz();
                 
                 gestion_articulo(articulo_zora[iArt]);        
                 break;    
                 case "gerudo":
                 if(iArt==0){
                     iArt=articulos_gerudo.length-1;
                 }else{
                     iArt--;
                 }
                 fa=new Fabrica_armasg();
                 
                 gestion_arma(articulos_gerudo[iArt]);    
                 break;
                 case "goron":
                 if(iArt==0){
                     iArt=articulo_goron.length-1;
                 }else{
                     iArt--;
                 }
                 fa=new Fabrica_armago();
                 
                 gestion_articulo(articulo_goron[iArt]);    
                 break;    
                 default:
                         break;
                 
             }
         }
          
          
         if(ae.getSource().equals(this.bArSig)){
             switch (cuerpos[iCuerpo]){
                 case "hyliano":
                 if(iArt==articulo_hyliano.length-1){
                     iArt=0;
                 }else{
                     iArma++;
                 }
                 far=new Fabricah_articulo();
                 
                 gestion_articulo(articulo_hyliano[iArt]);    
                 break;    
                 case "zora":
                 
                 if(iArt==articulo_zora.length-1){
                     iArt=0;
                 }else{
                     iArt++;
                 }
                 far=new Fabrica_articuloz();
                 
                 gestion_articulo(articulo_zora[iArt]);        
                 break;    
                 case "gerudo":
                 if(iArt==articulos_gerudo.length-1){
                     iArt=0;
                 }else{
                     iArt++;
                 }
                 far=new Fabrica_articuloge();
                 
                 gestion_articulo(articulos_gerudo[iArt]);    
                 break;
                 case "goron":
                 if(iArt==articulo_goron.length-1){
                     iArt=0;
                 }else{
                     iArt++;
                 }
                 far=new Fabrica_articulog();
                 
                 gestion_arma(articulo_goron[iArt]);    
                 break;    
                 default:
                         break;
                 
             }
         }
           
          
    }
    
    
    private void gestion_articulo(String tipo){
        ar=far.get_articulo(tipo);
        magia.ruta=ar.get_articulo();
        
        desArticulo.setText(ar.descripcion);
        magia.repaint();
    }
    
    private void gestion_escudo(String tipo){
        e=fe.get_escudo(tipo);
        escudo.ruta=e.get_escudo();
        System.out.println(e.get_escudo());
        desEscudo.setText(e.descripcion);
        escudo.repaint();
    }
    
    private void gestion_arma(String tipo){
        System.out.println(tipo);
        a=fa.get_arma(tipo);
        System.out.println(a.get_arma());
        arma.ruta=a.get_arma();
        desArma.setText(a.descripcion);
        arma.repaint();
    }
    private void gestion_cuerpo(){
        if(cuerpos[iCuerpo].equals("hyliano")){
            fp=new Fabrica_personajeh();
            fa=new Fabrica_armah();
            fe=new Fabrica_escudoh();
            far=new Fabricah_articulo();
            
            a=fa.get_arma(arma_hyliano[iArma]);
            e=fe.get_escudo(escudo_hyliano[iEscudo]);
            ar=far.get_articulo(articulo_hyliano[iArt]);
            p=fp.get_personaje();
            }else if (cuerpos[iCuerpo].equals("zora")){
                fp=new Fabrica_zora();
                fa=new Fabrica_armaz();
                
                far=new Fabrica_articuloz();
                
                a=fa.get_arma(arma_zora[iArma]);
               
                ar=far.get_articulo(articulo_zora[iArt]);
                p=fp.get_personaje();
            }else if(cuerpos[iCuerpo].equals("goron")){
                fp=new Fabrica_goron();
                fa=new Fabrica_armago();
                fe=new Fabrica_escudog();
                far=new Fabrica_articulog();
                p=fp.get_personaje();
                a=fa.get_arma(arma_goron[iArma]);
                e=fe.get_escudo(escudo_goron[iEscudo]);
                 ar=far.get_articulo(articulo_goron[iArt]);
            }else if(cuerpos[iCuerpo].equals("gerudo")){
                fp=new Fabrica_gerudo();
                fa=new Fabrica_armasg();
               
                far=new Fabrica_articuloge();
                p=fp.get_personaje();
               
                a=fa.get_arma(arma_gerudo[iArma]);
                System.out.println(a.get_arma());
                ar=far.get_articulo(articulos_gerudo[iArt]);
            }
        
        if(cuerpos[iCuerpo].equals("gerudo") || cuerpos[iCuerpo].equals("zora")){
            escudo.ruta="/image/arti/blanco.jpg";
            escudo.repaint();
            desEscudo.setText("");
            
        }else{
            escudo.ruta=e.get_escudo();
            desEscudo.setText(e.descripcion);
            escudo.repaint();
        }
        
       
        
        pers.ruta=p.get_cuerpo();
        desCuerpo.setText(p.descripcion);
        pers.repaint();
        arma.ruta=a.get_arma();
        desArma.setText(a.descripcion);
        arma.repaint();
        magia.ruta=ar.get_articulo();
        desArticulo.setText(ar.descripcion);
        magia.repaint();
    }
    
}
