package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioVip {

    public FuncionarioVip(Funcionario dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    Funcionario dadosPessoais;

    public Funcionario getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(Funcionario dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
