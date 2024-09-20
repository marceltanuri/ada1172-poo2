package br.com.mtanuri.ada.t1172.poo2.projeto.repository.impl;

import br.com.mtanuri.ada.t1172.poo2.projeto.model.Agencia;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.AgenciaRepository;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepositoryInMemoryImpl implements AgenciaRepository {

    private List<Agencia> dados = new ArrayList<>();
    @Override
    public Agencia inserir(Agencia obj) {
        // gerar um ID e atribuir o ID ao objeto
        dados.add(obj);
        return obj;
    }

    @Override
    public Agencia alterar(Agencia obj) {
        Agencia objetoParaAlteracao = dados.stream().filter(agencia -> agencia.getId()== obj.getId()).findFirst().get();

        // objetoParaAlteracao.nome = obj.nome


        return objetoParaAlteracao;
    }

    @Override
    public Agencia deletar(Agencia obj) {
        Agencia objetoParaAlteracao = dados.stream().filter(agencia -> agencia.getId()== obj.getId()).findFirst().get();
        dados.remove(objetoParaAlteracao);
        return null;
    }

    @Override
    public Agencia buscaPorId(Long id) {
        return null;
    }

    @Override
    public Agencia deletarPorId(Long id) {
        return null;
    }

    @Override
    public Agencia buscaPorNome(String nome) {
        return null;
    }
}
