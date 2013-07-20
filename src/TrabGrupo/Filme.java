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


    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}
