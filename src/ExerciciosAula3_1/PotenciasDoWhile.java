/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_1;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class PotenciasDoWhile {
    public static void main(String[] args) {
         int i =0;
         int potencia = 1;
         
         int base = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero.:"));
         int exp = Integer.valueOf(JOptionPane.showInputDialog("Digite um expoente.:"));
         
         
               
         do{
                   
             potencia = potencia * base;
             i++;
         }while(i < exp);
         
         System.out.println("Resultado.:"+ potencia);
    
    }
}
