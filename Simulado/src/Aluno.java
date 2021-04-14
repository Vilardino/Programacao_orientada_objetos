
public class Aluno extends Pessoa{
    private double nota;
    private String turma;

    public Aluno(double nota, String turma, String nome, String endereco, Data data) {
        super(nome, endereco, data);
        this.nota = nota;
        this.turma = turma;
    }

    public Aluno(double nota, String turma, String nome, String endereco, int dia, int mes, int ano) {
        super(nome, endereco, dia, mes, ano);
        this.nota = nota;
        this.turma = turma;
    } 
    
    public void imprime(){
        super.imprime();
        System.out.println(" Turma: " + turma + " Nota: " + nota);
    }
    
    
}
