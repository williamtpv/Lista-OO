/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrecaoaritimetica;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author futem
 */
public class Aritimetica {
    float a0, r;
    int an;
    float P[];
    public void calcProg(){
        
        P = new float[an];
        P[0]=a0;
        for(int i =1; i< an;i++){
            P[i]= r + P[i-1];
        }
    }
    @Override
public String toString(){
    return "Progressão aritimética: " + Arrays.toString(P);
}
}
