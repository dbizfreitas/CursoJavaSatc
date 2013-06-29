

/* * To change this template, choose Tools | Templates * and open the template in the editor. */
package ExerciciosAula5;
/** * * @author Klaus Boeing */
class Data {
    int dia;
    int mes;
    int ano;
    String formatada(){
        return String.format("%s/%s/%s", dia, mes, ano);
    }
} 
