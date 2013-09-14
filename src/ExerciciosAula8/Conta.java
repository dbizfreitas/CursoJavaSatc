/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula8;

/**
 *
 * @author FACULDADE
 */
public class Conta {
    protected double saldo;
    protected int numero;

    public double getSaldo() {
        return saldo;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
        this.saldo += valor;
    }
    
    void atualiza(double taxa){
        this.saldo +=this.saldo*taxa;
    }    
    
}
