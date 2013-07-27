/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

/**
 *
 * @author FACULDADE
 */
public class TestaContas {
    
    public static void main(String[] args){
        
        Conta c = new Conta();
        
        Conta cc = new ContaCorrente();
        
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        c.atualiza(0.01);
        System.out.println("conta:"+c.getSaldo());
        
        
        cc.deposita(1000);
        cc.atualiza(0.01);
        System.out.println("conta corrente:"+cc.getSaldo());
        
        cp.deposita(1000);
        cp.atualiza(0.01);
        System.out.println("conta poupança:"+cp.getSaldo());
        
    }
    
}
