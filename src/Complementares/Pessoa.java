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
public class Pessoa {
    String nome;
    int idade;
    
    
    void fazAniversario(){
        this.idade++;
    }
    
    void Mostra(){
        JOptionPane.showMessageDialog(null,"Nome.: " + this.nome + "  "+ "Idade.: " + this.idade);
    }
    
}
