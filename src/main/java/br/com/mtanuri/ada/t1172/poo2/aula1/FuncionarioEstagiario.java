package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioEstagiario extends Funcionario{

    public FuncionarioEstagiario(String nome) {
        super(nome);
    }

    @Override
    public Double calculaSalario(){
        return 2.0;
    }
}
