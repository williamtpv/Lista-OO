/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.conta;

import javax.swing.JOptionPane;

/**
 *
 * @author futem
 */
public class Conta {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente novaconta = new ContaCorrente();
        novaconta.CriaConta();
        Object[] options = {"Despósito","Saque", "Não"};
        int m = (int) 1;
        while(m ==1){
            int tipo = JOptionPane.showOptionDialog(null,
                    "Deseja realizar alguma operação?","Operação",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            switch(tipo){
                case 0:
                    float a = Float.parseFloat(JOptionPane.showInputDialog("Quanto "
                       + "deseja depositar?"));
                    novaconta.Deposito(a);
                    break;
                case 1:
                    a = Float.parseFloat(JOptionPane.showInputDialog("Quanto "
                        + "deseja sacar?"));
                    novaconta.Saque(a);
                    break;
                case 2:
                    m = 0;
                    break;
            }
            novaconta.ImprimeSaldo();
        }
        String mensagem = "Informações \n" + "Titular: " + novaconta.nome 
                + "\nNúmero da conta: " + novaconta.num + "\nSaldo: " 
                + novaconta.saldo;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
