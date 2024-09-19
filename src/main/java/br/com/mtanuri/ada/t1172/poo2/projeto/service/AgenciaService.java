package br.com.mtanuri.ada.t1172.poo2.projeto.service;

import br.com.mtanuri.ada.t1172.poo2.projeto.model.Agencia;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.AgenciaRepository;

public abstract class AgenciaService {

    protected final AgenciaRepository agenciaRepository;

    public AgenciaService(AgenciaRepository agenciaRepository) {
        this.agenciaRepository = agenciaRepository;
    }

    public abstract void inserirAgencia(Agencia a);

}
