

// @author Guilherme Vilar Balduino 743546

public class Professor {
    
    private int num_ma;  //data de matricula
    private String nome_prof;  //nome do professor
    private String nome_dep;   //nome do departamento
    private Data adimi;  //data de admissao

    public Professor(int num_ma, String nome_prof, String nome_dep, Data adimi) {
        this.num_ma = num_ma;
        this.nome_prof = nome_prof;
        this.nome_dep = nome_dep;
        this.adimi = adimi;
    }

    public void imprime(){
        System.out.print("Nome: " + nome_prof + " Numero de matricula: " + num_ma + " Seu departamento é: " + nome_dep + " Data de adimissão: ");
        adimi.imprime();
        
        
        
        
    }
    
    
}