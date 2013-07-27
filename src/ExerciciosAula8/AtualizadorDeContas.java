/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

/**
 *
 * @author FACULDADE
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c){
           
        System.out.println("Saldo ANTERIOR conta:"+c.getSaldo());
        c.atualiza(selic);
        
        System.out.println("Saldo ATUAL conta:"+c.getSaldo());
        System.out.println("");
    }
    
    
    
}
