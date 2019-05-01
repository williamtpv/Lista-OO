/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.notas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author futem
 */
public class Aluno {
    String nome;
    float n1, n2, n3, nf;
    
    public void Dados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        nome = teclado.nextLine();
        Random gerador = new Random();
        n1 = gerador.nextFloat()*10;
        n2 = gerador.nextFloat()*10;
        n3 = gerador.nextFloat()*10;
    }
    public void Calcn1(){
        n1 = n1;
    }
    public void Calcn2(){
        n2 = n2;
    }
    public void Calcn3(){
        n3 = n3;
    }
    public void Calcnf(){
        nf = ((n1*2)+(n2*3)+(n3*4))/9;
    }
    @Override
public String toString(){
    return "\nnome: " + nome + "; Notas (n1, n2, n3, nf: " +n1+"; " + n2+ "; " +n3+"; "+ nf;
}
}
