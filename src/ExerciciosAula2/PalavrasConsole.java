/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula2;

import java.util.Scanner;

/**
 *
 * @author FACULDADE
 */
public class PalavrasConsole {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
             
        System.out.printf("Informe a primeira palavra:\n");
        String palavra1 = ler.nextLine(); 
        
        System.out.printf("Informe a segunda palavra:\n");
        String palavra2 = ler.nextLine(); 
        
        System.out.printf("Informe a terceira palavra:\n");
        String palavra3 = ler.nextLine(); 
     
        System.out.println( palavra1 +" "+ palavra2 +" "+ palavra3 );
    }   
}
