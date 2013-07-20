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
    String Midia;
    Double valor;
    private Filme filme; 
    
    Iten(int codBarras, String midia,Double valor, Filme filme) {
        setCodBarras(codBarras);
        setMidia(midia);
        this.valor = valor;
        this.filme = filme;
    }

    
       
      
    
    public int getCodBarras() {
        return codBarras;
    }

    private void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public String getMidia() {
        return Midia;
    }

    private void setMidia(String Midia) {
        this.Midia = Midia;
    }
    
    Double getValor(){
        return valor;
    }

    public Filme getFilme() {
        return filme;
    }
     
    void setValor() {
        Double porcentagem = 1.0;

         if (getMidia().equals("VHS") || getMidia().equals("DVD")) {
            this.valor = (2.5 * porcentagem);
        } else {
            this.valor = (3.5 * porcentagem);
        }
    }
}
