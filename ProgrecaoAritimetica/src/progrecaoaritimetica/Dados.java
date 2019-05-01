/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrecaoaritimetica;

import javax.swing.JOptionPane;

/**
 *
 * @author futem
 */

public class Dados {
    String end, inicio, razao;
    int n, an, tipo,m;
    float a0, r;
    String options[];
    
    
    public void Dados(){
        m=1;
        Object[] options = { "Aritimética", "Geométrica"};
        tipo = JOptionPane.showOptionDialog(null, "Escolha um tipo de progressão:",
               "Aviso",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
               null, options, options[0]);
        inicio = JOptionPane.showInputDialog("Escolha o valor inicial: ");
        end = JOptionPane.showInputDialog("Escolha o numero de termos: ");
        razao = JOptionPane.showInputDialog("Escolha a razão: ");
        
        r = Float.parseFloat(razao);
        an = Integer.parseInt(end);
        a0 = Float.parseFloat(inicio);
    }
}