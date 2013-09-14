/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

/**
 *
 * @author FACULDADE
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    @Override
    public void atualiza(double taxa){
      this.saldo += this.saldo * taxa * 3;  
    }
    
   /* @Override
    public int compareTo(ContaPoupanca o) {
     if (this.getNumero()< o.getNumero()) {
         return -1;
     }
     if (this.getNumero() > o.getNumero()){
         return 1;
                 
     }
    return 0;
    }*/
    
   
    @Override
    public int compareTo(ContaPoupanca outra){
        return this.getNumero()- outra.getNumero();
    }
    
}
