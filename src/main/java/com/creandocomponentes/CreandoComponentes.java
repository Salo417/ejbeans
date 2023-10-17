/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.creandocomponentes;

import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author sersu
 */
public class CreandoComponentes extends JPanel implements Serializable {

    private String rutaImagen;
    
    public CreandoComponentes() {
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    
}
