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
    Double valor;
    String midia;
    String categoria;

    Filme(String nome, String midia, String categoria) {
        setNome(nome);
        setMidia(midia);
        setCategoria(categoria);
        setValor();
    }

    private String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    String getMidia() {
        return midia;
    }

    void setMidia(String midia) {
        this.midia = midia;
    }

    Double getValor() {
        return valor;
    }

    void setValor() {
        Double porcentagem = 1.0;

        if (getCategoria().equals("Lançamento")) {
            porcentagem = 1.25;
        } else {
            if (getCategoria().equals("Super lançamento")) {
                porcentagem = 1.50;
            }
        }

        if (getMidia().equals("VHS") || getMidia().equals("DVD")) {
            this.valor = (2.5 * porcentagem);
        } else {
            this.valor = (3.5 * porcentagem);
        }
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}
