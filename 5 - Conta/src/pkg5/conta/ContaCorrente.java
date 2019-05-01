package pkg5.conta;


import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author futem
 */
public class ContaCorrente {
    float saldo;
    int num, var;
    String nome;
    public void CriaConta(){
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                + "o número da conta"));
        var = JOptionPane.showConfirmDialog(null,"Deseja realizar um deposito "
                + "inicial?");
        if(var == 0){
            saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor"
                    + " do deposito inicial:"));
        }
    }
    public float Deposito(float a){
        return saldo = saldo + a;
    }
    public float Saque(float a){
        return saldo = saldo - a;
    }
    public void ImprimeSaldo(){
        JOptionPane.showMessageDialog(null,"Seu saldo atual é de: "+ saldo);
    }
}