package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model;

import java.util.Objects;

public class Agencia {

    private String nome;

    private Coordenadas localizacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenadas getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Coordenadas localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return Objects.equals(nome, agencia.nome) && Objects.equals(localizacao, agencia.localizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, localizacao);
    }
}
