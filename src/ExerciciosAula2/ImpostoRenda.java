/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula2;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class ImpostoRenda {
    
    public static void main(String[] args) {
      
      double renda = Double.valueOf(JOptionPane.showInputDialog("Entre com a renda mensal"));
               
      if (renda <= 1164.00){
        JOptionPane.showMessageDialog(null,"Isento de imposto de renda");
      }else if (renda >= 1164.01 && renda <= 2300){
        JOptionPane.showMessageDialog(null,"15%");
      }else {
        JOptionPane.showMessageDialog(null,"27%");  
      }
    }
}
