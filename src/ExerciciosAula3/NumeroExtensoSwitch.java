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
public class NumeroExtensoSwitch {
    public static void main(String[] args) {
        
        int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero.:"));
        
        switch (numero ){
            case 1:
                JOptionPane.showMessageDialog(null,"Um");
            case 2:
                JOptionPane.showMessageDialog(null,"Dois");
            case 3:
                JOptionPane.showMessageDialog(null,"Tres");
            case 4:
                JOptionPane.showMessageDialog(null,"Quatro");
            case 5:
                JOptionPane.showMessageDialog(null,"Cinco");
            case 6:
                JOptionPane.showMessageDialog(null,"Seis");
            case 7:
                JOptionPane.showMessageDialog(null,"Sete");
            case 8:
                JOptionPane.showMessageDialog(null,"Oito");
            case 9:
                JOptionPane.showMessageDialog(null,"Nove");
            case 10:
                JOptionPane.showMessageDialog(null,"Dez");
            default:
                JOptionPane.showMessageDialog(null,"Número Invalido");
        }
    }
    
}
