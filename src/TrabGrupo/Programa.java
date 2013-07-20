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
	Filmes filmes = new Filmes("A volta do que não foram","VHS", "Catalogo");
	Filmes filmes1 = new Filmes("A longas tranças de um careca", "DVD","Lançamento");
	Filmes filmes2 = new Filmes("De volta a ilha azul", "BlueRay", "Super lançamento");
		
	Locacao locacao = new Locacao();
	locacao.setCliente(cliente);
	locacao.adicionaFilmes(filmes);
	locacao.adicionaFilmes(filmes1);
	locacao.adicionaFilmes(filmes2);
	locacao.mostraLocacao();
	//locacao.mostraQuantidLocacoes();
	
	//para dar um espaço entre as locações
	System.out.println(" ");
	
	Cliente cliente1 = new Cliente("José");
	Filmes filmes3 = new Filmes("Batman", "VHS","Catalogo");
	Filmes filmes4 = new Filmes("SuperMan", "DVD","Lançamento");
	Filmes filmes5 = new Filmes("Home aranha","BlueRay","Super lançamento" );
	
	Locacao locacao1 = new Locacao();	
	locacao1.setCliente(cliente1);
	locacao1.adicionaFilmes(filmes3);
	locacao1.adicionaFilmes(filmes4);
	locacao1.adicionaFilmes(filmes5);
	locacao1.mostraLocacao();
	//locacao1.mostraQuantidLocacoes();
	}
}
