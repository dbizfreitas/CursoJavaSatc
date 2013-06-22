/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula5;

/**
 *
 * @author FACULDADE
 */
public class Funcionario {
    String nome;
    String departamento;
    Double salario;
    String data;
    String RG;
    
    void recebeAumento(double aumento){
      salario+=aumento;  
    }
    
    double calculaGanhoAnual(){
     salario = salario *12 ;
     return salario;
    }
    
    void mostra(){
        System.out.println("Nome.: " + nome);
        System.out.println("Salario.: " + salario);
        calculaGanhoAnual();
    }
    
}

