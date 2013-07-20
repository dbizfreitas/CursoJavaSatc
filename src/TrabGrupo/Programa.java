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
        Filme filme = new Filme("Batimam");
        Filme filme1 = new Filme("Supermam");
        Filme filme2 = new Filme("Homem aranha");
        TipoMidia tipoMidia = new TipoMidia("VHS",2.50);
        TipoMidia tipoMidia1 = new TipoMidia("DVD",3.50);
        TipoMidia tipoMidia2 = new TipoMidia("VHS",2.50);
        Categoria categoria = new Categoria("Lançamento",1.25);
        
        
	Iten iten = new Iten(111111111,tipoMidia,filme);
        Iten iten1 = new Iten(22222222,tipoMidia1,filme1);
	Iten iten2 = new Iten(33333333,tipoMidia2,filme2);
		
	Locacao locacao = new Locacao();
	locacao.setCliente(cliente);
	locacao.adicionaIten(iten);
	locacao.adicionaIten(iten1);
	locacao.adicionaIten(iten2);
	locacao.mostraLocacao();
        
	//locacao.mostraQuantidLocacoes();
	
	//para dar um espaço entre as locações
	System.out.println(" ");
	
	Cliente cliente1 = new Cliente("José");
        Filme filme3 = new Filme("Cavalo de Guerra");
        Filme filme4 = new Filme("Titanic");
        Filme filme5 = new Filme("Hooligans");
        TipoMidia tipoMidia3 = new TipoMidia("VHS",2.50);
        TipoMidia tipoMidia4 = new TipoMidia("DVD",3.50);
        TipoMidia tipoMidia5 = new TipoMidia("VHS",2.50);
        
	Iten iten3 = new Iten(111111111,tipoMidia3,filme3);
	Iten iten4 = new Iten(22222222,tipoMidia4,filme4);
	Iten iten5 = new Iten(33333333,tipoMidia5,filme5);
	
	Locacao locacao1 = new Locacao();	
	locacao1.setCliente(cliente1);
	locacao1.adicionaIten(iten3);
	locacao1.adicionaIten(iten4);
	locacao1.adicionaIten(iten5);
	locacao1.mostraLocacao();
	//locacao1.mostraQuantidLocacoes();
	}
}
