package br.com.mtanuri.ada.t1172.poo2.projeto.repository;

import br.com.mtanuri.ada.t1172.poo2.projeto.dataframework.CrudRepository;
import br.com.mtanuri.ada.t1172.poo2.projeto.model.Agencia;

public interface AgenciaRepository extends CrudRepository<Agencia, Long> {

    Agencia buscaPorNome(String nome);

}
