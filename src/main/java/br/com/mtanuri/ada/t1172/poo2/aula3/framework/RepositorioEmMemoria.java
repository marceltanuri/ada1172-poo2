package br.com.mtanuri.ada.t1172.poo2.aula3.framework;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEmMemoria<T> implements CRUDFramework<T>{

    List<T> list = new ArrayList<>();
    @Override
    public void salvar(T object) {
        list.add(object);
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void deletar() {
    }

    @Override
    public void getById() {
    }
}