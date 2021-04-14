
package br.ufscar.dc.pc;

/**
 * @author 743546
 */

public class Cliente extends Pessoa {
    
    private String CPF;

    public Cliente(String nome, String endereço, String CPF) {
        super(nome, endereço);
        this.CPF = CPF;
    }
    
    public void imprime(){
        System.out.println("Cliente: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("CPF: " + CPF);
    }
    
    
    
}
