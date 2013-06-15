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
public class CemVezesWhile {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog("Entre com seu nome");
         
         int i =0;
         while(i<100){
             
             System.out.println("Seu nome é.:"+ nome + ".: " + i);
             i++;
       } 
                              
    }
    
}
