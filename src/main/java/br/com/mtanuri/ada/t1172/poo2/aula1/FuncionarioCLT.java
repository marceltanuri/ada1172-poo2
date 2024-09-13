package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome) {
        super(nome);
    }

    public Double calculaSalario(int i){
        return 1.0 / 365 * 2000;
    }
}
