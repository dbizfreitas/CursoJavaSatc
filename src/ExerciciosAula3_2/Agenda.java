/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula3_2;

/**
 *
 * @author FACULDADE
 */
public class Agenda {
    public static void main(String[] args) {
        String entry[][]= {
            {"Florence","735-1234","Manila"},
            {"Joyce","735-1234","Manila"},
            {"Becca","735-1234","Manila"}};
        
        for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry.length; j++) {
                System.out.println(entry[i][j]); 
            }
        }
    }
}
