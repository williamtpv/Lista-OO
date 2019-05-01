/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.conversor;

import java.util.Scanner;

/**
 *
 * @author futem
 */
public class ConversordeMoeda {
    float cotacao,
          compra,
          valor,
          taxa;
    public void ConversordeMoeda(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a cotação atual do dolar?");
        cotacao = teclado.nextFloat();
        System.out.println(cotacao);
        System.out.println("Quanto você deseja comprar?");
        compra = teclado.nextFloat();
        taxa = (float) 1.06;
    }
    public float Calcula(){
        return cotacao*compra*taxa;
    }
}
