/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Programa {
	public static void main(String[] args) {
	/*
	 * Deve ser conversado com o Klaus referente aos tratamentos dos erros para valores nulos 
	 * Falta adicionar os outros atributos que são meramentes cadastrais do tipo código de barra
	 * Validar as implementação com Klaus e seua ajustes
	 * */	
		
	Cliente cliente = new Cliente("Osmani");
	Filme filme = new Filme("A volta do que não foram","VHS", "Catalogo");
	Filme filme1 = new Filme("A longas tranças de um careca", "DVD","Lançamento");
	Filme filme2 = new Filme("De volta a ilha azul", "BlueRay", "Super lançamento");
		
	Locacao locacao = new Locacao();
	locacao.setCliente(cliente);
	locacao.adicionaFilme(filme);
	locacao.adicionaFilme(filme1);
	locacao.adicionaFilme(filme2);
	locacao.mostraLocacao();
        
	//locacao.mostraQuantidLocacoes();
	
	//para dar um espaço entre as locações
	System.out.println(" ");
	
	Cliente cliente1 = new Cliente("José");
	Filme filme3 = new Filme("Batman", "VHS","Catalogo");
	Filme filme4 = new Filme("SuperMan", "DVD","Lançamento");
	Filme filme5 = new Filme("Home aranha","BlueRay","Super lançamento" );
	
	Locacao locacao1 = new Locacao();	
	locacao1.setCliente(cliente1);
	locacao1.adicionaFilme(filme3);
	locacao1.adicionaFilme(filme4);
	locacao1.adicionaFilme(filme5);
	locacao1.mostraLocacao();
	//locacao1.mostraQuantidLocacoes();
	}
}
