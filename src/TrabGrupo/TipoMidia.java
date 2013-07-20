/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class TipoMidia {
    String Midia;
    Double valor;

    public TipoMidia(String Midia, Double valor) {
        this.Midia = Midia;
        this.valor = valor;
    }
    
        

    public String getMidia() {
        return Midia;
    }

    public void setMidia(String Midia) {
        this.Midia = Midia;
    }

    public Double getValor() {
        return valor;
    }

//    public void setValor(Double valor) {
//        
//         if (getMidia().equals("VHS") || getMidia().equals("DVD")) {
//            this.valor = 2.5 ;
//        } else {
//            this.valor = 3.5 ;
//        }
//         
//    }
//    
    
}
