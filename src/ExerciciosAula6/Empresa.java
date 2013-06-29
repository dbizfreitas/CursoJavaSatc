/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula6;

/**
 *
 * @author FACULDADE
 */
public class Empresa {
    String nome;
    Funcionario[] funcionarios; 
    int contador;
    
    
    
    void adiciona(Funcionario f){
        if (funcionarios[contador] == null){
         funcionarios[contador]= f;
         contador++;
        }
    }

    
    void mostra(){
        if (funcionarios[contador]!= null){
        System.out.println(funcionarios[contador]);
        }
    
    }
        
}
    
   



