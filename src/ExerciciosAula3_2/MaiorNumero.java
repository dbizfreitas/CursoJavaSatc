/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_2;

import javax.swing.JOptionPane;

/**
 *
 * @author FACULDADE
 */
public class MaiorNumero {
    public static void main(String[] args) {
        int numero[]=new int[10];
        int maior = 0; 
        for (int i = 0; i < 10; i++) {
           numero[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite a primeira nota.:"));
           
           while(maior < numero[i]){
                maior = numero[i];
            }        
        }
        
        System.out.println("O numero maior é.: "+maior);
    }
    
}
