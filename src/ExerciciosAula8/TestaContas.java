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
        cc.deposita(1000);
        cp.deposita(1000);
        
       // c.atualiza(0.01);
       // cc.atualiza(0.01);
       // cp.atualiza(0.01);
        
        AtualizadorDeContas Atd = new AtualizadorDeContas(0.01);
        
        
        
        Atd.roda(c);
        Atd.roda(cc);
        Atd.roda(cp);
        
        //System.out.println("conta:"+c.getSaldo());
        //System.out.println("conta corrente:"+cc.getSaldo());
        //System.out.println("conta poupança:"+cp.getSaldo());
    }
    
}
