package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa {

    private String nome;
    private List<String> nomes = new ArrayList<>();

    // Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter de nomes
    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    // Método para adicionar o nome à lista
    public void adicionar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            nome = ""; // limpa o campo após adicionar
        }
    }
}