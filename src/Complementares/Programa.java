/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementares;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class Programa {
    public static void main (String[]args){
        Pessoa objPessoa = new Pessoa();
        
       objPessoa.nome = JOptionPane.showInputDialog("Informe o nome.:");
       
       objPessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade.:")) ;
        
        
        objPessoa.fazAniversario();
        
        
        objPessoa.Mostra();
        
        
    }
    
}
