/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3;

import java.util.Scanner;

/**
 *
 * @author FACULDADE
 */
public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite a primeira nota:\n");
        double nota1 = ler.nextDouble();
        
        System.out.printf("Digite a segunda nota:\n");
        double nota2 = ler.nextDouble();
        
        System.out.printf("Digite a terceira nota:\n");
        double nota3 = ler.nextDouble();
        
        double media = nota1 + nota2 + nota3 /3;
        
        String teste = (media >= 6.0)? ":-)":":";
        
        
    }
    
}
