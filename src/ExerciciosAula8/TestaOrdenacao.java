/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author FACULDADE
 */
public class TestaOrdenacao {
    public static void main (String[] args){
       List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
       
       ContaPoupanca c1 = new ContaPoupanca();
       c1.setNumero(1973);
       contas.add(c1);
       
       ContaPoupanca c2 = new ContaPoupanca();
       c1.setNumero(1462);
       contas.add(c2);
       
       ContaPoupanca c3 = new ContaPoupanca();
       c1.setNumero(1854);
       contas.add(c3);
       
       Collections.sort(contas);
       
        for (ContaPoupanca c: contas) {
            
            System.out.println(c);
        }
    }
    
}
