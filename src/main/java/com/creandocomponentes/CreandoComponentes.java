/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.creandocomponentes;

import java.awt.Graphics;
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

    private Optional<File> rutaImagen;
    
    public CreandoComponentes() {
        this.rutaImagen = Optional.empty();
    }

    public File getRutaImagen() {
        return this.rutaImagen.orElse(null);
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = Optional.ofNullable(rutaImagen);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        this.rutaImagen.filter( file -> file.exists() )
        .ifPresent(file -> {
            ImageIcon img = new ImageIcon(file.getAbsolutePath());
            g.drawImage(img.getImage(), 0, 0, null);
        });
//        if (this.rutaImagen!=null  &&  this.rutaImagen.exists()) {
//            ImageIcon img = new ImageIcon(this.rutaImagen.getAbsolutePath());
//            g.drawImage(img.getImage(), 0, 0, null);
//        }
    }

    
}
