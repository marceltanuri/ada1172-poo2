package br.com.mtanuri.ada.t1172.poo2.projeto.dataframework;

public interface CrudRepository <T, I> {

    T salvar(T obj);

    T deletar(T obj);

    T buscaPorId(I id);
}
