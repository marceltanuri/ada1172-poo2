package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(String nome) {
        super(nome);
    }

    @Override
    public Double calculaSalario(){
        return 3.0;
    }
}
