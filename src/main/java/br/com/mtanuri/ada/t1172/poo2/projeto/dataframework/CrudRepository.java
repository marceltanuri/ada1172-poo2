package br.com.mtanuri.ada.t1172.poo2.projeto.dataframework;

public interface CrudRepository <T, I> {

    T inserir(T obj);

    T alterar(T obj);

    T deletar(T obj);

    T buscaPorId(I id);

    T deletarPorId(I id);
}
