/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrecaoaritimetica;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author futem
 */
public class ProgrecaoAritimetica {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        int m = 0;
        while(m == 0){
            Dados data = new Dados();
            data.Dados();
            switch (data.tipo){
                case 0:
                    Aritimetica prog = new Aritimetica();
                    prog.a0 = data.a0;
                    prog.r = data.r;
                    prog.an = data.an;
                    prog.calcProg();
                    lista.add(prog);
                    break;
                case 1:
                    Geometrica prog2 = new Geometrica();
                    prog2.a0 = data.a0;
                    prog2.r = data.r;
                    prog2.an = data.an;
                    prog2.calcProg2();
                    lista.add(prog2);
                    break;
            }
            m = JOptionPane.showConfirmDialog(null,"Deseja fazer outra progressão?",
                "Progressão",JOptionPane.YES_NO_OPTION);
            System.out.println(m);
        }
        int x = JOptionPane.showConfirmDialog(null,"Deseja imprimir as progreções?",
                "Progressão",JOptionPane.YES_NO_OPTION);
        if(x==0){
            JOptionPane.showMessageDialog(null, lista);
        }
        System.out.println(lista);
    }
}