/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import com.sun.glass.ui.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Carlos
 */
public class ExButton extends BasicButtonUI{
    private static ColorUI colorUI;
    private Font fuente;
    private Border border;
    public ExButton(ColorUI colorUI, int size) {
        this.colorUI = colorUI;
        fuente = new Font("Segoe UI", Font.BOLD, size);
        border = BorderFactory.createLineBorder(this.colorUI.getColorTerciario(), 2);
    }
    
    public ExButton(ColorUI colorUI) {
        this.colorUI = colorUI;
        fuente = new Font("Segoe UI", Font.BOLD, 18);
        border = BorderFactory.createLineBorder(this.colorUI.getColorTerciario(), 2);
    }

    public ExButton(ColorUI colorUI, Font fuente, Border border) {
        this.colorUI = colorUI;
        this.fuente = fuente;
        this.border = border;
    }
    
    
    public static ButtonUI createUI(JComponent c){
        return new ExButton(colorUI);
    }

    public static ColorUI getColorUI() {
        return colorUI;
    }

    public static void setColorUI(ColorUI aColorUI) {
        colorUI = aColorUI;
    }
    
    public void modificarBoton(JButton bt){
        bt.setFont(fuente);
        bt.setBackground(this.colorUI.getColorFondo());
        bt.setBackground(this.colorUI.getColorForeground());
        bt.setBorder(border);
        bt.setCursor(new java.awt.Cursor(Cursor.CURSOR_POINTING_HAND));
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }
    
    
}
