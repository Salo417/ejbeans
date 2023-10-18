/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.creandocomponentes;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.JPanel;
import java.io.File;
import java.util.Optional;
import javax.swing.ImageIcon;

/**
 *
 * @author sersu
 */
public class CreandoComponentes extends JPanel implements Serializable {

    private ImagenFondo imagenFondo;
    //private Optional<File> rutaImagen;
    
    public CreandoComponentes() {
        //this.rutaImagen = Optional.empty();
    }

//    public File getRutaImagen() {
//        return this.rutaImagen.orElse(null);
//    }
//
//    public void setRutaImagen(File rutaImagen) {
//        this.rutaImagen = Optional.ofNullable(rutaImagen);
//    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (this.imagenFondo!=null) {
              if (this.imagenFondo.getRutaImagen()!=null  &&  this.imagenFondo.getRutaImagen().exists() ) {
                ImageIcon img = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D)g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                g.drawImage(img.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
              } 
        }
        
        //            this.rutaImagen.filter( file -> file.exists() )
//            .ifPresent(file -> {
//                ImageIcon img = new ImageIcon(file.getAbsolutePath());
//                Graphics2D g2d = (Graphics2D)g;
//                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
//                g.drawImage(img.getImage(), 0, 0, null);
//                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
//            });
    }

    
}
