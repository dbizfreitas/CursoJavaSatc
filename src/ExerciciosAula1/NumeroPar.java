/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula1;

import java.util.Scanner;
/**
 *
 * @author Freitas
 */
public class NumeroPar {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
       
        System.out.print("Entre com um numero.: ");
        
        int numero = ler.nextInt();
        String classif = (numero % 2 == 0)? "Par":"Impar";
        
        System.out.println("O número "+numero+ " é "+ classif);
          
    }
}
