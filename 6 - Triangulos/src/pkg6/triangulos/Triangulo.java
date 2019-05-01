/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.triangulos;

/**
 *
 * @author futem
 */
public class Triangulo {
    float lado;
    float area;
    float var;
    
    public float calcArea(){
        return lado*lado/2;
    }
    public void comparaArea(float a, float b){
        var = (a - b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(var);
        if(var > 0){
            System.out.println("O Triangulo 1 é maior!");
        }
        if(var ==0){
            System.out.println("Os triangulos são iguais");
        }
        if(var<0){
            System.out.println("O Triangulo 2 é maior");
        }
    }
}
