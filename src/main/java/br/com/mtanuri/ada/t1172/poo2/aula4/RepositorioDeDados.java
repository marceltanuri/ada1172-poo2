package br.com.mtanuri.ada.t1172.poo2.aula4;

import java.util.ArrayList;
import java.util.List;

public interface RepositorioDeDados<T> {

      public T adiciona(T obj);

      public T atualiza(T obj);

      public void exclui(T obj);



}
