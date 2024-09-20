package br.com.mtanuri.ada.t1172.poo2.projeto.app;

import br.com.mtanuri.ada.t1172.poo2.projeto.controller.AgenciaController;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.AgenciaRepository;
import br.com.mtanuri.ada.t1172.poo2.projeto.repository.impl.AgenciaRepositoryInMemoryImpl;
import br.com.mtanuri.ada.t1172.poo2.projeto.service.AgenciaService;
import br.com.mtanuri.ada.t1172.poo2.projeto.service.AgenciaServiceImpl;

public class Main {

    public static void main(String[] args) {

        AgenciaRepository agenciaRespository = new AgenciaRepositoryInMemoryImpl();
        AgenciaService agenciaService = new AgenciaServiceImpl(agenciaRespository);
        AgenciaController controller = new AgenciaController(agenciaService);

        controller.novaAgencia("");

    }
}
