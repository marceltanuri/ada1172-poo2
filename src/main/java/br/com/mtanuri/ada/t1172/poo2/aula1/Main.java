package br.com.mtanuri.ada.t1172.poo2.aula1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FuncionarioDTO test = new FuncionarioDTO("Victor Faria", 3);





        List<FuncionarioDTO> funcionariosDB = new ArrayList<>();

        funcionariosDB.add(new FuncionarioDTO("Victor Faria", 3));



        funcionariosDB.add(new FuncionarioDTO("Marcel Tanuri", 1));

        funcionariosDB.add(new FuncionarioDTO("Luiz", 2));

        funcionariosDB.add(new FuncionarioDTO("Bianca", 4));

        funcionariosDB.forEach(funcionarioData -> {
                Funcionario f = FuncionarioFactory.newFuncionario(funcionarioData);
            System.out.printf("O funcionário %s, receberá salário de %s mil euros\n", f.getNome(), f.calculaSalario());

        });

    }
}
