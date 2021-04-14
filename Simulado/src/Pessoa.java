
public class Pessoa {
    
    private String nome, endereco;
    private Data data;

    public Pessoa(String nome, String endereco, Data data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }
    
    public Pessoa(String nome, String endereco, int dia, int mes, int ano) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Data(dia,mes,ano);
    }

    public void imprime(){
        System.out.print(" " + nome +" Endereco: "+ endereco +"  Nasceu em ");
        data.imprime();
    } 
    
}
