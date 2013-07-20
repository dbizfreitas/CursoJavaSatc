/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabGrupo;

/**
 *
 * @author FACULDADE
 */
public class Categoria {
    String Categoria;
    Double Acrecimos;

    Categoria(String lançamento, double Acrecimo) {
        this.setCategoria(Categoria);
        this.setAcrecimos(Acrecimos);
        
    }

    public Double getAcrecimos() {
        return Acrecimos;
    }

    public void setAcrecimos(Double Acrecimos) {
        this.Acrecimos = Acrecimos;
    }
    
   
    

//    public void setAcrecimos(Double Acrecimos) {
//        this.Acrecimos = 1.0;
//
//       if (getCategoria().equals("Lançamento")) {
//            this.Acrecimos = 1.25;
//        } else {
//            if (getCategoria().equals("Super lançamento")) {
//            this.Acrecimos = 1.50;
//            }
//        }
//    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
    
    
    
}
