package br.com.mtanuri.ada.t1172.poo2.aula2.validadores;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;

import java.util.Locale;

public interface ValidacaoUsuario {

    void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException;

}