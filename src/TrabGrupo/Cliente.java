/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Cliente {
    String nome;

public Cliente(){
}

public Cliente(String nome){
	setNome(nome);
}

String getNome() {
	return nome;
}

void setNome(String nome) {
	this.nome = nome;
}
    
}
