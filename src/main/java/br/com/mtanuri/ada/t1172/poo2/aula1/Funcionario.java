package br.com.mtanuri.ada.t1172.poo2.aula1;

public class Funcionario {

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // dados
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // comportamento

    public Double calculaSalario(){
        return 0.0;
    }

}
