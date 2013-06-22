/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author FACULDADE
 */
public class Conta {
    Integer numero;
    String dono;
    Double saldo;
    Double limite;
    boolean saca(Double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    boolean transfere(Conta contaDestino, Double valor){
        if(saca(valor)){
            contaDestino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    void deposita(Double valor){
        saldo += valor;
    }
}