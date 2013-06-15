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
public class PotenciasWhile {
    public static void main(String[] args) {
          double numero = Double.valueOf(JOptionPane.showInputDialog("Digite um numero.:"));
          double exp = Double.valueOf(JOptionPane.showInputDialog("Digite um expoente.:"));
         
         int i =0;
         while(i<=100){
             
             System.out.println("Seu nome é.:"+ numero + ".: " + i);
             i++;
       } 
                              
    }
    
}
