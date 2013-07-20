/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Iten {

    int codBarras;
    private Filme filme;
    private TipoMidia tipoMidia;

    Iten(int codBarras, TipoMidia tipoMidia, Filme filme) {
        this.codBarras = codBarras;
        this.filme = filme;
        this.tipoMidia = tipoMidia;
    }

    public TipoMidia geTipoMidia() {
        return tipoMidia;
    }

    public int getCodBarras() {
        return codBarras;
    }

    private void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public Filme getFilme() {
        return filme;
    }
}
