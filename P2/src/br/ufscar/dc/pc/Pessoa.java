package br.ufscar.dc.pc;

/**
 * @author 743546
 */
public abstract class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String endereço;

    public Pessoa(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public abstract void imprime();

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public int compareTo(Pessoa o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }

}
