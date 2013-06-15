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
public class NumeroExtensoIf {
    public static void main(String[] args) {
        
        int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero.:"));
        
        if (numero == 1 )
            JOptionPane.showMessageDialog(null,"Um");
        else if (numero == 2 ) 
            JOptionPane.showMessageDialog(null,"Dois");
        else if (numero == 3 ) 
            JOptionPane.showMessageDialog(null,"Tres");
        else if (numero == 4 ) 
            JOptionPane.showMessageDialog(null,"Quatro");
        else if (numero == 5 ) 
            JOptionPane.showMessageDialog(null,"Cinco");
        else if (numero == 6 ) 
            JOptionPane.showMessageDialog(null,"Seis");
        else if (numero == 7 ) 
            JOptionPane.showMessageDialog(null,"Sete");
        else if (numero == 8 ) 
            JOptionPane.showMessageDialog(null,"Oito");
        else if (numero == 9 ) 
            JOptionPane.showMessageDialog(null,"Nove");
        else if (numero == 10 ) 
            JOptionPane.showMessageDialog(null,"Dez");
        else 
            JOptionPane.showMessageDialog(null,"Número Invalido");
    }
    
}
