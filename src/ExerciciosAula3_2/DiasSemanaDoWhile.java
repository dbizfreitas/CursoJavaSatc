/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_2;

/**
 *
 * @author FACULDADE
 */
public class DiasSemanaDoWhile {
    public static void main(String[] args) {
        String days[] = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
        
        int i = 0;
        do{
        
          System.out.println(days[i]);  
          i++;
        }while (i<=days.length-1);
    }
    
}
