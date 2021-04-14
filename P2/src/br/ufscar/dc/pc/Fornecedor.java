package br.ufscar.dc.pc;

/**
 * @author 743546
 */
public class Fornecedor extends Pessoa {

    private String CNPJ;

    public Fornecedor(String nome, String endereço, String CNPJ) {
        super(nome, endereço);
        this.CNPJ = CNPJ;
    }

    public void imprime() {
        System.out.println("Cliente: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("CNPJ: " + CNPJ);
    }

}
