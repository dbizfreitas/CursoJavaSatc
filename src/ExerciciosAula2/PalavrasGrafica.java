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
public class PalavrasGrafica {
    public static void main(String[] args) {
        
        String palavra1 = JOptionPane.showInputDialog("Entre com a primeira palavra");
             
        String palavra2 = JOptionPane.showInputDialog("Entre com a segunda palavra");
        
        
        String palavra3 = JOptionPane.showInputDialog("Entre com a terceira palavra");
        
        String msg = palavra1 + " " + palavra2 +" "+ palavra3;
                
        JOptionPane.showMessageDialog(null,msg);
    }
}
