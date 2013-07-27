/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

/**
 *
 * @author FACULDADE
 */
public class ContaPoupanca extends Conta{
    
    @Override
    public void atualiza(double taxa){
      this.saldo += this.saldo * taxa * 3;  
    }
    
}
