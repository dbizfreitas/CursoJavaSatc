/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula5;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class Programa {
    public static void main (String[]args){
        Funcionario f1 = new Funcionario();
               
        f1.nome = JOptionPane.showInputDialog("Entre com nome do Funcionario.:");
        f1.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com Salario.:"));
        f1.recebeAumento(Double.parseDouble(JOptionPane.showInputDialog("Entre com almento.:")));
                     
        Funcionario f2 = new Funcionario();
               
        f2.nome = JOptionPane.showInputDialog("Entre com nome do Funcionario.:");
        f2.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com Salario.:"));
        f2.recebeAumento(Double.parseDouble(JOptionPane.showInputDialog("Entre com almento.:")));
        
        
        if (f1 == f2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
        
        
        f1.mostra();
        
    }
    
}
