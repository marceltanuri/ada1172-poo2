package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Devolucao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Locacao;

public interface DevolucaoService {
    Devolucao realizarDevolucao(Locacao locacao);
}
