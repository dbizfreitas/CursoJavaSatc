/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class NotasJOptionPane {
   public static void main(String[] args) {
    
        double nota1 = Double.valueOf(JOptionPane.showInputDialog("Digite a primeira nota.:"));
                
        double nota2 = Double.valueOf(JOptionPane.showInputDialog("Digite a segunda nota.:"));
        
        double nota3 = Double.valueOf(JOptionPane.showInputDialog("Digite a terceira nota.:"));
        
        
        double media = (nota1 + nota2 + nota3) /3;
        
        String resultado = (media >= 6.0)? ":-)":":-(";
        
        JOptionPane.showMessageDialog(null,"Média.:" + media +" " + resultado );
   }
}
