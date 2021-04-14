package br.ufscar.dc.pc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author 743546
 */
public class Cadastro {

    private ArrayList<Pessoa> cadastro;
    private Pessoa aux;

    public Cadastro() {
        cadastro = new ArrayList<>();
    }

    public void adicionaPessoa(Pessoa p) {
        cadastro.add(p);
    }

    public void removePessoa(Pessoa p) {
        cadastro.add(p);
    }

    Pessoa obtemPessoa(String nome) {
        aux = null;
        for (Pessoa p : cadastro) {
            if (p.getNome().equals(nome)) {
                aux = p;
            }

        }
        return aux;
    }

    public void imprimeCadastro() {

        SortedSet<Pessoa> pessoas = new TreeSet<>(new Comparador());

        for (Pessoa p : cadastro) {
            pessoas.add(p);
        }

        for (Pessoa q : pessoas) {
            q.imprime();

        }
    }

}

class Comparador implements Comparator<Pessoa> {

    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
