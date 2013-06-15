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

                System.out.println("Nome.: " + entry[i][0]); 
                System.out.println("Tel.: " + entry[i][1]); 
                System.out.println("Address.:" +entry[i][2]+"\n"); 

        }
    }
}
