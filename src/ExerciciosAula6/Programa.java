/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula6;

/**
 *
 * @author FACULDADE
 */
public class Programa {
    public static void main (String[]args){
        Funcionario carlos = new Funcionario();
        
        carlos.nome = "Carlos";
        carlos.salario = 1000.0;
        carlos.rg = "22339992-0";
       
        Departamento departamento = new Departamento();
        
        departamento.nome = "A";
        departamento.percentualInsalubridade = 10.0;
        departamento.valorBonus = 100.0;
        
        carlos.departamento = departamento;
        
        Data dataEntrada = new Data();
        
        dataEntrada.dia = 12;
        dataEntrada.mes = 6;
        dataEntrada.ano = 2013;
        
        carlos.dataEntrada = dataEntrada;
        
        carlos.mostra();
        
        System.out.println("---------EMPRESA------------"); 
        
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[10];
        
                
        Funcionario marlon = new Funcionario();
        marlon.nome = "Marlon";
        marlon.salario = 100.0;
        
        Funcionario fabio = new Funcionario();
        fabio.nome = "Fabio";
        fabio.salario = 520.0;
              
        empresa.adiciona(fabio);
        empresa.adiciona(marlon);
        
        empresa.mostra();
        
        System.out.println("---------------------"); 
        
        carlos.recebeAumento(200.0);
        
        carlos.mostra();
        
        
        
    }
    
}
