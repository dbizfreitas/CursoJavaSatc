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
    Filme[] filme = new Filme[5];
    Iten[] iten = new Iten[5];
 
    Locacao() {
        contador++;
    }

    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private int buscaPosicaoVazia(Iten[] iten) {
        int i = 0;
        while (iten[i] != null) {
            i++;
        }
        return i;
    }

    private Iten[] getIten() {
        return iten;
    }

    private void setIten(int posicao, Iten iten) {
        this.iten[posicao] = iten ;
    }

    public void adicionaIten(Iten iten) {//convensão em singular
        setIten(buscaPosicaoVazia(getIten()), iten);
    }

    void mostraLocacao() {
        int i = 0;
        System.out.println("Cliente[" + getContador() + "]:" + cliente.getNome());
        while (iten[i] != null) {
            //o cliente.getnome é para identificar quais filmes sao de quais clientes
            System.out.println("Titulo.: "+ iten[i].getFilme().getNome() + " Valor.: " + iten[i].getValor());
            i++;
        }
    }

    Integer getContador() {
        return contador;
    }
}