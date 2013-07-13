
package TrabGrupo;

public class Filmes {
    private String midia;
    private String genero;
    private String categorias;
    private String titulo;
    private Integer codBarras;
    private double valor;
    

        
    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        if (categorias.equals("1")){
            categorias="1";
        } else if (categorias.equals("2")){
            categorias="2";
        } else if (categorias.equals("3")){
            categorias="3";
        } else categorias="1";
        this.categorias = categorias;
    }

    public Integer getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Integer codBarras) {
        this.codBarras = codBarras;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
          if(!midia.equals("1")|| !midia.equals(2)){
              midia = "1";
          }
          this.midia = midia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
