package br.com.mtanuri.ada.t1172.poo2.aula1;

public class FuncionarioFactory{

public static Funcionario newFuncionario(FuncionarioDTO funcionarioData){

    return switch (funcionarioData.tipo()){
        case 1 -> new FuncionarioEstagiario(funcionarioData.nome());
        case 2 -> new FuncionarioCLT(funcionarioData.nome());
        case 3 -> new FuncionarioGerente(funcionarioData.nome());
        case 4 -> new FuncionarioCLevel(funcionarioData.nome());
        default -> throw new IllegalArgumentException("Tipo de funcionário inválido.");
    };
}

}
