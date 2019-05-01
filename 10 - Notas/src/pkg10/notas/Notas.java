/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.notas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author futem
 */
public class Notas {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Turma turmaA = new Turma();
        Turma turmaB = new Turma();
        turmaA.numeroAlunos();
        for(int i = 0; i<turmaA.num;i++ ){
            Aluno aluno = new Aluno();
            aluno.Dados();
            aluno.Calcn1();
            aluno.Calcn2();
            aluno.Calcn3();
            aluno.Calcnf();
            turmaA.cadastraAluno(aluno);
        }
        turmaB.numeroAlunos();
        for(int i = 0; i<turmaB.num;i++ ){
            Aluno aluno = new Aluno();
            aluno.Dados();
            aluno.Calcn1();
            aluno.Calcn2();
            aluno.Calcn3();
            aluno.Calcnf();
            turmaB.cadastraAluno(aluno);
        }
        System.out.println(turmaA.alunos);
        System.out.println(turmaB.alunos);
    }
}
