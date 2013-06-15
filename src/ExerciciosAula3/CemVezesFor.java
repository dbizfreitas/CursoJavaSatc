/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class CemVezesFor {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog("Entre com seu nome");
         
         for (int i = 0; i < 100; i++) {
            
           System.out.println("Seu nome é.:"+ nome + ".: " + i);
         }    
   } 
    
}
