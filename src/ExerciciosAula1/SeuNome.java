package ExerciciosAula1;

import java.util.Scanner;

public class SeuNome {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
     
        System.out.printf("Informe um nome:\n");
        String nome = ler.nextLine(); 
     
        System.out.println("Welcome to the Java " +nome+ "!!!");   
   
    }
}
