/* * To change this template, choose Tools | Templates * and open the template in the editor. */
package ExerciciosAula6;
/** * * @author Klaus Boeing */
public class Departamento {
    
    String nome;
    
    Double percentualInsalubridade;
    
    Double valorBonus;
    
    Double aplicaValorInsalubridade(Double salario){
        return salario + (salario * (percentualInsalubridade /100 * 1)) + valorBonus;
    }
}