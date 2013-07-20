/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Locacao {

    StringBuilder strBuilder;
    static Integer contador = 0;
    Cliente cliente = new Cliente();
    Filmes[] filme = new Filmes[5];

    Locacao() {
        contador++;
    }

    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private int buscaPosicaoVazia(Filmes[] filmes) {
        int i = 0;
        while (filmes[i] != null) {
            i++;
        }
        return i;
    }

    private Filmes[] getFilmes() {
        return filme;
    }

    private void setFilmes(int posicao, Filmes filmes) {
        filme[posicao] = filmes;
    }

    public void adicionaFilmes(Filmes filmes) {//convensão em singular
        setFilmes(buscaPosicaoVazia(getFilmes()), filmes);
    }

    void mostraLocacao() {
        int i = 0;
        System.out.println("Cliente[" + getContador() + "]:" + cliente.getNome());
        while (filme[i] != null) {
            //o cliente.getnome é para identificar quais filmes sao de quais clientes
            System.out.println("Funcionarios[" + cliente.getNome() + "]:" + filme[i].getNome() + "- Valor:" + filme[i].getValor());
            i++;
        }
    }

    Integer getContador() {
        return contador;
    }
}