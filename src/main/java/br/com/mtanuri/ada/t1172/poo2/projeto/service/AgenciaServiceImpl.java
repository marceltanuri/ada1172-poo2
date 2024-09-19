package br.com.mtanuri.ada.t1172.poo2.projeto.service;

import br.com.mtanuri.ada.t1172.poo2.projeto.model.Agencia;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.AgenciaRepository;

public class AgenciaServiceImpl extends AgenciaService{
    public AgenciaServiceImpl(AgenciaRepository agenciaRepository) {
        super(agenciaRepository);
    }

    @Override
    public void inserirAgencia(Agencia a) {
        // aqui as validações necessárias antes de salvar
        agenciaRepository.salvar(a);
    }
}
