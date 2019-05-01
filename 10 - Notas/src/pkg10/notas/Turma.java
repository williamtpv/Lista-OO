/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.notas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author futem
 */
public class Turma {
    ArrayList alunos = new ArrayList();
    int num;
    
    public void numeroAlunos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos você deseja cadastras nessa turma? ");
        num = teclado.nextInt();
    }
    
    public void cadastraAluno(Aluno a){
        alunos.add(a);
    }
}
