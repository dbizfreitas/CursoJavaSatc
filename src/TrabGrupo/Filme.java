/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Filme {

    String nome;
    
    

    Filme(String nome) {
        this.setNome(nome);
        
    }

    

//    void setValor() {
//
//        Double porcentagem = 1.0;
//
//        if (getCategoria().equals("Lançamento")) {
//            porcentagem = 1.25;
//        } else {
//            if (getCategoria().equals("Super lançamento")) {
//                porcentagem = 1.50;
//            }
//        }
//
//       
//    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}
