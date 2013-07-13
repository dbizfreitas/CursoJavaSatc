package TrabGrupo;

public class Locacao {
    int contador;
    
    Filmes filmes = new Filmes();
    Cliente cliente = new Cliente();
    
    Filmes[] filme = new Filmes[10];
    Cliente[] clientes = new Cliente[10];
    
    //quantidade            
    
    void setDados(){
        cliente.setCpf("08856698833");
        cliente.setEndereco("Rua das dores");
        cliente.setNome("Xandão");
        cliente.setRg("1546");
        cliente.setTelefone("3334451125"); 
        
        filmes.setTitulo("Senhor dos aneis"); 
        filmes.setCategorias("Super Lançamento");
        filmes.setCodBarras(1233456);
        filmes.setGenero("aventura");
        filmes.setMidia("DVD");  
    }
    
   void setLocacao(){
       //filme ao cliente
       //locacao.cliente
       //locacao.filme
       
       //mostra locacao[contador].funcionarios
       

   }    
    
    void imprime(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("==============Locação============").append("\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Titulo: ").append(filmes.getTitulo()).append(" | Gênero: ").append(filmes.getGenero());
        
        System.out.println(sb.toString());
    }
}
