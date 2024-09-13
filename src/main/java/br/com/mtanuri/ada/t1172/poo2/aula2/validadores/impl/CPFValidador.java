package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;

public class CPFValidador {
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        throw new DadosUsuarioInvalidosException("O CPF é inválido.");
    }
}
