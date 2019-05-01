/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.triangulos;

import java.util.Scanner;

/**
 *
 * @author futem
 */
public class ComparadordeTriangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        System.out.println("Digite a aresta do Triangulo 1");
        t1.lado = teclado.nextFloat();
        System.out.println("Digite a aresta do Triangulo 2");
        t2.lado = teclado .nextFloat();
        t1.area = t1.calcArea();
        t2.area = t2.calcArea();
        t1.comparaArea(t1.area, t2.area);
    }
    
}
