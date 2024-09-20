package br.com.mtanuri.ada.t1172.poo2.projeto.controller;

import br.com.mtanuri.ada.t1172.poo2.projeto.model.Agencia;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.AgenciaRepository;
import br.com.mtanuri.ada.t1172.poo2.projeto.service.AgenciaService;

public class AgenciaController {

    private AgenciaService agenciaService;

    public AgenciaController(AgenciaService agenciaService) {
        this.agenciaService = agenciaService;
    }

    public String novaAgencia(String json){
        Agencia agencia;
        // converter JSON para Agencia
        Agencia agenciaSalva = agenciaService.inserirAgencia(null);
        // converter Agencia para JSON
        return null;
    }

}
