package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioCLevel extends Funcionario{

    public FuncionarioCLevel(String nome) {
        super(nome);
    }

    @Override
    public Double calculaSalario(){
        return 4.0 + 1 * 45;
    }
}
