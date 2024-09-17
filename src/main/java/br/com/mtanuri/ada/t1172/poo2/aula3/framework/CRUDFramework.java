package br.com.mtanuri.ada.t1172.poo2.aula3.framework;

public interface CRUDFramework <T> {

    void salvar(T object);

    void atualizar();

    void deletar();

    void getById();

}


