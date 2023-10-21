/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.creandocomponentes;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author sersu
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {

    private ImagenFondoPanel imgPanel = new ImagenFondoPanel();
    
    @Override
    public boolean supportsCustomEditor() { return true;}

    @Override
    public Component getCustomEditor() {
        return this.imgPanel;
    }

    @Override
    public String getJavaInitializationString() {
        String path = imgPanel.getSelectedValue().getRutaImagen().getAbsolutePath().replace("\\", "\\\\");
        Float opacidad = imgPanel.getSelectedValue().getOpacidad();
        
        return "new com.creandocomponentes.ImagenFondo(new java.io.File(\"" + path + "\"), " + opacidad + "f)";
    }

    @Override
    public Object getValue() {
        return this.imgPanel.getSelectedValue();
    }
    
}
