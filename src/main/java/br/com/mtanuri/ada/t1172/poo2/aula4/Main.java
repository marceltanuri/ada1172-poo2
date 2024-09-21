package br.com.mtanuri.ada.t1172.poo2.aula4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> repositorioDeDadosAlunos = new ArrayList<>();
        repositorioDeDadosAlunos.add(new Aluno("Iago", "123456", "test@test.com"));
        imprime(repositorioDeDadosAlunos);
    }

    public static void imprime(List<Aluno> repositorioDeDadosAlunos){
        for(Aluno obj : repositorioDeDadosAlunos){
            System.out.println(obj);
        }
    }
}


