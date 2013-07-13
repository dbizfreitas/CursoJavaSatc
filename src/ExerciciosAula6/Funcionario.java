/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosAula6;

/**
 *
 * @author FACULDADE
 */
public class Funcionario {
    String nome;
    Departamento departamento;
    private  Double salario;
    Data dataEntrada;
    String rg;

        
   
    void recebeAumento(Double valor){
        salario += valor;
    }

    Double calculaSalarioMensal(){
        return departamento.aplicaValorInsalubridade(salario);
    }        
    
    Double calculaGanhoAnual(){
        Double ferias = 0.;

    Double decimo13 = 0.;
    Double ganhoAnual = salario * 12 + ferias + decimo13;
    
    return ganhoAnual;
    }            
    
    public void mostra(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("Nome: ").append(nome).append("\n");
    sb.append("Departamento: ").append(departamento.nome).append("\n");
    sb.append("Salário: ").append(calculaSalarioMensal()).append("\n");

//        sb.append("Data Entrada (dia): ").append(dataEntrada.dia).append("\n");
//        sb.append("Data Entrada (mês): ").append(dataEntrada.mes).append("\n");
//        sb.append("Data Entrada (ano): ").append(dataEntrada.ano).append("\n");

    sb.append("Data Entrada formatada: ").append(dataEntrada.formatada()).append("\n");
    sb.append("RG: ").append(rg).append("\n");
    
    System.out.println(sb.toString());
    }
}