/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_2;

/**
 *
 * @author FACULDADE
 */
public class DiasSemanaWhile {
    public static void main(String[] args) {
        String days[] = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
        
        int i = 0;
        while (i<=days.length-1){
        
          System.out.println(days[i]);  
          i++;
        }
    }
}
