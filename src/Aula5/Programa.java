/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author FACULDADE
 */
public class Programa {
   public static void main(String[] args) {
       Conta conta1 = new Conta();
       Conta conta2 = new Conta();
       conta1.dono = "João";
       conta1.saldo = 1000.0;
       conta2.dono = "Maria";
       conta2.saldo = 0.0;
       if (conta1.transfere(conta2, 1500.0)){
           System.out.println("Transferencia bem sucedida..");
       }else{
           System.out.println("Não tem saldo!!");
       }
       System.out.println(conta1.dono);
       System.out.println(conta1.saldo);
       System.out.println(conta2.dono);
       System.out.println(conta2.saldo);
   }
}
